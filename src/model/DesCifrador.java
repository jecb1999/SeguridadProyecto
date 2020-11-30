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

/**
 * Clase para cifrar o descifrar un archivo.
 */
public class DesCifrador {

	public DesCifrador() {

	}

	/**
	 * Procesa un archivo para cifrarlo o descifrarlo
	 * 
	 * @param encrypt    true si se debe cifrar, false en caso contrario.
	 * @param inputFile  Archivo a procesar.
	 * @param inputKey   Contraseña ingresada.
	 * @param outputFile Archivo de en el que se guardará el resultado del
	 *                   procesamiento.
	 * @throws Exception Si ocurre un prolema al leer el archivo de entrada o
	 *                   escribir en el archivo de salida.
	 */
	public void processFile(boolean encrypt, File inputFile, String inputKey, File outputFile) throws Exception {
		byte[] salt = new byte[16];
		PBEKeySpec ks = new PBEKeySpec(inputKey.toCharArray(), salt, 1000, 128);
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		SecretKey secret = new SecretKeySpec(skf.generateSecret(ks).getEncoded(), "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		if (encrypt) {
			cipher.init(Cipher.ENCRYPT_MODE, secret);
		} else {
			cipher.init(Cipher.DECRYPT_MODE, secret);
		}
		FileInputStream fileInputStream = new FileInputStream(inputFile);
		byte[] inputBytes = new byte[(int) inputFile.length()];
		fileInputStream.read(inputBytes);
		byte[] outputBytes = cipher.doFinal(inputBytes);
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
		fileOutputStream.write(outputBytes);
		fileInputStream.close();
		fileOutputStream.close();
	}

}
