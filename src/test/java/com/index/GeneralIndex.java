package com.index;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;
import com.verification.GeneralVerification;

public class GeneralIndex extends SeleniumInit {

	
    //To verify that all mandatory fields get the blank field validation message
	
	@Test(priority=0)
	
	public void blankfields() {
        
		int step=1;
		
		Common.logcase("To verify that all mandatory fields get the blank field validation message");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		if(generalVerification.blankfieldsvalidationmsg()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
			  
	}//end of function
	
	
	
	//To verify phone field get minimum length validation message
	
	@Test(priority=0)
	
	public void phonefield_minimum_length() {
		
        int step=1;
		
		Common.logcase("To verify phone field get minimum length validation message");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
			Common.logstep("Step "+ (step++) +". Enter Invalid Phone number(Less than 10 digits)");
			
			generalVerification = generalIndexpage.enterinvalidphonenumber();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.minimulengthvalidationmsg()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
				
	}//end of function
	
	
    //To verify password field get minimum length validation message
	
	@Test(priority=0)
	
	public void password_minimum_length() {
		
        int step=1;
		
		Common.logcase("To verify password field get minimum length validation message");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
			Common.logstep("Step "+ (step++) +". Enter Invalid password(Less than 8 characters)");
			
			generalVerification = generalIndexpage.enterinvalidpassword();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.passwordminimulengthvalidationmsg()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
				
	}//end of function
	
	
	//To verify that user gets the validation message while confirm password and password fields do not match
	
	@Test(priority=0)
	
	public void passwordnotmatch(){
		
        int step=1;
		
		Common.logcase("To verify that user gets the validation message while confirm password and password fields do not match");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter password(More than 7 characters)");
			
			generalVerification = generalIndexpage.enterpasswordnotmatch();
			
			Common.logstep("Step "+ (step++) +". Enter confirm password(not match with password)");
			
			generalVerification = generalIndexpage.enterconfirmpasswordnotmatch();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.passwordonotmatch()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
				
}//end of function
	
	
	//To verify that user gets the validation message for Invalid emailid
	
   @Test(priority=0)
	
	public void invalidemailid(){
		
	   
	    int step=1;
		
		Common.logcase("To verify that user gets the validation message for Invalid emailid");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter Invalid EmailId");
			
			generalVerification = generalIndexpage.enterinvalidemailid();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.invalidemailid()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
					
	}//end of function
	
	
	
	//To verify that user is able to register with all valid details
   
	@Test(priority=0)
	
	   public void allvaliddata(){
		
		
       int step=1;
		
		Common.logcase("To verify that user is able to register with all valid details");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter Valid First Name");
			
			generalVerification = generalIndexpage.enterfirstname();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Last Name");
			
			generalVerification = generalIndexpage.enterlastname();

			Common.logstep("Step "+ (step++) +". Select Marital Status");
			
			generalVerification = generalIndexpage.selectmaritalstatus();
			
            Common.logstep("Step "+ (step++) +". Select Hobby");
			
			generalVerification = generalIndexpage.selecthobby();
 
			Common.logstep("Step "+ (step++) +". Select Country");
			
			generalVerification = generalIndexpage.selectcountry();
			
            Common.logstep("Step "+ (step++) +". Select Date of Birth");
			
			generalVerification = generalIndexpage.selectdateofbirth();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Phone Number");
			
			generalVerification = generalIndexpage.enterphonenumber();
			
            Common.logstep("Step "+ (step++) +". Enter Valid User Name");
			
			generalVerification = generalIndexpage.enterusername();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Emailid");
			
			generalVerification = generalIndexpage.enteremailid();
			
            Common.logstep("Step "+ (step++) +". Select Your Profile Picture");
			
			generalVerification = generalIndexpage.selectyourprofilepic();
			
            Common.logstep("Step "+ (step++) +". Enter About YourSelf");
			
			generalVerification = generalIndexpage.enteraboutyourself();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Password");
			
			generalVerification = generalIndexpage.enterpassword();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Confirm Password");
			
			generalVerification = generalIndexpage.enterconfirmpassword();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.successfullregistration()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
			
	}//end of function
	
	
	//To verify that user get the validation message for exist username
	
	@Test(priority=0)
	
	public void usernamealreadyexist(){
		
		
        int step=1;
		
		Common.logcase("To verify that user get the validation message for exist username");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter Valid First Name");
			
			generalVerification = generalIndexpage.enterfirstname();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Last Name");
			
			generalVerification = generalIndexpage.enterlastname();

			Common.logstep("Step "+ (step++) +". Select Marital Status");
			
			generalVerification = generalIndexpage.selectmaritalstatus();
			
            Common.logstep("Step "+ (step++) +". Select Hobby");
			
			generalVerification = generalIndexpage.selecthobby();
 
			Common.logstep("Step "+ (step++) +". Select Country");
			
			generalVerification = generalIndexpage.selectcountry();
			
            Common.logstep("Step "+ (step++) +". Select Date of Birth");
			
			generalVerification = generalIndexpage.selectdateofbirth();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Phone Number");
			
			generalVerification = generalIndexpage.enterphonenumber();
			
            Common.logstep("Step "+ (step++) +". Enter Valid User Name");
			
			generalVerification = generalIndexpage.enterexistusername();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Emailid");
			
			generalVerification = generalIndexpage.enternotregisteremailid();
			
            Common.logstep("Step "+ (step++) +". Select Your Profile Picture");
			
			generalVerification = generalIndexpage.selectyourprofilepic();
			
            Common.logstep("Step "+ (step++) +". Enter About YourSelf");
			
			generalVerification = generalIndexpage.enteraboutyourself();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Password");
			
			generalVerification = generalIndexpage.enterpassword();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Confirm Password");
			
			generalVerification = generalIndexpage.enterconfirmpassword();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.usernamealreadyexist()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
			
		
		
	}//end of function
	
	
	//To verify that user get the validation message for already registered emailid
	
   @Test(priority=0)
	
	public void emailidalreadyexist(){
		
	   int step=1;
		
		Common.logcase("To verify that user get the validation message for already registered emailid");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter Valid First Name");
			
			generalVerification = generalIndexpage.enterfirstname();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Last Name");
			
			generalVerification = generalIndexpage.enterlastname();

			Common.logstep("Step "+ (step++) +". Select Marital Status");
			
			generalVerification = generalIndexpage.selectmaritalstatus();
			
           Common.logstep("Step "+ (step++) +". Select Hobby");
			
			generalVerification = generalIndexpage.selecthobby();

			Common.logstep("Step "+ (step++) +". Select Country");
			
			generalVerification = generalIndexpage.selectcountry();
			
           Common.logstep("Step "+ (step++) +". Select Date of Birth");
			
			generalVerification = generalIndexpage.selectdateofbirth();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Phone Number");
			
			generalVerification = generalIndexpage.enterphonenumber();
			
           Common.logstep("Step "+ (step++) +". Enter Valid User Name");
			
			generalVerification = generalIndexpage.enternotexistusername();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Emailid");
			
			generalVerification = generalIndexpage.enterregisteremailid();
			
           Common.logstep("Step "+ (step++) +". Select Your Profile Picture");
			
			generalVerification = generalIndexpage.selectyourprofilepic();
			
           Common.logstep("Step "+ (step++) +". Enter About YourSelf");
			
			generalVerification = generalIndexpage.enteraboutyourself();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Password");
			
			generalVerification = generalIndexpage.enterpassword();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Confirm Password");
			
			generalVerification = generalIndexpage.enterconfirmpassword();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.emailidalreadyregistered()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
			
	}//end of function
	

   //Toolsqa.com /Demosite/ Add product and checkout
   //To verify that user is able to checkout with all valid fields
   
   @Test
   
   public void purchaseorcheckout(){
	   
	   int step=1;
		
		Common.logcase("To verify that user is able to checkout with all valid fields ");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://toolsqa.com");
		
		Common.logstep("Step "+ (step++) +". click on Demo Sites Menu");
		
		generalVerification = generalIndexpage.click_on_demosites();
		
		Common.logstep("Step "+ (step++) +". click on E Commerce Demo site link");
		
		generalVerification = generalIndexpage.click_on_e_commerce_demosite();
		
        boolean tf = generalVerification.verifyhomepage_purchase();
		
        if(tf){
			
        	Common.log("--->  E Commerce Demo site Home page is opened  <---");
		}
		else
			Common.log("--->  E Commerce Demo site Home page is NOT opened  <---");
		
		
		Common.logstep("Step "+ (step++) +". Mouse Hover on Product Category");
		
		generalVerification = generalIndexpage.mousehoveron_product_category();
		
		Common.logstep("Step "+ (step++) +". Click on ipads link");
		
		generalVerification = generalIndexpage.clickonipads();
		
		Common.logstep("Step "+ (step++) +". Click on any product and open the product detail page");
		
		generalVerification = generalIndexpage.productdetails();
		
        Common.logstep("Step "+ (step++) +". Add product to the CART");
		
		generalVerification = generalIndexpage.addproducttocart();
		
		Common.logstep("Step "+ (step++) +". Open the Cart");
			
		generalVerification = generalIndexpage.openthecart();
		
		Common.logverification("Verify that product added to the cart");
		
		boolean tf1 = generalVerification.checkproductinthecart();
		
        if(tf1)			
    	   Common.log("---> Product is added to the cart <---");
		
		else
			Common.log("---> Product is not added to the cart <---");
       
        Common.logstep("Step "+ (step++) +". Update the quantity of the product from 1 to 2");
		
		generalVerification = generalIndexpage.updateproductquantity();
		
        Common.logstep("Step "+ (step++) +". Click on Update Button");
		
		generalVerification = generalIndexpage.clickonupdatebutton();
      		
		Common.logverification("Verify that the product quality has been updated in the cart");
		
		boolean tf11 = generalVerification.checkproductquanity();
		
        if(tf11)			
    	   Common.log("---> Product quantity is upadted into the cart <---");
		
		else
			Common.log("---> Product quantity is NOT upadted into the cart <---");
        
        Common.logstep("Step "+ (step++) +". Click on Continue Button");
		
		generalVerification = generalIndexpage.clickoncomtinuebutton();
		
        Common.logstep("Step "+ (step++) +". Enter Email Address in Billing Information");
		
		generalVerification = generalIndexpage.enteremailaddress();
        
		Common.logstep("Step "+ (step++) +". Enter Your billing/contact details");
		
		generalVerification = generalIndexpage.demo_enterfirstname();
		generalVerification = generalIndexpage.demo_enterelastname();
		generalVerification = generalIndexpage.demo_enteraddress();
		generalVerification = generalIndexpage.demo_enterecity();
		generalVerification = generalIndexpage.demo_enterestate_province();
		generalVerification = generalIndexpage.demo_entercountry();
		generalVerification = generalIndexpage.demo_enterpostalcode();
		generalVerification = generalIndexpage.demo_enterphonenumber();
		
	    Common.logstep("Step "+ (step++) +". Enter Shipping Address Information/Details");
			
		generalVerification = generalIndexpage.entershippingaddress();
		
		Common.logstep("Step "+ (step++) +". Click on Purchase Button");
		
		generalVerification = generalIndexpage.clickonpurchasebutton();
		
		
		if(generalVerification.purchaseverification()){
			   Common.logstep("Order placed successfully");
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else{
			   Common.logstep("Order is NOT placed successfully");
			   Common.logStatus("Fail");
			   Assert.assertTrue(false);
			
		}
		
		
	}//end of function
	
   //Thread and Shirts
   //To verify that user is able to add the product into the cart and do checkout with all valid fields 
   
	@Test(priority=0)
	public void addproducttocartandcheckout(){
		
		 int step=1;
			
			Common.logcase("To verify that user is able to add the product into the cart and do checkout with all valid fields ");

			Common.logcase("--------------------------------------------------------------------------");
			
			Common.logstep("Step "+ (step++) +". open : https://www.threadsandshirts.com/");
			
			 boolean tf = generalVerification.verifyhomepage_threadandshirts();
			 
			 if(tf)
				 Common.log("--> home page is opened <--");
			 else
				 Common.log("--> home page is not opened <--");
			 
			 Common.logstep("Step "+ (step++) +". Mouse hover over shop menu");
			 
			 generalVerification = generalIndexpage.mousehoveronshop();
			 
             Common.logstep("Step "+ (step++) +". Click on accessories");
			 
			 generalVerification = generalIndexpage.clickonaccessories();
			 
             Common.logstep("Step "+ (step++) +". Click on Product");
			 
			 generalVerification = generalIndexpage.clickonproduct();
			 
             Common.logstep("Step "+ (step++) +". Click on Add to cart button");
			 
			 generalVerification = generalIndexpage.clickonaddtocartbutton();
			 
             Common.logstep("Step "+ (step++) +". Click on continues shopping button");
			 
			 generalVerification = generalIndexpage.clickoncontinuesshoppingbutton();
			 
             Common.logstep("Step "+ (step++) +". Click on Add to cart button Again");
			 
			 generalVerification = generalIndexpage.clickonaddtocartbutton();
			 
             Common.logstep("Step "+ (step++) +". Click on CheckOut button");
			 
			 generalVerification = generalIndexpage.clickoncheckoutbutton();
		
             Common.logstep("Step "+ (step++) +". Enter Promotion Code");
			 
			 generalVerification = generalIndexpage.enterpromotioncode();
			 
             Common.logstep("Step "+ (step++) +". Click on Apply button");
			 
			 generalVerification = generalIndexpage.clickonapplybutton();
		
             Common.logstep("Step "+ (step++) +". Close the warning message");
			 
			 generalVerification = generalIndexpage.closethemessage();
			 
             Common.logstep("Step "+ (step++) +". Click on checkout as guest");
			 
			 generalVerification = generalIndexpage.clickonchechoutasguest();
			 
             Common.logstep("Step "+ (step++) +". Click on checkoutasguest button");
			 
			 generalVerification = generalIndexpage.clickonchechoutasguestbutton();
			 
             Common.logstep("Step "+ (step++) +". Enter First Name");
			 
			 generalVerification = generalIndexpage.enterfirstnamets();
			 
             Common.logstep("Step "+ (step++) +". Enter Last Name");
			 
			 generalVerification = generalIndexpage.enterLastnamets();
			 
             Common.logstep("Step "+ (step++) +". Enter Email Address");
			 
			 generalVerification = generalIndexpage.enteremailaddressts();
			 
             Common.logstep("Step "+ (step++) +". Enter Phone Number");
			 
			 generalVerification = generalIndexpage.enterphonenumberts();
			 
             Common.logstep("Step "+ (step++) +". Enter Address");
			 
			 generalVerification = generalIndexpage.enteraddressts();
			 
             Common.logstep("Step "+ (step++) +". Enter City");
			 
			 generalVerification = generalIndexpage.entercityts();
			 
             Common.logstep("Step "+ (step++) +". Select the Country");
			 
			 generalVerification = generalIndexpage.entercountryts();

			 Common.logstep("Step "+ (step++) +". Enter State");
			 
			 generalVerification = generalIndexpage.enterstatets();
			 
             Common.logstep("Step "+ (step++) +". Enter Postal Code");
			 
			 generalVerification = generalIndexpage.enterpostalcodets();

			 Common.logstep("Step "+ (step++) +". Shipping Address is same as Billing Address");
			 
			 generalVerification = generalIndexpage.billingandshippingsameclickts();
 
			 Common.logstep("Step "+ (step++) +". Click on continue Button");
			 
			 generalVerification = generalIndexpage.clickoncontinuebuttonts();
			 
             Common.logstep("Step "+ (step++) +". Click on continue Button of Shipping Options");
			 
			 generalVerification = generalIndexpage.clickoncontinuebuttonshippingoptionsts();
			 
             Common.logstep("Step "+ (step++) +". Click on Cash On Delivery Options");
			 
			 generalVerification = generalIndexpage.clickoncashondeliveryts();

			 Common.logstep("Step "+ (step++) +". Click on Submit My Order Button");
			 
			 generalVerification = generalIndexpage.clicksubmitmyorderbuttonts();
			 
			 
					
				if(generalVerification.orderplacedsuccessfully()){
					   Common.logstep("Order placed successfully");
					   Common.logStatus("Pass");
					   Assert.assertTrue(true);
				}
				else{
					   Common.logstep("Order is NOT placed successfully");
					   Common.logStatus("Fail");
					   Assert.assertTrue(false);
					
				}
					
	}//end of function
	
	//E-Signature
	//Login and Home page Verification
	
	@Test(priority=0)
	
	public void esign_loginwithvalidcredentials(){
		
        int step=1;
		
		Common.logcase("To verify that user is able to login with valid credentials");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : https://go-env-syd1.clickandsign.net:11443/dashboard/");
		
		boolean tf = generalVerification.verifyesignaturehomepage();
		
		if(tf){
			
			Common.log("--->  Home page is open  <---");
			
			Common.logstep("Step "+ (step++) +". Enter Username");
			
			generalVerification = generalIndexpage.esign_enterusername();
			
            Common.logstep("Step "+ (step++) +". Enter Password");
			
			generalVerification = generalIndexpage.esign_password();
			
			Common.logstep("Step "+ (step++) +". Click on Login Button");
				
			generalVerification = generalIndexpage.esign_clickonloginbutton();
			
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		if(generalVerification.esign_loginpageverification()){
			
			   Common.logstep("Logged in successfully!!");
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		   {   Common.logstep("Invalid password or Username!!");
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
		
}//end of function
	
@Test(priority=0)

public void esign_createpackage_borroweronly(){
	
	int step=1;
	
	Common.logcase("To verify that user is able to login with valid credentials");

	Common.logcase("--------------------------------------------------------------------------");
	
	Common.logstep("Step "+ (step++) +". open : https://go-env-syd1.clickandsign.net:11443/dashboard/");
	
	boolean tf = generalVerification.verifyesignaturehomepage();
	
	if(tf){

		   Common.log("--->  Home page is open  <---");
		   Common.logStatus("Pass");
		   Assert.assertTrue(true,"--->  Home page is open  <---");
		   
		   
	}
	else
	   {   Common.log("--->  Home page is not open  <---");
	       Common.logStatus("Fail");
	       Assert.assertTrue(false,"--->  Home page is not open  <---");
	  } 
		
	
		Common.logstep("Step "+ (step++) +". Enter Username");
		
		generalVerification = generalIndexpage.esign_enterusername();
		
        Common.logstep("Step "+ (step++) +". Enter Password");
		
		generalVerification = generalIndexpage.esign_password();
		
		Common.logstep("Step "+ (step++) +". Click on Login Button");
			
		generalVerification = generalIndexpage.esign_clickonloginbutton();
		
		if(generalVerification.esign_loginpageverification()){
			   Common.log("Logged in successfully!!");
			   Common.logStatus("Pass");
			   Assert.assertTrue(true,"Logged in successfully!!"); 
		}
		else
		   {   Common.log("Invalid password or Username!!");
			   Common.logStatus("Fail");
		       Assert.assertTrue(false,"Invalid password or Username!!");
		  } 
		
		Common.logstep("Step "+ (step++) +". Select the Workflow");
		generalVerification=generalIndexpage.esign_selectworkflow();
		Common.logstep("Step "+ (step++) +". Click on Create button");
		generalVerification=generalIndexpage.esign_clickoncreatebutton();
		
		Common.logstep("Step "+ (step++) +". Enter Package Reference");
		generalVerification=generalIndexpage.esign_enterpackagereference();
		
		Common.logstep("Step "+ (step++) +". Enter First Name");
		generalVerification=generalIndexpage.esign_enterfirstname();
		
		Common.logstep("Step "+ (step++) +". Enter Last Name");
		generalVerification=generalIndexpage.esign_enterlastname();
		
		Common.logstep("Step "+ (step++) +". Enter Email Address");
		generalVerification=generalIndexpage.esign_enteremailaddress();
		
		Common.logstep("Step "+ (step++) +". Enter Phone Number");
		generalVerification=generalIndexpage.esign_enterphonenumber();
		
		Common.logstep("Step "+ (step++) +". Select WAFR Attachments");
		generalVerification=generalIndexpage.esign_numberofducuments();
		
		Common.logstep("Step "+ (step++) +". Click on Create Button");
		generalVerification=generalIndexpage.esign_packagecreatebutton();
		
		Common.logstep("Step "+ (step++) +". Click on Cloud Service Agreement");
		generalVerification=generalIndexpage.esign_clickoncloudserviceaggrement();
		
		Common.logstep("Step "+ (step++) +". Upload the Cloud Service Agreement");
		generalVerification=generalIndexpage.esign_uploadagreement();
		
		Common.logstep("Step "+ (step++) +". Click on SendNow Button");
		generalVerification=generalIndexpage.esign_clickonsendnowbutton();
		
		Common.logstep("Step "+ (step++) +". Confirm the package with valid details");
		
		boolean referencetf=generalVerification.esign_packagenameverification();
		
		if(referencetf){
			   Common.log("--> Package Created Successfully!! <--");
			   Common.logStatus("Pass");
			   Assert.assertTrue(true); 
		}
		else
		   {   Common.log("--> package is not created!! <--");
			   Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
		
}//end of function
	

@Test(priority=0)

public void esign_createpackage_borrowerGuarantorRelashioshipmanager(){
	
	int step=1;
	
	Common.logcase("To verify that user is able to login with valid credentials");

	Common.logcase("--------------------------------------------------------------------------");
	
	Common.logstep("Step "+ (step++) +". open : https://go-env-syd1.clickandsign.net:11443/dashboard/");
	
	boolean tf = generalVerification.verifyesignaturehomepage();
	
	if(tf){

		   Common.log("--->  Home page is open  <---");
		   Common.logStatus("Pass");
		   Assert.assertTrue(true,"--->  Home page is open  <---");
		   
		   
	}
	else
	   {   Common.log("--->  Home page is not open  <---");
	       Common.logStatus("Fail");
	       Assert.assertTrue(false,"--->  Home page is not open  <---");
	  } 
		
	
		Common.logstep("Step "+ (step++) +". Enter Username");
		
		generalVerification = generalIndexpage.esign_enterusername();
		
        Common.logstep("Step "+ (step++) +". Enter Password");
		
		generalVerification = generalIndexpage.esign_password();
		
		Common.logstep("Step "+ (step++) +". Click on Login Button");
			
		generalVerification = generalIndexpage.esign_clickonloginbutton();
		
		if(generalVerification.esign_loginpageverification()){
			   Common.log("Logged in successfully!!");
			   Common.logStatus("Pass");
			   Assert.assertTrue(true,"Logged in successfully!!"); 
		}
		else
		   {   Common.log("Invalid password or Username!!");
			   Common.logStatus("Fail");
		       Assert.assertTrue(false,"Invalid password or Username!!");
		  } 
		
		Common.logstep("Step "+ (step++) +". Select the Workflow");
		generalVerification=generalIndexpage.esign_selectworkflow();
		Common.logstep("Step "+ (step++) +". Click on Create button");
		generalVerification=generalIndexpage.esign_clickoncreatebutton();
		
		Common.logstep("Step "+ (step++) +". Enter Package Reference");
		generalVerification=generalIndexpage.esign_enterpackagereference();
		
		Common.logstep("Step "+ (step++) +". Enter First Name");
		generalVerification=generalIndexpage.esign_enterfirstname();
		
		Common.logstep("Step "+ (step++) +". Enter Last Name");
		generalVerification=generalIndexpage.esign_enterlastname();
		
		Common.logstep("Step "+ (step++) +". Enter Email Address");
		generalVerification=generalIndexpage.esign_enteremailaddress();
		
		Common.logstep("Step "+ (step++) +". Enter Phone Number");
		generalVerification=generalIndexpage.esign_enterphonenumber();
		
		Common.logstep("Step "+ (step++) +". Select WAFR Attachments");
		generalVerification=generalIndexpage.esign_numberofducuments();
		
		Common.logstep("Step "+ (step++) +". Select Guarantor Option");
		generalVerification=generalIndexpage.esign_clickonGuarantoroption();
		
		Common.logstep("Step "+ (step++) +". Enter Guarantor First Name");
		generalVerification=generalIndexpage.esign_enterfirstnameGuarantor();
		
		Common.logstep("Step "+ (step++) +". Enter Guarantor Last Name");
		generalVerification=generalIndexpage.esign_enterlastnameGuarantor();
		
		Common.logstep("Step "+ (step++) +". Enter Guarantor Email Address");
		generalVerification=generalIndexpage.esign_enteremailaddressGuarantor();
		
		Common.logstep("Step "+ (step++) +". Enter Guarantor Phone Number");
		generalVerification=generalIndexpage.esign_enterphonenumberGuarantor();
		
		Common.logstep("Step "+ (step++) +". Select Relationship Manager Option");
		generalVerification=generalIndexpage.esign_clickonrelationshipmanageroption();
		
		Common.logstep("Step "+ (step++) +". Enter Relationship Manager First Name");
		generalVerification=generalIndexpage.esign_enterfirstnamerelationshipmanager();
		
		Common.logstep("Step "+ (step++) +". Enter Relationship Manager Last Name");
		generalVerification=generalIndexpage.esign_enterlastnamerelationshipmanager();
		
		Common.logstep("Step "+ (step++) +". Enter Relationship Manager Email Address");
		generalVerification=generalIndexpage.esign_enteremailaddressrelationshipmanager();
		
		Common.logstep("Step "+ (step++) +". Enter Relationship Manager Phone Number");
		generalVerification=generalIndexpage.esign_enterphonenumberrelationshipmanager();
		
		Common.logstep("Step "+ (step++) +". click on Relationship Manager required documents");
		generalVerification=generalIndexpage.esign_relationship_manager_ducuments();
		
		Common.logstep("Step "+ (step++) +". Click on Create Button");
		generalVerification=generalIndexpage.esign_packagecreatebutton();
		
		Common.logstep("Step "+ (step++) +". Click on Cloud Service Agreement");
		generalVerification=generalIndexpage.esign_clickoncloudserviceaggrement();
		
		Common.logstep("Step "+ (step++) +". Upload the Cloud Service Agreement");
		generalVerification=generalIndexpage.esign_uploadagreement();
		
		Common.logstep("Step "+ (step++) +". Click on SendNow Button");
		generalVerification=generalIndexpage.esign_clickonsendnowbutton();
		
		Common.logstep("Step "+ (step++) +". Confirm the package with valid details");
		
		boolean referencetf=generalVerification.esign_packagenameverification();
		
		if(referencetf){
			   Common.log("--> Package Created Successfully!! <--");
			   Common.logStatus("Pass");
			   Assert.assertTrue(true); 
		}
		else
		   {   Common.log("--> package is not created!! <--");
			   Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
		
}//end of function
	


	  
}//ends of class





