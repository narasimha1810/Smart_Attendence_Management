package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logout {
	
	@Test
    public static void testcse1() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/faculty");
		driver.findElement(By.id("Username")).sendKeys("Dr. Swapna");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("654248");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/header/div[2]/a")).click();
		
		System.out.println("Testcase 1 Passed");
    }
	
	@Test
    public static void testcse2() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/faculty");
		driver.findElement(By.id("Username")).sendKeys("Dr. Swapna");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("654248");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/header/div[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/a[1]/strong")).click();
		System.out.println("Testcase 2 Passed");
    }
		
	
	
	public static void main(String[] args) throws InterruptedException {
		
		testcse1();
		testcse2();
	}

}
