package com.odoo.automation.utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.odoo.automation.testBase.TestBase;



public class ListenerSetUp extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("exucution get startes" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		CommonMethod.capture_screenshot(result.getName());
		System.out.println("exucution completed" + result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		CommonMethod.capture_screenshot(result.getName());
		System.out.println("exucution failled" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("exucution skipped " + result.getName());
	}

	
	


	
	
	
//	package com.odoo.automation.utility;
//
//	import org.testng.ITestListener;
//	import org.testng.ITestResult;
//
//	import com.odoo.automation.testBase.TestBase;
//
//
//
//	public class ListenerSetUp extends TestBase implements ITestListener {
//
//
//
//		@Override
//		public void onTestStart(ITestResult result) {
//			 
//			System.out.println("exucution get startes" + result.getName());
//		}
//
//		@Override
//		public void onTestSuccess(ITestResult result) {
//		
//			System.out.println("exucution completed" + result.getName());
//		}
//
//		@Override
//		public void onTestFailure(ITestResult result) {
//			 
//			CommonMethod.capture_screenshot(result.getName());
//			System.out.println("exucution failled" + result.getName());
//		}
//
//		@Override
//		public void onTestSkipped(ITestResult result) {
//			
//			System.out.println("exucution skipped " + result.getName());
//		}
//
//		
//		
//		
//
//		
//	}


	
}
