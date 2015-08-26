package com.obj.Utils;
import java.lang.reflect.Array;
import org.testng.Assert;
import org.testng.Reporter;
public class CustomVerification extends Assert  {

	public StringBuffer verificationErrors;
	
	public  boolean fail=false;

	public CustomVerification() 
	{
	 
	 verificationErrors = new StringBuffer();
	 
	}

	 public void verifyTrue(Boolean b, String msg) {
	  try {
	   Assert.assertTrue(b.booleanValue());
	  } catch (Error e) {

	   verificationErrors.append(msg+e);
	   Reporter.log(msg +"");
	  } 
	 }


	 public void verifyFalse(String msg, Boolean b) {
	  try {
	   Assert.assertFalse(b.booleanValue());
	  } catch (Error e) {

	   verificationErrors.append(msg+e);
	   Reporter.log(msg +"");
	  }
	 }
	 
	 public void verifyTrue(String elementDefinition, String elementLocator, Boolean b, String pageURL) {
	  try {
	   Assert.assertTrue(b.booleanValue());
	  } catch (Error e) {
	   verificationErrors.append(e);
	   Reporter.log("Verification failed for element: " +elementDefinition+ ",Element locator: " +elementLocator+ "On page: " +pageURL);
	  }
	 }
	 
	 public void verifyTrue(String elementDefinition, String elementLocator, boolean isElementPresent,
	   int actualElementCount, int expectedElementCount, String pageURL) {
	  
	  try {
	   Assert.assertTrue(isElementPresent);
	  } catch (Error e) {
	   verificationErrors.append(e);
	   Reporter.log("Verification failed for element: " +elementDefinition+ ",Element locator: " +elementLocator+ 
	     "On page: " +pageURL);
	  }
	  
	  try {
	   Assert.assertTrue(actualElementCount == expectedElementCount);
	  } catch (Error e) {
	   verificationErrors.append(e);
	   Reporter.log("Verification count failed for element: " +elementDefinition+ ",Element locator: " +elementLocator+
	     ", Expected Element Count: " +expectedElementCount+
	     ", while Actual Element Count: " +actualElementCount+
	     " On page: " +pageURL);
	  }  
	 }
	public  void verifyEquals(String msg, String actualValue, String expectedValue) {
	  try {
	   Assert.assertEquals(actualValue, expectedValue, msg);
	  } catch (Error e) {
	   verificationErrors.append(e);
	   Reporter.log(msg +"--Expected Values is"+expectedValue+"    "+"Actual values is "+actualValue);
	  }
	 }
	public  void verifyEquals(int actual, int expected, String msg) {
	   try {
	    Assert.assertEquals(actual, expected,msg);
	   } catch (Error e) {
	    verificationErrors.append(e);
	    Reporter.log(msg +"");
	   }
	  }

	 public void verifyEquals(String msg, Object obj1, Object obj2) {
	  try {
	   Assert.assertEquals(obj1, obj2);
	  } catch (Error e) {
	   verificationErrors.append(msg+e);
	   Reporter.log(msg +"");
	  }
	 }
	 
	 public void verifyNotEquals(String msg, Object obj1, Object obj2) {
	  try {
	   assertNotEquals(obj1, obj2);
	  } catch (Error e) {
	   verificationErrors.append(e);
	   Reporter.log(msg +"");
	  }
	 }

	 public void verifyEquals(String msg, String str1[], String str2[]) {
	  try {
	   Assert.assertEquals(str1, str2, msg);
	  } catch (Error e) {
	   verificationErrors.append(e);
	   Reporter.log(msg +"");
	  }
	 }

	 public void verifyEquals(Object str1[], Object str2[], String msg) {
	  try {
	   assertEquals(((Object) (str1)), ((Object) (str2)));
	  } catch (Error e) {
	   verificationErrors.append(e);
	   Reporter.log(msg +"");
	  }
	 }
	 
	 public void verifySame(Object[] expected,Object[] actual, String message){
	  
	  try{
	   
	  
	   assertEquals(actual, expected,  message);
	   
	  
	  }catch(Error e){
	  
	   verificationErrors.append(e);
	   
	   System.out.println(verificationErrors);
	   Reporter.log(message +"");
	  }
	 }
	 
	 public void clearVerificationErrors() {
	 // System.out.println("Size of the error"+verificationErrors.length());
	  verificationErrors = new StringBuffer();
	  
	 }

	 public void checkForVerificationErrors() {
	  String verificationErrorString = verificationErrors.toString();
	 
	  // Clear Verification Errors so that it is ready to test new verifications
	   
	     clearVerificationErrors();
	  if (!"".equals(verificationErrorString)){
		 fail=true;
	 
	   fail(verificationErrorString);
	 }}
	 public void verifyArrayEquals(Object[] actual, Object[] Expected, String message){
		 try{
			 assertArraySame(actual, Expected, message);
		 }catch(Error e){
			 verificationErrors.append(e);
		 }
	 }
	 private void assertArraySame(Object Expected, Object actual ,String msg){

			boolean flag=true;
			if(actual==null && Expected==null){
				return;
			}
			 int counter=0;
			String st="";
			if(Expected!=null){
			if(Expected.getClass().isArray()){
			int expectedlen=Array.getLength(actual);
			if(expectedlen==Array.getLength(Expected)){
				for (int i = 0; i < expectedlen; i++)
		        {
		          Object _actual = Array.get(actual, i);
		          Object _expected = Array.get(Expected, i);
		         
		          try
		          {
		           
		        	 if(! _actual.equals(_expected)){
		        		
		        		st= st+"Index Value "+i+" [Expected:: "+_expected.toString()+" && "+" Actual:: "+_actual.toString()+"],  ";
		        		 flag=false;
		        		 counter++;
		        		// System.out.println("expected"+_actual +"  "+_expected);
		        	 }
			}catch(Exception e){
				System.err.print(e);
			
				}
			}
			
		}else{
			fail("Array are not same ");
		}
			if(!flag){
				try{
					
				throw new AssertionError();
				}catch(AssertionError ae){
					
			System.out.println( "total no of value mismatched"+counter);
					fail("Value mismathced:-"+"("+counter+")"+st);
				}	
			}
		}
			if(Expected.equals(actual)){
				return;
			}
			}
		
		}
		
	}
