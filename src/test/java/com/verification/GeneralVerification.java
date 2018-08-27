package com.verification;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.init.AbstractPage;
import com.init.Common;

public class GeneralVerification extends AbstractPage {

	public GeneralVerification(WebDriver driver) {
		super(driver);
	}

	
	
	public boolean verifyhomepage() {
		
		Common.pause(10);
		
		WebElement regi = driver.findElement(By.xpath("//a[@title='About us']"));
		
		Common.log("--->Home page open");
		
		return Common.isElementDisplayed(regi);
		
		}


	public boolean blankfieldsvalidationmsg() {
		// TODO Auto-generated method stub
        
		List<WebElement> validation_msg = driver.findElements(By.xpath("//span[contains(text(),'* This field is required')]"));
		
        int count = validation_msg.size();
		
		String msg = validation_msg.get(0).getText();
		
		//SeleniumInit.log(msg);
	
		if(count==7 && msg.equalsIgnoreCase("* This field is required")){
		
		String msg1 = Integer.toString(count);
		
		Common.log("---> There are " + msg1 +" All validation messages dispalyed::"+msg+" <---");
		
		return true;
		}
		else{
			
			Common.log("---> None validation message display <---");
			return false;
		}
	}


	public boolean minimulengthvalidationmsg() {
		// TODO Auto-generated method stub
		WebElement phone_mini_validation_msg = driver.findElement(By.xpath(".//span[contains(text(),'* Minimum 10 Digits starting with Country Code')]"));
		 
		 String str = phone_mini_validation_msg.getText();
			
		 Common.pause(5);
			if(str.equals("* Minimum 10 Digits starting with Country Code")){
				
				Common.log("---> Minimum phone field length validation message displayed <---");
				return true;
			}
			else{
				
			    Common.log("---> Minimum phone field length validation message is not displayed <---");
				return false;
			}
			
	}



	public boolean passwordminimulengthvalidationmsg() {
		// TODO Auto-generated method stub
		
		WebElement password_mini_validation_msg = driver.findElement(By.xpath(".//span[contains(text(),'* Minimum  8  characters required')]"));
		
		String str = password_mini_validation_msg.getText().trim();
		
		System.out.println(str);
		
		Common.pause(5);
		
		if(password_mini_validation_msg.isDisplayed()){
			
			Common.log("---> Minimum password field length validation message displayed <---");
			return true;
		}
		else{
			
		    Common.log("---> Minimum password field length validation message is not displayed <---");
			return false;
		}
	}



	public boolean passwordonotmatch() {
		// TODO Auto-generated method stub
		
		   WebElement confirm_password_validation_msg = driver.findElement(By.xpath(".//span[contains(text(),'* Fields do not match')]"));
		  
			Common.pause(3);
			
		    String str = confirm_password_validation_msg.getText();
			
			 boolean tf = str.equals("* Fields do not match"); 
			
			if(tf){
				
				Common.log("---> Confirm password do not match with passwor d<---");
				return true;
			}
			else{
				Common.log("---> Confirm password do not match with password validation message is not displayed <---");
				return false;
			}
				
		
	}



	public boolean invalidemailid() {
		// TODO Auto-generated method stub
		
		WebElement invalid_emailid_validation_msg = driver.findElement(By.xpath("//span[contains(text(),'* Invalid email address')]"));
		
		if(invalid_emailid_validation_msg.isDisplayed()){
			
			Common.log("---> Enter email Id is invalid!!! <---");	
			return true;
		  }
		 else
			 Common.log("---> Validation message is not displayed <---");
		return false;
	}
	
	
	
	public boolean successfullregistration() {
		// TODO Auto-generated method stub
		
        WebElement registration_msg = driver.findElement(By.xpath("//p[contains(text(),'Thank you for your registration')]"));
        
        
      if(Common.isElementDisplayed(registration_msg)){
			
			Common.log("---> Thank you for your registration!!!You have registered successfully!!! <---");
			return true;
		}
		else{
			Common.log("---> Unsuccessfull!!Check the error please!!! <---");
			return false;
		}
        
	}



	public boolean usernamealreadyexist() {
		// TODO Auto-generated method stub
		
		WebElement error_registration_msg = driver.findElement(By.xpath("//p[@class='piereg_login_error']"));
		
		if(error_registration_msg.isDisplayed()){
			
			Common.log("---> UserName Already Exist validation message is displayed <---");
			return true;
		}
		else{
		
			Common.log("---> UserName Already Exist validation message is NOT displayed <---");
			return false;
		}
	}



	public boolean emailidalreadyregistered() {
		// TODO Auto-generated method stub
        
		WebElement error_registration_msg = driver.findElement(By.xpath("//p[@class='piereg_login_error']"));
		
		if(error_registration_msg.isDisplayed()){
			
			Common.log("---> EmailId is already registered validation message is displayed <---");
			return true;
		}
		else{
		
			Common.log("---> EmailId is already registered validation message is NOT displayed <---");
			return false;
		}
	}



	


	public boolean verifyhomepage_purchase() {
		// TODO Auto-generated method stub
		
		Common.pause(10);
		
		WebElement account_icon = driver.findElement(By.xpath("//span[contains(text(),'Account')]"));
		
		if(account_icon.isDisplayed())	
			return true;
		else				
			return false;
		
		
	}



	public boolean checkproductinthecart() {
		// TODO Auto-generated method stub
		Common.pause(3);
		
		WebElement productincart = driver.findElement(By.xpath("//a[contains(text(),'Apple iPad 2 16GB, Wi-Fi, 9.7in - Black')]"));
		
		if(productincart.isDisplayed())
			return true;
		else
			return false;	
	}



	public boolean checkproductquanity() {
		// TODO Auto-generated method stub
		
		Common.pause(3);
		
		WebElement productquantity = driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]"));
		
		System.out.println("Number of product in the CART :" +productquantity.getAttribute("value"));
		
		if(productquantity.getAttribute("value").equals("2"))
			return true;
		else		
		return false;
	}



	public boolean purchaseverification() {
		// TODO Auto-generated method stub
		Common.pause(10);
		
		WebElement order = driver.findElement(By.xpath("//p[contains(text(),'Thank you, your purchase is pending. You will be sent an email once the order clears.')]"));
		
		if(order.isDisplayed())
			return true;
		else
			return false;
	}


// Threads and Shirts
	public boolean verifyhomepage_threadandshirts() {
		// TODO Auto-generated method stub
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://www.threadsandshirts.com/"))
			return true;
		else
		return false;
	}
	
	
	

	@FindBy(xpath="//p[contains(text(),'Congratulations! Your order has been successfully placed.')]") private WebElement orderplacedsuccessfullyts;

	public boolean orderplacedsuccessfully() {
		// TODO Auto-generated method stub
		
		Common.pause(8);
		
		String str = orderplacedsuccessfullyts.getText();
		
		System.out.println(str);
		
		if(str.equals("Congratulations! Your order has been successfully placed. Order details.")){
			
			WebElement orderdetailsbutton = driver.findElement(By.xpath("//div/a[contains(text(),'Order details')]"));
			orderdetailsbutton.click();
			
			Common.pause(10);
			
			WebElement productnameinbill = driver.findElement(By.xpath("//td/a[contains(text(),'Black Dobby')]"));
			
			if(generalIndexpage.productname.equals(productnameinbill.getText())){
				
				Common.log("--> Product name verify with the bill <--");
				return true;
			}
			
			else{
			   Common.log("--> Product name is not verify with the bill <--");
			   return false;
			}
		}
		else
		return false;
	}


	//E-Signature

	public boolean verifyesignaturehomepage() {
		// TODO Auto-generated method stub
		Common.pause(5);
		

		String url = driver.getCurrentUrl();
		
		if(url.equals("https://go-env-syd1.clickandsign.net:11443/dashboard/"))
			return true;
		else
		return false;
	}
	
	
	public boolean esign_loginpageverification() {
		// TODO Auto-generated method stub
		Common.pause(6);
		
		WebElement welcomemsg = driver.findElement(By.xpath("//span[contains(text(),'Welcome Sydney Test')]"));

		String msg = welcomemsg.getText();
		
		if(msg.equals("Welcome Sydney Test"))
			return true;
		else
		return false;
	}
	
	
	public boolean esign_packagenameverification() {
		// TODO Auto-generated method stub
		Common.pause(25);
		
		
		
		WebElement searchtext = driver.findElement(By.xpath("//label[contains(text(),'Search:')]/.//input"));
		
		searchtext.sendKeys(generalIndexpage.packagereference);
		//searchtext.sendKeys(Keys.ENTER);
		
		Common.pause(5);
		
		String firstandlastname = generalIndexpage.firstname+" "+generalIndexpage.lastname;
		
		WebElement caretedpackagename_esign = driver.findElement(By.xpath("//td[contains(text(),'"+generalIndexpage.packagereference+"')]"));
		
		if(caretedpackagename_esign.isDisplayed()){
		Actions act = new Actions(driver);
		act.moveToElement(caretedpackagename_esign).build().perform();
		caretedpackagename_esign.click();
		Common.logverification("--> package name is confirmed <--");
		}
		else
			Common.logverification("--> package name is NOT confirmed <--");
		
		Common.pause(5);
		
		int check=0;
	
		List<WebElement> numberofdocuments = driver.findElements(By.xpath("//span[@class='fancytree-title']"));
		
		System.out.println(generalIndexpage.numberofdocuments);
		
		for(WebElement element :numberofdocuments){
			
			/*System.out.println(element.getText());
			
			System.out.println("check : " + check);*/
			
			if(element.getText().contains("Transfer of Land *") || element.getText().contains("Certificate of Insurance 1 *")||element.getText().contains( "Certificate of Insurance 3 *")||element.getText().contains( "DCC *" )||element.getText().contains("Borrowers Letter of Authority *"))
			{
				check++;
				
				Common.log("-->  Attached Documents : "+element.getText()+ " <--");
				
				if(generalIndexpage.numberofdocuments==check){
					
					Common.logverification("--> Verified number of documents Attached:"+ check +" Verify the above documents list <--");
				}
				/*else
					Common.logverification("--> Number of documents Attached is not matched <--");*/
				}	
		}
		
		WebElement firstandlastname_esign =driver.findElement(By.xpath("//span[contains(text(),'"+firstandlastname+"')]"));
		
		if(firstandlastname_esign.isDisplayed()){
			Common.logverification("--> First Name and Last Name is confirmed <--");
			return true;
		}
		else
			Common.logverification("--> First Name and Last Name is NOT confirmed <--");
			return false;	
		}	
	
	
}//class ends

