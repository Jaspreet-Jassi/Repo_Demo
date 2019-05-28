package com.facebook.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//changes done today

public class TestBase
{
	public static WebDriver dr;
	public static Properties pr;
	
	public TestBase()
	{
	
	try
	{
		FileInputStream ip = new FileInputStream ("D:/jassi/com.facebook.test/src/main/java/com.configuration");
		pr =  new Properties();
		pr.load(ip);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	public static void initial()
	{
		System.setProperty(pr.getProperty("sysprop_1"), pr.getProperty("sysprop_2"));
		dr = new ChromeDriver();
		
		dr.get(pr.getProperty("url"));
		
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
}
