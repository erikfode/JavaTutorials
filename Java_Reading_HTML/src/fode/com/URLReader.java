package fode.com;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class URLReader {
    
	private static String URL;
	
	public static void main(String[] args) throws Exception {
		
		URL = "https://www.xataka.com.mx/";
		ReadOnBuffer(URL);
		ReadOnScanner(URL);
		
    }
	
	
	public static void ReadOnBuffer(String URL) throws IOException {
		URL oracle = new URL(URL);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) System.out.println(inputLine);
        in.close();
	}
	
	public static void ReadOnScanner(String URL) throws MalformedURLException, IOException {
		String content = null;
		URLConnection connection = null;
		connection =  new URL(URL).openConnection();
		Scanner scanner = new Scanner(connection.getInputStream());
		scanner.useDelimiter("\\Z");
		content = scanner.next();
		scanner.close();
		System.out.println(content);
	}
	
}