package josephart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class sample1 {
	@Test(priority=9)
		  public void  test1() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test1 is successfull");
		        driver.close(); 
		    }
		@Test(priority=8)
		 public void  test2() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test2 is successfull");

		        driver.close(); 
		    }
		@Test(priority=7)
		 public void  test3() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test3 is successfull");

		        driver.close(); 
		    }
		@Test(priority=6)
		 public void  test4() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test4 is successfull");

		        driver.close(); 
		    }
		@Test(priority=5)
		 public void  test5() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test5 is successfull");

		        driver.close(); 
		    }
		@Test(priority=4)
		 public void  test6() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test6 is successfull");

		        driver.close(); 
		    }
		@Test(priority=3)
		 public void  test7() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test7 is successfull");

		        driver.close(); 
		    }
		@Test(priority=2)
		 public void  test8() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test8 is successfull");

		        driver.close(); 
		    }
		@Test(priority=1)
		 public void  test9() {
			  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
			  	WebDriver driver = new ChromeDriver();
		        driver.get("http://demo.guru99.com/selenium/deprecated.html");
		        driver.switchTo().frame("classFrame");
		        driver.findElement(By.linkText("Deprecated")).click();
		        System.out.println("test9 is successfull");

		        driver.close(); 
		    }
	}

