package com.facebook.testcases;
import com.facebook.pages.*;
import com.facebook.testbase.TestBase;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;

public class TestCases extends TestBase

{
	LoginPage oo;
	
	@BeforeSuite()
	public void method1()
	{		
			initial();
			oo=new LoginPage();
	}
	
	@Test()
	public void method2()
	{
		oo.login();
	}
	
	@AfterSuite()
	public void method3()
	{
		//dr.close();
	}

}
