package com.BangaloreFriend;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class StudentInfo {
	@Test
	public void studentTest()
	{
		Reporter.log("welcome",true);
		
	}
	@Test
	public void createCustTest()
	{
		Reporter.log("good morning",true);
	}
@Test
	public void deleteCustTest()
	{
	Reporter.log("delete customer",true);
	}
}
