package com.java.file.io;



import java.io.FileReader;
import java.util.Properties;


public class ReadPropertiesFileDemo {

	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("./src//test//resources//App.properties");
		Properties props =  new Properties();
		props.load(file);
		System.out.println(props.get("AppURL"));
		System.out.println(props.get("AppBrowser"));
		System.out.println(props.get("AppUserName"));
		System.out.println(props.get("AppPassword"));
		
		System.out.println(props.get("AppPassword_2")); //It prints null as the key is not there in the properties document
	}

}
