package com.Annotations2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
	public void applicationlaunch()
	{
		System.out.println("Gmail Application Launch");	
	}
	@Test(priority=0)
	public void inbox()
	{
	System.out.println("Gmail inbox functionality testing");	
	}
	@Test(enabled=false)
	public void ComposeMail() {
		System.out.println("Gmail ComposeMail functionality testing");
	}
	@Test(priority=3)
	public void Drafts()
	{
		System.out.println("Gmail Drafts functionality testing");
	}
	@AfterTest
	public void ApplicationClose() {
		System.out.println("Gmail Application Close");

	}
	
	

}
