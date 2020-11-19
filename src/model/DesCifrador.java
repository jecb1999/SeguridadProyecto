package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class DesCifrador {
	
	public DesCifrador() {
		
	}
	
	public void processFile(boolean encrypt, File inputFile, String inputKey, File outputFile) throws Exception {
        byte[] output = new byte[16];
        String salt = output.toString();
        PBEKeySpec ks = new PBEKeySpec(inputKey.toCharArray(), salt.getBytes(), 1000, 128);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        SecretKey secret = new SecretKeySpec(skf.generateSecret(ks).getEncoded(), "AES");
        System.out.println(secret.toString());
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        if(encrypt) {
            cipher.init(Cipher.ENCRYPT_MODE,secret);
        }
        else {
            cipher.init(Cipher.DECRYPT_MODE,secret);
        }
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int)inputFile.length()];
        fileInputStream.read(inputBytes); 
        byte[] outputBytes = cipher.doFinal(inputBytes);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        fileOutputStream.write(outputBytes);
        fileInputStream.close();
        fileOutputStream.close();
    }

}
