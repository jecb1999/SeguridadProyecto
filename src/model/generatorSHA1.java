package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

public class generatorSHA1 {
	
	public generatorSHA1() {
		
	}
	
	public  File FileSHA1( File file, String nombre ) throws IOException{
	    String sha1 = null;
	    MessageDigest digest;
	    File outFile = new File(nombre);
	    try{
	        digest = MessageDigest.getInstance( "SHA-1" );
	    }
	    catch ( NoSuchAlgorithmException e1 )
	    {
	        throw new IOException( "Impossible to get SHA-1 digester", e1 );
	    }
	    try (InputStream input = new FileInputStream( file );
	         DigestInputStream digestStream = new DigestInputStream( input, digest ) )
	    {
	        while(digestStream.read() != -1){
	            
	        }
	        MessageDigest msgDigest = digestStream.getMessageDigest();
	        sha1 = new HexBinaryAdapter().marshal( msgDigest.digest() );
	        BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
	        bw.write(sha1);
	        bw.close();
	        
	    }
	    return outFile;
	}
	
	public  String StringSHA1( File file ) throws IOException{
	    String sha1 = null;
	    MessageDigest digest;
	    try{
	        digest = MessageDigest.getInstance( "SHA-1" );
	    }
	    catch ( NoSuchAlgorithmException e1 )
	    {
	        throw new IOException( "Impossible to get SHA-1 digester", e1 );
	    }
	    try (InputStream input = new FileInputStream( file );
	         DigestInputStream digestStream = new DigestInputStream( input, digest ) )
	    {
	        while(digestStream.read() != -1){
	            
	        }
	        MessageDigest msgDigest = digestStream.getMessageDigest();
	        sha1 = new HexBinaryAdapter().marshal( msgDigest.digest() );
	               
	    }
	    return sha1;
	}
	
	 public String txtToStiring(File file)  {
	        String linea = "";
	        String out = "";
	        StringBuilder cadena = new StringBuilder();
	        FileReader f;
			try {
				f = new FileReader(file);
				  BufferedReader b = new BufferedReader(f);
			        while((linea = b.readLine())!=null) {
			        	cadena.append(linea);
			        }
			        out = cadena.toString();
			        b.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	        return out;
	    }

}
