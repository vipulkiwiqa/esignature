package com.indexpage;
import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.init.AbstractPage;
import com.init.Common;
import com.utility.TestData;
import com.verification.GeneralVerification;

public class GeneralIndexpage extends AbstractPage {

	public GeneralIndexpage(WebDriver driver) {
		super(driver);
	}

	//Variables
	
	String root=null;
	
	public static String productname= null;
	
	public static String packagereference=null;
	public static String firstname=null;
	public static String lastname=null;
	
	public static int numberofdocuments;
	//profile picture path
	
	
	
    //XPATH for all Registration Form Fields
	
	@FindBy (xpath = "//input[@name='first_name']") private WebElement first_name_txt;
	
	@FindBy (xpath ="//input[@name='last_name']") private WebElement last_name_txt;
	
	@FindBy (xpath="//ul/li[2]/div/div[@class='radio_wrap']/input" ) private List<WebElement> marital_status;
	
	@FindBy (xpath = "//ul/li[3]/div/div[@class='radio_wrap']/input") private List<WebElement> hobby;
	
	@FindBy (xpath="//select[@id='dropdown_7']") private WebElement country;
	
	@FindBy (xpath="//select[@id='dropdown_7']/option") private List<WebElement> option_country;
	
	@FindBy (xpath = "//select[@id='dd_date_8']") private WebElement birth_day;
	
	@FindBy (xpath = "//select[@id='dd_date_8']/option") private List<WebElement> option_birth_day;
	
	@FindBy (xpath="//select[@id='mm_date_8']") private WebElement birth_month;
	
	@FindBy (xpath="//select[@id='mm_date_8']/option") private List<WebElement> option_birth_month;
	
	@FindBy (xpath="//select[@id='yy_date_8']") private WebElement birth_year;
	
	@FindBy (xpath="//select[@id='yy_date_8']/option") private List<WebElement> option_birth_year;
	
	@FindBy(xpath=".//input[@id='phone_9']") private WebElement phone_no;
	
	@FindBy (xpath="//input[@id='username']") private WebElement username;
	
	@FindBy (xpath="//input[@id='email_1']")private WebElement email;
	
	@FindBy (xpath="//input[@id='profile_pic_10']") private WebElement yourprofile_picture;
	
	@FindBy(xpath = "//textarea[@name='description']") private WebElement aboutyourself;
	
	@FindBy  (xpath=".//input[@id='password_2']") private WebElement password_txt;
	
	@FindBy (xpath=".//input[@id='confirm_password_password_2']") private WebElement confirm_password_txt;
	
	@FindBy(xpath = ".//input[@name='pie_submit']")	private WebElement submit_btn;
	
	
	 
	//Demo sites
	
	@FindBy (xpath="//span/span/span[contains(text(),'DEMO SITES')]") private WebElement demosites;
	
	@FindBy(xpath="//span/span/span[contains(text(),'E-Commerce Demo Site')]") private WebElement e_commerce_demo_site;
	
	@FindBy (xpath="//a[contains(text(),'Product Category')]") private WebElement mousehoveron_product_category;
	
	@FindBy (xpath="//a[contains(text(),'iPads')]") private WebElement ipads;
	
	@FindBy (xpath="//a[contains(text(),'Apple iPad 2 16GB, Wi-Fi, 9.7in – Black')]") private WebElement clickon_apple_product;
	
	@FindBy (xpath="//input[@value='Add To Cart']") private WebElement addproducttocart;
	
	@FindBy (xpath="//em[contains(text(),'item')]") private WebElement opencart;
	
	@FindBy (xpath="//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]") private WebElement updatequantity;
	
	@FindBy (xpath="//span[contains(text(),'Continue')]") private WebElement clickoncontinue;
	
	@FindBy(xpath="//input[@title='billingemail']") private WebElement emailaddress;
	
	@FindBy (xpath="//input[@title='billingfirstname']") private WebElement demo_firstname;
	
	@FindBy(xpath="//input[@title='billinglastname']")private WebElement demo_lastname;
	
	@FindBy (xpath="//textarea[@title='billingaddress']")private WebElement demo_address;
	
	@FindBy (xpath="//input[@title='billingcity']")private WebElement demo_city;
	
	@FindBy (xpath="//input[@title='billingstate']")private WebElement demo_state_province;
	
	@FindBy(xpath="//select[@title='billingcountry']")private WebElement demo_country;
	
	@FindBy (xpath="//input[@title='billingpostcode']")private WebElement demo_postalcode;
	
	@FindBy (xpath="//input[@title='billingphone']")private WebElement demo_phonenumber;
	
	@FindBy (xpath="//input[@id='shippingSameBilling']")private WebElement demo_shipping_address;
	
	@FindBy(xpath="//input[@class='make_purchase wpsc_buy_button']")private WebElement demo_clickonpurchase_button;
	
	@FindBy(xpath="//input[@value='Update']")private WebElement click_on_update;
	
	//Thread and Shirts
	
	@FindBy(xpath="//a[contains(text(),'SHOP')]")private WebElement shop;
	
	@FindBy (xpath="//a/strong[contains(text(),'Accessories')]")private WebElement accessories;
	
	@FindBy(xpath="//a[contains(text(),'Black Dobby')]")private WebElement product;
	
	@FindBy(xpath="//div[1]/div/button[contains(text(),'Add to cart')]")private WebElement addtocartbutton;
	
	@FindBy(xpath="//*[@id='top']/div[8]/div/div[2]/div[1]/button")private WebElement continueshoppingbutton;
	
	@FindBy(xpath="//*[@id='top']/div[8]/div/div[2]/div[2]/a")private WebElement CheckOutbutton;
	
	@FindBy(xpath="//input[@id='coupon_field']")private WebElement promotioncode;
	
	@FindBy(xpath="//td/form/div/span/button")private WebElement clickonapply;
	
	@FindBy(xpath="//div//button[text()='×']")private WebElement closemessage;
	
	@FindBy(xpath="//label//input[@id='checkout_type_guest']")private WebElement clickoncheckoutasguest;
	
	@FindBy(xpath="//button[contains(text(),'Checkout as guest')]")private WebElement clickoncheckoutasguestbutton;
	
	@FindBy(xpath="//input[@name='user_data[b_firstname]']")private WebElement firstname_ts;
	
	@FindBy(xpath="//input[@name='user_data[b_lastname]']")private WebElement lastname_ts;
	
	@FindBy(xpath="//div//div[3]//input[@name='user_data[email]']")private WebElement emailaddress_ts;
	
	@FindBy(xpath="//input[@name='user_data[b_phone]']")private WebElement phonenumber_ts;
	
	@FindBy(xpath="//input[@name='user_data[b_address]']")private WebElement address_ts;
	
	@FindBy(xpath="//input[@name='user_data[b_city]']")private WebElement city_ts;
	
	@FindBy(xpath="//select[@name='user_data[b_country]']")private WebElement country_ts;
	
	@FindBy(xpath="//input[@name='user_data[b_state]']")private WebElement state_ts;
	
	@FindBy(xpath="//input[@name='user_data[b_zipcode]']")private WebElement postalcodets;
	
	@FindBy(xpath="//input[@id='sw_sa_suffix_yes']")private WebElement billingandshippingsameclickts;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")private WebElement clickoncontinuebuttonts;
	
	@FindBy(xpath="//strong[contains(text(),'Cash On Delivery')]/..//input")private WebElement cashondeliveryts;
	
	@FindBy(xpath="//button[contains(text(),'Submit my order')]")private WebElement submitmyorderbuttonts;
	
	//E-Signature
	//Login
	@FindBy(xpath="//input[@name='username']")private WebElement username_esign;
	@FindBy(xpath="//input[@name='password']")private WebElement password_esign;
	@FindBy(xpath="//button[@title='login']")private WebElement login_esign;
	//Select the workflow and create the package
	@FindBy(xpath="//select[@id='workflows']")private WebElement selectworkflow_esign;
	//IBM Digital Contracts Demo v. 1
	@FindBy(xpath="//button[@title='create']")private WebElement createbutton_esign;
	
	//Borrower
	
	@FindBy(xpath="//input[@id='packageReference']")private WebElement packagereference_esign;
	
	@FindBy(xpath="//label[contains(text(),'First Name*')]/../input[position()<last()-2]")private WebElement firstname_esign;
	@FindBy(xpath="//label[contains(text(),'Last Name*')]/../input[position()=last()-2]")private WebElement lastname_esign;
	@FindBy(xpath="//label[contains(text(),'Last Name*')]/../input[position()=last()-1]")private WebElement emailaddress_esign;
	@FindBy(xpath="//label[contains(text(),'Last Name*')]/../input[position()=last()]")private WebElement mobile_esign;
	
	@FindBy(xpath="//span[contains(text(),'Transfer of Land')]/..//input")private List<WebElement> numberofdocuments_esign;
	@FindBy(xpath="//span/button[@title='create']")private WebElement packagecreatebutton;
	
	@FindBy(xpath="//div//span[contains(text(),'Cloud Services Agreement')]/../input")private WebElement cloudserviceaggrement_esign;
	@FindBy(xpath="//input[@type='file']")private WebElement uploadtheaggreement_esign;
	@FindBy(xpath="//button[@id='sendPackage']")private WebElement clickonsendnowbutton_esign;
	
	//Guarantor
	
	@FindBy(xpath="//span[contains(text(),'Guarantor 1:')]/..//input")private WebElement clickonguarantor_esign;
	@FindBy(xpath="//form//span[2]//label[contains(text(),'First Name*')]/..//input[position()=last()-3]")private WebElement firstname_Guarantor_esign;
	@FindBy(xpath="//form//span[2]//label[contains(text(),'First Name*')]/..//input[position()=last()-2]")private WebElement lastname_Guarantor_esign;
	@FindBy(xpath="//form//span[2]//label[contains(text(),'First Name*')]/..//input[position()=last()-1]")private WebElement emailaddress_Guarantor_esign;
	@FindBy(xpath="//form//span[2]//label[contains(text(),'First Name*')]/..//input[position()=last()]")private WebElement mobilenumber_Guarantor_esign;	
	
	//Relationship Manager
	@FindBy(xpath="//span[contains(text(),'Relationship Manager:')]/..//input")private WebElement clickonrelationshipmanager_esign;
	@FindBy(xpath="//form//span[3]//label[contains(text(),'First Name*')]/..//input[position()=last()-3]")private WebElement firstname_relationshipmanager_esign;
	@FindBy(xpath="//form//span[3]//label[contains(text(),'First Name*')]/..//input[position()=last()-2]")private WebElement lastname_relationshipmanager_esign;
	@FindBy(xpath="//form//span[3]//label[contains(text(),'First Name*')]/..//input[position()=last()-1]")private WebElement emailaddress_relationshipmanager_esign;
	@FindBy(xpath="//form//span[3]//label[contains(text(),'First Name*')]/..//input[position()=last()]")private WebElement mobilenumber_relationshipmanager_esign;	
	@FindBy(xpath="//*[@id='361b4b11-bab3-4ee1-8ed0-50896313c700section']/span/span[1]/input")private WebElement document_relationshipmanager_esign;
	
	
	
public GeneralVerification submit_click() {
	// TODO Auto-generated method stub
	
	submit_btn.click();
	return new GeneralVerification(driver);
}




public GeneralVerification enterinvalidphonenumber() {
	// TODO Auto-generated method stub
	
	phone_no.click();
	
	String invalidphonenumber = TestData.invalidphonenumber();
	
	Common.log("--->Enter Invalid Phone Number = "+invalidphonenumber+ " <---");
	
	phone_no.sendKeys(invalidphonenumber);
	
	return new GeneralVerification(driver);
}



public GeneralVerification enterinvalidpassword() {
	// TODO Auto-generated method stub
	password_txt.click();
	
    String invalidpassword = TestData.invalidpassword();
	
	Common.log("--->Enter Invalid Password = "+invalidpassword+ " <---");
	
	password_txt.sendKeys(invalidpassword);
	
	return new GeneralVerification(driver);
}



public GeneralVerification enterpasswordnotmatch() {
	// TODO Auto-generated method stub
    password_txt.click();
	
    String password = TestData.donotmatchpassword();
	
	Common.log("--->Enter Password = "+password+ " <---");
	
	password_txt.sendKeys(password);
	
	return new GeneralVerification(driver);
}



public GeneralVerification enterconfirmpasswordnotmatch() {
	// TODO Auto-generated method stub
	
	confirm_password_txt.click();
	
    String password = TestData.donotmatchconfirmpassword();
	
	Common.log("--->Enter Confrim Password(do not match with password) = "+password+ " <---");
	
	confirm_password_txt.sendKeys(password);
	
	return new GeneralVerification(driver);
}

public GeneralVerification enterinvalidemailid() {
	// TODO Auto-generated method stub
	
	 email.click();
	 
	 String invalidemailid = TestData.invalidemailid();
	 
	 Common.log("--->Enter Invalid Emailid = "+invalidemailid+" <---");
	 
	 email.sendKeys(invalidemailid);
	
	return new GeneralVerification(driver);
}

public GeneralVerification enterfirstname() {
	// TODO Auto-generated method stub
	   
	   first_name_txt.click();
	   
	   String firstname = TestData.firstname();
	   
	   Common.log("--->Enter Invalid Emailid = "+firstname+" <---");
	   
	   first_name_txt.sendKeys(firstname);
	   
	   return new GeneralVerification(driver);
}

public GeneralVerification enterlastname() {
	// TODO Auto-generated method stub
	
	   last_name_txt.click();
	   
	   String lastname = TestData.lastname();
	   
	   last_name_txt.sendKeys(lastname);
	   
	   Common.log("--->Enter Invalid Emailid = "+lastname+" <---");
	   
	   return new GeneralVerification(driver);
}

public GeneralVerification selectmaritalstatus() {
	// TODO Auto-generated method stub
	
	   String value="value";
	   
	   for(WebElement status : marital_status){
		   
		   if(status.getAttribute(value).trim().equals("married"))
			   
		   status.click();
		   
		   Common.log("--->Selected Maritalstatus = "+status.getAttribute(value).trim()+" <---");
		   
		   Common.pause(2);
	   }
	
	 return new GeneralVerification(driver);
}

public GeneralVerification selecthobby() {
	// TODO Auto-generated method stub
	
	 String value="value";
	 
	for(WebElement hobby_status : hobby){
		   
		    hobby_status.click();
			
			Common.log("--->Selected Hobby = "+hobby_status.getAttribute(value).trim()+" <---");
			
			Common.pause(2);
	 }
	
	return new GeneralVerification(driver);
}





public GeneralVerification selectcountry() {
	// TODO Auto-generated method stub
	

    Select country_dropdown= new Select(country);
    
    for(int i=0;i<option_country.size();i++)
    {
  	 if(i<3){
  		 
  		 country_dropdown.selectByIndex(i);
  	      
  	      Common.pause(2);
  	 }
    
  	 else
  		 break;
    
    }
    
   country_dropdown.selectByVisibleText("India");   
   
   
   Common.log("---> Selected Country = Indian <---");
	
   return new GeneralVerification(driver);
}





public GeneralVerification selectdateofbirth() {
	// TODO Auto-generated method stub
	
	
	Select day_dropdown= new Select(birth_day);
    
    for(int i=0;i<option_birth_day.size();i++)
    {
  	 if(i<3){
  		 
  		 day_dropdown.selectByIndex(i);
  	      
  	     Common.pause(2);
  	 }
    
  	 else
		 break;
    
    }
    
   day_dropdown.selectByVisibleText("30");      
   
   
  Select month_dropdown= new Select(birth_month);
   
   for(int i=0;i<option_birth_month.size();i++)
   {
 	 if(i<3){
 		 
 		 month_dropdown.selectByIndex(i);
 	      
 	      Common.pause(2);
 	 }
 	 else
		 break;
   
   }
   
  month_dropdown.selectByVisibleText("12");      
  
  
  Select year_dropdown= new Select(birth_year);
  
  for(int i=0;i<option_birth_year.size();i++)
  {
	 if(i<3){
		 
		 year_dropdown.selectByIndex(i);
	      
	     Common.pause(2);
	 }
	else
		 break;
  
  }
  
  year_dropdown.selectByVisibleText("1982");      
 
  Common.log("--->Selected Date Of Birth = 12/30/1982 <---");
  
	 return new GeneralVerification(driver);
}





public GeneralVerification enterphonenumber() {
	// TODO Auto-generated method stub
    
	phone_no.click();
	
	String validphonenumber = TestData.phonenumber();
	
	Common.log("--->Enter Valid Phone Number = "+validphonenumber+ " <---");
	
	phone_no.sendKeys(validphonenumber);
	
	return new GeneralVerification(driver);
}





public GeneralVerification enterusername() {
	// TODO Auto-generated method stub
	
	username.click();
	
    String validusername = TestData.username();
	
	Common.log("--->Enter Valid User Name = "+validusername+ " <---");
	
	username.sendKeys(validusername);
	
	return new GeneralVerification(driver);
}





public GeneralVerification enteremailid() {
	// TODO Auto-generated method stub
	
	email.click();
	
    String validemailid = TestData.emailid();
	
	Common.log("--->Enter Valid Emailid = "+validemailid+ " <---");
	
	email.sendKeys(validemailid);
	
	return new GeneralVerification(driver);
}





public GeneralVerification selectyourprofilepic() {
	// TODO Auto-generated method stub
	
	String profile_picture_path = "C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg";
	
	yourprofile_picture.sendKeys(profile_picture_path);
	
	Common.log("--->Selected Profile Picture From  = "+profile_picture_path+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification enteraboutyourself() {
	// TODO Auto-generated method stub
	
	aboutyourself.click();
	
	aboutyourself.sendKeys(TestData.aboutyourself());
	
	Common.log("--->About YourSelf  = "+TestData.aboutyourself()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification enterpassword() {
	// TODO Auto-generated method stub
	
    password_txt.click();
	
    String validpassword = TestData.password();
	
	Common.log("--->Enter Invalid Password = "+validpassword+ " <---");
	
	password_txt.sendKeys(validpassword);
	
	return new GeneralVerification(driver);
}




public GeneralVerification enterconfirmpassword() {
	
	// TODO Auto-generated method stub
    confirm_password_txt.click();
	
    String password = TestData.confirmpassword();
	
	Common.log("--->Enter Confrim Password = "+password+ " <---");
	
	confirm_password_txt.sendKeys(password);
	
	return new GeneralVerification(driver);
}




public GeneralVerification enterexistusername() {
	// TODO Auto-generated method stub
    username.click();
	
    String existvalidusername = TestData.existusername();
	
	Common.log("--->Enter Valid User Name = "+existvalidusername+ " <---");
	
	username.sendKeys(existvalidusername);
	
	return new GeneralVerification(driver);
}




public GeneralVerification enternotregisteremailid() {
	// TODO Auto-generated method stub
    
	email.click();
	
    String validemailid = TestData.notregisteremailid();
	
	Common.log("--->Enter Valid Emailid = "+validemailid+ " <---");
	
	email.sendKeys(validemailid);
	
	return new GeneralVerification(driver);
}




public GeneralVerification enternotexistusername() {
	// TODO Auto-generated method stub
	
    username.click();
	
    String notexistvalidusername = TestData.notexistusername();
	
	Common.log("--->Enter Valid User Name = "+notexistvalidusername+ " <---");
	
	username.sendKeys(notexistvalidusername);
	
	return new GeneralVerification(driver);
}


public GeneralVerification enterregisteremailid() {
	// TODO Auto-generated method stub
email.click();
	
    String validemailid = TestData.registeremailid();
	
	Common.log("--->Enter Valid Emailid = "+validemailid+ " <---");
	
	email.sendKeys(validemailid);
	
	return new GeneralVerification(driver);
}




public GeneralVerification click_on_demosites() {
	// TODO Auto-generated method stub
	
	Common.pause(8);
	
	root = driver.getWindowHandle();

	demosites.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification click_on_e_commerce_demosite() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
	e_commerce_demo_site.click();
	
	Common.pause(8);
	
	Set<String> handles = driver.getWindowHandles();
	
	System.out.println(handles);
	
	System.out.println(root);
	
	for(String handle : handles){
		
		if(!root.equals(handle))
			driver.switchTo().window(handle);
		
	}
	
	return new GeneralVerification(driver);
}




public GeneralVerification mousehoveron_product_category() {
	// TODO Auto-generated method stub
	
	Common.pause(10);
	
	Actions hover = new Actions(driver);
	
	hover.moveToElement(mousehoveron_product_category).build().perform();
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonipads() {
	// TODO Auto-generated method stub
	
	Common.pause(8);
	
	ipads.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification productdetails() {
	// TODO Auto-generated method stub
	
	Common.pause(3);
	
	clickon_apple_product.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification addproducttocart() {
	// TODO Auto-generated method stub
	
	Common.pause(3);
	
	addproducttocart.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification openthecart() {
	// TODO Auto-generated method stub
	Common.pause(8);
	
	opencart.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification updateproductquantity() {
	// TODO Auto-generated method stub
	
	Common.pause(8);
	
	updatequantity.click();
	
	updatequantity.clear();
	
	updatequantity.sendKeys("2");
	
	
	
	Common.pause(5);
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickoncomtinuebutton() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	clickoncontinue.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification enteremailaddress() {
	// TODO Auto-generated method stub
	
	Common.pause(10);
	
	emailaddress.click();
	
    String validemailid = TestData.emailid();
	
	Common.log("--->Enter Valid Emailid = "+validemailid+ " <---");
	
	emailaddress.sendKeys(validemailid);
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enterfirstname() {
	// TODO Auto-generated method stub
	Common.pause(2);
	
	demo_firstname.click();
	
	Common.pause(1);
	
	demo_firstname.sendKeys(TestData.demo_firstname());
	
	Common.log("--->Enter Valid FirstName = "+TestData.demo_firstname()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enterelastname() {
	// TODO Auto-generated method stub
	Common.pause(2);
	
	demo_lastname.click();
	
	Common.pause(1);
	
	demo_lastname.sendKeys(TestData.demo_lastname());
	
	Common.log("--->Enter Valid LastName = "+TestData.demo_lastname()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enteraddress() {
	// TODO Auto-generated method stub
	
    Common.pause(2);
	
    demo_address.click();
	
	Common.pause(1);
	
	demo_address.sendKeys(TestData.demo_address());
	
	Common.log("--->Enter Valid Address = "+TestData.demo_address()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enterecity() {
	// TODO Auto-generated method stub
   Common.pause(2);
	
   demo_city.click();
	
	Common.pause(1);
	
	demo_city.sendKeys(TestData.demo_city());
	
	Common.log("--->Enter Valid City = "+TestData.demo_city()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enterestate_province() {
	// TODO Auto-generated method stub
	   Common.pause(2);
	
	   demo_state_province.click();
		
		Common.pause(1);
		
		demo_state_province.sendKeys(TestData.demo_state_province());
		
		Common.log("--->Enter Valid state/Province = "+TestData.demo_state_province()+ " <---");
		
		return new GeneralVerification(driver);
}




public GeneralVerification demo_entercountry() {
	// TODO Auto-generated method stub
	  Common.pause(2);
	 
	  Select country = new Select(demo_country);
	  
	  Common.pause(1);
	  
	  country.selectByVisibleText(TestData.demo_country());
	   
	  Common.log("--->Enter Valid state/Province = "+TestData.demo_country()+ " <---");
		
      return new GeneralVerification(driver);
}




public GeneralVerification demo_enterpostalcode() {
	// TODO Auto-generated method stub
	  Common.pause(2);
		
      demo_postalcode.click();
		
		Common.pause(1);
		
		demo_postalcode.sendKeys(TestData.demo_postalcode());
		
		Common.log("--->Enter Valid state/Province = "+TestData.demo_postalcode()+ " <---");
		
		return new GeneralVerification(driver);
}




public GeneralVerification demo_enterphonenumber() {
	// TODO Auto-generated method stub
	Common.pause(2);
	
	demo_phonenumber.click();
		
		Common.pause(1);
		
		demo_phonenumber.sendKeys(TestData.demo_phonenumber());
		
		Common.log("--->Enter Valid state/Province = "+TestData.demo_phonenumber()+ " <---");
		
		return new GeneralVerification(driver);
}




public GeneralVerification entershippingaddress() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	demo_shipping_address.click();
	
	Common.log("---> Chose Shipping Address same as Billing Address <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonpurchasebutton() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	demo_clickonpurchase_button.click();
	
	Common.log("---> Click on purchase button  <---");
	
	Common.pause(8);
	return new GeneralVerification(driver);
}




public GeneralVerification clickonupdatebutton() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	click_on_update.click();
	
	Common.log("---> Click on Update button  <---");
	
	return new GeneralVerification(driver);
}


//Threads and Shirts


public GeneralVerification mousehoveronshop() {
	// TODO Auto-generated method stub
	
    Common.pause(10);
	
	Actions act = new Actions(driver);
	if(shop.isDisplayed()){
	act.moveToElement(shop).build().perform();
	Common.log("--> mouse hover on shop menu <--");
	Common.pause(10);
	}
	
	return new GeneralVerification(driver);
	
}




public GeneralVerification clickonaccessories() {
	// TODO Auto-generated method stub
	
	Common.pause(10);
	
	if(accessories.isDisplayed()){
	accessories.click();
	Common.log("--> click on accessories link <--");
	}
	else
	Common.log("--> accessories link is not displayed <--");
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonproduct() {
	// TODO Auto-generated method stub
	Common.pause(8);
	
	if(product.isDisplayed()){
		
		productname = product.getText();
		product.click();
		Common.log("--> Click on the product <--");
	}
	else
		Common.log("--> didn't click on the product <--");
	
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonaddtocartbutton() {
	// TODO Auto-generated method stub
	
	Common.pause(8);
	
	if(addtocartbutton.isDisplayed()){
		Common.log("--> Click on Add To Cart button <--");
		addtocartbutton.click();
		
	}
	else
		Common.log("--> didn't Click on Add To Cart button <--");
	
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickoncontinuesshoppingbutton() {
	// TODO Auto-generated method stub
	Common.waitForElement(driver, "//*[@id='top']/div[8]/div/div[2]/div[1]/button");
	
	Common.pause(3);
	
	Common.log("--> click on : " + continueshoppingbutton.getText() + " <--");
	continueshoppingbutton.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickoncheckoutbutton() {
	// TODO Auto-generated method stub
	
    Common.waitForElement(driver, "//*[@id='top']/div[8]/div/div[2]/div[2]/a");
	
	Common.pause(3);
	
	Common.log("--> click on : " + CheckOutbutton.getText() + " <--");
	CheckOutbutton.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification enterpromotioncode() {
	// TODO Auto-generated method stub
	Common.pause(7);
	
	if(promotioncode.isDisplayed()){
	promotioncode.sendKeys("BESTDAD15");
	Common.log("--> Enter Promotion Code : BESTDAD15 <--");
	}
	else
		Common.log("--> Not Enter Promotion Code :---- <--");
	
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonapplybutton() {
	// TODO Auto-generated method stub
	Common.pause(4);
	
	if(clickonapply.isDisplayed()){
	clickonapply.click();
	Common.log("--> Click on Apply Button <--");
	}
	else
		Common.log("--> Didn't Click on Apply Button <--");
	

	return new GeneralVerification(driver);
}




public GeneralVerification closethemessage() {
	// TODO Auto-generated method stub
	Common.pause(5);
	if(closemessage.isDisplayed()){
		closemessage.click();
		Common.log("--> Warning Message closed <--");
	}
	else
		Common.log("--> Warning Message closed <--");
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonchechoutasguest() {
	// TODO Auto-generated method stub
	Common.pause(4);
	
	if(clickoncheckoutasguest.isDisplayed()){
		clickoncheckoutasguest.click();
		Common.log("--> Click on checkout as guest user <--");
	}
	else
		Common.log("--> Didn't Click on checkout as guest user <--");
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonchechoutasguestbutton() {
	// TODO Auto-generated method stub
	
	Common.pause(4);
	
	if(clickoncheckoutasguestbutton.isDisplayed()){
		clickoncheckoutasguestbutton.click();
		Common.log("--> Click on checkout as guest user button <--");
	}
	else
		Common.log("--> Didn't Click on checkout as guest user button <--");
	return new GeneralVerification(driver);
}




public GeneralVerification enterfirstnamets() {
	// TODO Auto-generated method stub
	Common.pause(4);

	if(firstname_ts.isDisplayed()){
		firstname_ts.sendKeys(TestData.ts_firstname());
		Common.log("--> Enter First Name : " + TestData.ts_firstname()+" <--");
	}
	else
		Common.log("--> First Name is not Entered <--");
	
	return new GeneralVerification(driver);
}




public GeneralVerification enterLastnamets() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	if(lastname_ts.isDisplayed()){
		lastname_ts.sendKeys(TestData.ts_lastname());
		Common.log("--> Enter Last Name : " + TestData.ts_lastname()+" <--");
	}
	else
		Common.log("--> Last Name is not Entered <--");
	
	return new GeneralVerification(driver);
}




public GeneralVerification enteremailaddressts() {
	// TODO Auto-generated method stub
	Common.pause(4);
	
	if(emailaddress_ts.isDisplayed()){
		emailaddress_ts.sendKeys(TestData.ts_emailaddress());
		Common.log("--> Enter Email Address :" +TestData.ts_emailaddress() + " <--");
	}
	else
		Common.log("--> Email Address is not entered <--");
	return new GeneralVerification(driver);
}




public GeneralVerification enterphonenumberts() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	if(phonenumber_ts.isDisplayed()){
		phonenumber_ts.sendKeys(TestData.ts_phone());
		Common.log("--> Enter Phone Number :"+TestData.ts_phone()+" <---");
	}
	else
		Common.log("--> Phone Number is not entered <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification enteraddressts() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	if(address_ts.isDisplayed()){
		address_ts.sendKeys(TestData.ts_address());
		Common.log("--> Enter Address :"+TestData.ts_address()+" <---");
	}
	else
		Common.log("--> Address is not entered <---");
	
	
	
	return new GeneralVerification(driver);
}


public GeneralVerification entercityts() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	if(city_ts.isDisplayed()){
		city_ts.sendKeys(TestData.ts_city());
		Common.log("--> Enter City :"+TestData.ts_city()+" <---");
	}
	else
		Common.log("--> City is not entered <---");
	
	
	
	return new GeneralVerification(driver);
}



public GeneralVerification entercountryts() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	if(country_ts.isDisplayed()){
		
		Select country = new Select(country_ts);
		
		country.selectByVisibleText(TestData.ts_country());
		//country_ts.sendKeys(TestData.ts_city());
		Common.log("--> Select Country :"+TestData.ts_country()+" <---");
	}
	else
		Common.log("--> Country is not Selected <---");
		
	return new GeneralVerification(driver);
}

public GeneralVerification enterstatets() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	if(state_ts.isDisplayed()){
		state_ts.sendKeys(TestData.ts_state());
		Common.log("--> Enter State :"+TestData.ts_state()+" <---");
	}
	else
		Common.log("--> State is not Entered <---");
		
	return new GeneralVerification(driver);
}

public GeneralVerification enterpostalcodets() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	if(postalcodets.isDisplayed()){
		postalcodets.sendKeys(TestData.ts_postalcode());
		Common.log("--> Enter Postal Code :"+TestData.ts_postalcode()+" <---");
	}
	else
		Common.log("--> Postal Code is not entered <---");
		
	return new GeneralVerification(driver);
}

 public GeneralVerification billingandshippingsameclickts() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	if(billingandshippingsameclickts.isDisplayed()){
		billingandshippingsameclickts.click();
		Common.log("--> Shipping address is same as billing address <---");
	}
	else
		Common.log("--> Shipping address is NOT same as billing address <---");
		
	return new GeneralVerification(driver);
}

 public GeneralVerification clickoncontinuebuttonts() {
	// TODO Auto-generated method stub
	Common.pause(7);
	
	if(clickoncontinuebuttonts.isDisplayed()){
		
		clickoncontinuebuttonts.click();
		Common.log("--> Click on Continue Button <---");
	}
	else
		Common.log("--> Didn't Click on continue button <---");
		
	return new GeneralVerification(driver);
}

 public GeneralVerification clickoncashondeliveryts() {
		// TODO Auto-generated method stub
		Common.pause(3);
		
		if(cashondeliveryts.isDisplayed()){
			
			cashondeliveryts.click();
			Common.log("--> Click on Cash On Delivery Option <---");
		}
		else
			Common.log("--> Didn't Click on Cash On Delivery Option <---");
			
		return new GeneralVerification(driver);
	}
 
 
 public GeneralVerification clicksubmitmyorderbuttonts() {
		// TODO Auto-generated method stub
		Common.pause(3);
		
		if(submitmyorderbuttonts.isDisplayed()){
			
			submitmyorderbuttonts.click();
			Common.log("--> Click on Submit My Order button <---");
		}
		else
			Common.log("--> Didn't Click on Submit My Order button <---");
			
		return new GeneralVerification(driver);
	}




public GeneralVerification clickoncontinuebuttonshippingoptionsts() {
	// TODO Auto-generated method stub
	
	WebElement move = driver.findElement(By.xpath("//a[contains(text(),'Billing and Shipping Address')]"));
	 
	Actions act = new Actions(driver);
	
	act.moveToElement(move).build().perform();
	
    if(clickoncontinuebuttonts.isDisplayed()){
		
		clickoncontinuebuttonts.click();
		Common.log("--> Click on Continue Button <---");
	}
	else
		Common.log("--> Didn't Click on continue button <---");
		
	
	return new GeneralVerification(driver);
}
 

//E-Signature

public GeneralVerification esign_enterusername() {
	// TODO Auto-generated method stub
	
	Common.pause(4);
	
    if(username_esign.isDisplayed()){
		
    	username_esign.sendKeys(TestData.esign_username());
    	
		Common.log("--> Enter Username :" +TestData.esign_username()+"<---");
	}
	else
		Common.log("--> Username textfield is not available <---");
		
	
	return new GeneralVerification(driver);
}

public GeneralVerification esign_password() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
    if(password_esign.isDisplayed()){
		
    	password_esign.sendKeys(TestData.esign_password());
    	
		Common.log("--> Enter password :" +TestData.esign_password()+"<---");
	}
	else
		Common.log("--> Password textfield is not available <---");
		
	
	return new GeneralVerification(driver);
}

public GeneralVerification esign_clickonloginbutton() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
    if(login_esign.isDisplayed()){
		
    	login_esign.click();
    	
		Common.log("--> clicked on Login Button <---");
	}
	else
		Common.log("--> Not Able to click on Login Button <---");
		
	Common.pause(8);
	return new GeneralVerification(driver);
}



public GeneralVerification esign_selectworkflow() {
	// TODO Auto-generated method stub
	
	Common.pause(3);
	
    if(selectworkflow_esign.isDisplayed()){
		
    	Select workflow = new Select(selectworkflow_esign);
    	
    	workflow.selectByVisibleText("IBM Digital Contracts Demo v. 1");
    	
    	Common.log("--> Selected the work Flow:" + "IBM Digital Contracts Demo v. 1" + " <---");
	}
	else
		Common.log("--> Workflow is not selected <---");
		
	Common.pause(3);
	return new GeneralVerification(driver);
}

public GeneralVerification esign_clickoncreatebutton() {
	// TODO Auto-generated method stub
	
	Common.pause(3);
	
    if(createbutton_esign.isDisplayed()){
		
    	createbutton_esign.click();
    	
		Common.log("--> clicked on Create Button <---");
	}
	else
		Common.log("--> Not Able to click on Create Button <---");
		
	Common.pause(5);
	return new GeneralVerification(driver);
}


public GeneralVerification esign_enterpackagereference() {
	// TODO Auto-generated method stub
	
	Common.pause(3);
	
    if(packagereference_esign.isDisplayed()){
		
    	packagereference = "Packagereference_"+TestData.randomAlphaNumeric(4);
    	
    	packagereference_esign.sendKeys(packagereference);
    	
		Common.log("--> Enter Packagereference :" +packagereference+" <---");
	}
	else
		Common.log("--> Package reference textfield is not available <---");
		
	
	return new GeneralVerification(driver);
}


public GeneralVerification esign_enterfirstname() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
    if(firstname_esign.isDisplayed()){
		
    	firstname = "Firstname"+TestData.randomAlpha(4);
    	
    	firstname_esign.sendKeys(firstname);
    	
		Common.log("--> Enter First Name :" +firstname+" <---");
	}
	else
		Common.log("--> First Name textfield is not available <---");
		
	
	return new GeneralVerification(driver);
}

public GeneralVerification esign_enterlastname() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
    if(lastname_esign.isDisplayed()){
		
    	lastname = "Lastname"+TestData.randomAlpha(4);
    	
    	lastname_esign.sendKeys(lastname);
    	
		Common.log("--> Enter Last Name :" +lastname+" <---");
	}
	else
		Common.log("--> Last Name textfield is not available <---");
		
	
	return new GeneralVerification(driver);
}

public GeneralVerification esign_enteremailaddress() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
    if(emailaddress_esign.isDisplayed()){
		
    	String emailaddress = TestData.randomAlphaNumeric(4)+"@mailinator.com";
    	
    	emailaddress_esign.sendKeys(emailaddress);
    	
        Common.log("--> Enter Email Address :" +emailaddress+" <---");
	}
	else
		Common.log("--> Email Address textfield is not available <---");
		
	
	return new GeneralVerification(driver);
}

public GeneralVerification esign_enterphonenumber() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
    if(mobile_esign.isDisplayed()){
		
    	String phonenumber ="+61444" +TestData.randomNumeric(6);
    	
    	mobile_esign.sendKeys(phonenumber);
    	
		Common.log("--> Enter Phone Number :" +phonenumber+" <---");
	}
	else
		Common.log("--> Phone Number textfield is not available <---");
		
	
	return new GeneralVerification(driver);
}

public GeneralVerification esign_numberofducuments() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
	int i = Integer.parseInt(TestData.numberofducuments());
	
	int count = i/2;
	
	for(WebElement document: numberofdocuments_esign){
		
		if(i>0){
			document.click();
		}
		else
			break;
		i--;
	}
	
	numberofdocuments=count;
   Common.log("Number of Documents Attached :"+count);
   return new GeneralVerification(driver);
}

public GeneralVerification esign_packagecreatebutton() {
	// TODO Auto-generated method stub
	
	Common.pause(3);
	
    if(packagecreatebutton.isDisplayed()){
		
    	packagecreatebutton.click();
    	Common.log("--> clicked on Create Button <---");
	}
	else
		Common.log("--> Not Able to click on Create Button <---");
		
	
	return new GeneralVerification(driver);
}


public GeneralVerification esign_clickoncloudserviceaggrement() {
	// TODO Auto-generated method stub
	
	Common.pause(15);
	
    if(cloudserviceaggrement_esign.isDisplayed()){
		
    	cloudserviceaggrement_esign.click();
    	Common.log("--> clicked on Cloud Service Aggrement <---");
	}
	else
		Common.log("--> Not Able to clicked on Cloud Service Aggrement <---");
		
	
	return new GeneralVerification(driver);
}


public GeneralVerification esign_uploadagreement() {
	// TODO Auto-generated method stub
	
	Common.pause(5);
	
    if(uploadtheaggreement_esign.isDisplayed()){
		
    	 File file = new File("Cloud Hosting Agreement.pdf"); 
         
         //file = file.getAbsoluteFile();
           
           String absolutePath = file.getAbsolutePath();
           
           uploadtheaggreement_esign.sendKeys(absolutePath);

    	
    	
    	//uploadtheaggreement_esign.sendKeys("resources/Cloud Hosting Agreement.pdf");
    	Common.log("--> Uploaded the Aggrement <---");
	}
	else
		Common.log("--> Not Able to Uploaded the Aggrement <---");
		
	
	return new GeneralVerification(driver);
}


public GeneralVerification esign_clickonsendnowbutton() {
	// TODO Auto-generated method stub
	
	Common.pause(18);
	
    if(clickonsendnowbutton_esign.isDisplayed()){
		
    	clickonsendnowbutton_esign.click();
    	Common.log("--> Clicked on SendNow button <---");
	}
	else
		Common.log("--> Not Able to Click on SendNow button <---");
		
	
	return new GeneralVerification(driver);
}

public GeneralVerification esign_clickonGuarantoroption() {
	// TODO Auto-generated method stub
	
	Common.pause(5);
	
    if(clickonguarantor_esign.isDisplayed()){
		
    	clickonguarantor_esign.click();
    	Common.log("--> Clicked on Guarantor Option <---");
	}
	else
		Common.log("--> Not Able to Click on Guarantor Option <---");
		
	
	return new GeneralVerification(driver);
}

public GeneralVerification esign_enterfirstnameGuarantor() {
	// TODO Auto-generated method stub
	
   Common.pause(2);
	
    if(firstname_Guarantor_esign.isDisplayed()){
		
    	firstname = "Firstname"+TestData.randomAlpha(4);
    	
    	firstname_Guarantor_esign.sendKeys(firstname);
    	
		Common.log("--> Enter Guarantor First Name :" +firstname+" <---");
	}
	else
		Common.log("--> Guarantor First Name textfield is not available <---");
		
	
	return new GeneralVerification(driver);	
}


public GeneralVerification esign_enterlastnameGuarantor() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
    if(lastname_Guarantor_esign.isDisplayed()){
		
    	lastname = "Lastname"+TestData.randomAlpha(4);
    	
    	lastname_Guarantor_esign.sendKeys(lastname);
    	
		Common.log("--> Enter Guarantor Last Name :" +lastname+" <---");
	}
	else
		Common.log("--> Guarantor Last Name textfield is not available <---");
    
	return new GeneralVerification(driver);
}

//emailaddress_Guarantor_esign

public GeneralVerification esign_enteremailaddressGuarantor() {
	// TODO Auto-generated method stub
Common.pause(2);
	
    if(emailaddress_Guarantor_esign.isDisplayed()){
		
    	String emailaddress = TestData.randomAlphaNumeric(4)+"@mailinator.com";
    	
    	emailaddress_Guarantor_esign.sendKeys(emailaddress);
    	
        Common.log("--> Enter Guarantor Email Address :" +emailaddress+" <---");
	}
	else
		Common.log("--> Guarantor Email Address textfield is not available <---");
		
	
	return new GeneralVerification(driver);
	
}

public GeneralVerification esign_enterphonenumberGuarantor() {
	// TODO Auto-generated method stub

Common.pause(2);
	
    if(mobilenumber_Guarantor_esign.isDisplayed()){
		
    	String phonenumber ="+61444" +TestData.randomNumeric(6);
    	
    	mobilenumber_Guarantor_esign.sendKeys(phonenumber);
    	
		Common.log("--> Enter Guarantor Phone Number :" +phonenumber+" <---");
	}
	else
		Common.log("--> Guarantor Phone Number textfield is not available <---");
		
	
	return new GeneralVerification(driver);
	
}


//Relationship manager

public GeneralVerification esign_clickonrelationshipmanageroption() {
	// TODO Auto-generated method stub
	
	Common.pause(5);
	
    if(clickonrelationshipmanager_esign.isDisplayed()){
		
    	clickonrelationshipmanager_esign.click();
    	Common.log("--> Clicked on Relationship Manager Option <---");
	}
	else
		Common.log("--> Not Able to Click on Relationship Manager Option <---");
    
	return new GeneralVerification(driver);
}





public GeneralVerification esign_enterfirstnamerelationshipmanager() {
	// TODO Auto-generated method stub
	
   Common.pause(2);
	
    if(firstname_relationshipmanager_esign.isDisplayed()){
		
    	firstname = "Firstname"+TestData.randomAlpha(4);
    	
    	firstname_relationshipmanager_esign.sendKeys(firstname);
    	
		Common.log("--> Enter Relationship Manager First Name :" +firstname+" <---");
	}
	else
		Common.log("--> Relationship Manager First Name textfield is not available <---");
		
	
	return new GeneralVerification(driver);	
}


public GeneralVerification esign_enterlastnamerelationshipmanager() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
    if(lastname_relationshipmanager_esign.isDisplayed()){
		
    	lastname = "Lastname"+TestData.randomAlpha(4);
    	
    	lastname_relationshipmanager_esign.sendKeys(lastname);
    	
		Common.log("--> Enter Relationship Manager Last Name :" +lastname+" <---");
	}
	else
		Common.log("--> Relationship Manager Last Name textfield is not available <---");
    
	return new GeneralVerification(driver);
}

//emailaddress_Guarantor_esign

public GeneralVerification esign_enteremailaddressrelationshipmanager() {
	// TODO Auto-generated method stub
Common.pause(2);
	
    if(emailaddress_relationshipmanager_esign.isDisplayed()){
		
    	String emailaddress = TestData.randomAlphaNumeric(4)+"@mailinator.com";
    	
    	emailaddress_relationshipmanager_esign.sendKeys(emailaddress);
    	
        Common.log("--> Enter Relationship Manager Email Address :" +emailaddress+" <---");
	}
	else
		Common.log("--> Relationship Manager Email Address textfield is not available <---");
		
	
	return new GeneralVerification(driver);
	
}

public GeneralVerification esign_enterphonenumberrelationshipmanager() {
	// TODO Auto-generated method stub

Common.pause(2);
	
    if(mobilenumber_relationshipmanager_esign.isDisplayed()){
		
    	String phonenumber ="+61444" +TestData.randomNumeric(6);
    	
    	mobilenumber_relationshipmanager_esign.sendKeys(phonenumber);
    	
		Common.log("--> Enter Relationship Manager Phone Number :" +phonenumber+" <---");
	}
	else
		Common.log("--> Relationship Manager Phone Number textfield is not available <---");
		
	
	return new GeneralVerification(driver);
	
}


public GeneralVerification esign_relationship_manager_ducuments() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
	
	if(document_relationshipmanager_esign.isDisplayed()){
	
	document_relationshipmanager_esign.click();
	
	Common.log("--> click on required relationship manager document <--");
	
	}
	else
	Common.log("--> Not able to click on required relationship manager document <--");
		
	
   return new GeneralVerification(driver);
}


//*[@id="361b4b11-bab3-4ee1-8ed0-50896313c700section"]/span/span[1]/input


}//end of class



