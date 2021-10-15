package josephart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class sample2 {
    @Test    
    public void executSessionOne() throws InterruptedException{
            //First session of WebDriver
	  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            System.out.println("test1 is successfull");
            Thread.sleep(2000);
	        driver.close(); 
            
        }
        
    @Test    
        public void executeSessionTwo() throws InterruptedException{
            //Second session of WebDriver
	  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        System.out.println("test2 is successfull");
        Thread.sleep(2000);
        driver.close(); 
        
        }
        
    @Test    
        public void executSessionThree() throws InterruptedException{
            //Third session of WebDriver
	  	System.setProperty("webdriver.chrome.driver","D:\\joseph\\New folder\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        System.out.println("test3 is successfull");
        Thread.sleep(2000);

        driver.close(); 
        
        }        
}