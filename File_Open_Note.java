package Sections_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_Open_Note {
	public static void main(String[] args) throws IOException {
		String path="C:\\Selenium\\Selenium Note\\B.properties";
		FileInputStream fs=new FileInputStream(path);
		Properties p=new Properties();
		p.load(fs);
		String s=p.getProperty("Url");
		System.out.println(s);
	}
}
