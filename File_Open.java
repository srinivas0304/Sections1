package Sections_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_Open {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\addla\\OneDrive\\Desktop\\A.properties";
		FileInputStream fs=new FileInputStream(path);
		Properties pro=new Properties();
		pro.load(fs);
		String s=pro.getProperty("URL");
		System.out.println(s);		
	}
}
