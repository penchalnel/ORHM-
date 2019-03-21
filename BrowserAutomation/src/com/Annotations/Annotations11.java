package com.Annotations;

import org.testng.annotations.Test;

public class Annotations11 {
	@Test
	public void applicationLaunch() 
	{
		System.out.println("Gmail Application Launch");
		
	}
	
	@Test(priority=0)
	public void inbox()
	{
		System.out.println("Gmail Inbox functionality testing");
	}
    @Test(priority=1)
    public void ComposeMail()
    {
    	System.out.println("Gmail ComposeMail functionality testing");
    }
    @Test(priority=2)
    public void Drafts()
    {
    	System.out.println("Gmail Drafts functionality testing");
    }

}
