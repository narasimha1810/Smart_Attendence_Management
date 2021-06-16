package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class student {

	@Test
	public static void testcse1() {
		System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/student");
	    System.out.println("Testcase 1 Passed");
		
	}
	@Test
    public static void testcse2() {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/student");
		driver.findElement(By.id("Username")).sendKeys("Kiana");
		driver.findElement(By.id("Password")).sendKeys("208736");
		driver.findElement(By.id("submit")).click();
		
		System.out.println("Testcase 2 Passed");
    }
	
	@Test
    public static void testcse3() {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/student");
		driver.findElement(By.id("Username")).sendKeys("student");
		driver.findElement(By.id("Password")).sendKeys("654248");
		driver.findElement(By.id("submit")).click();
		
		System.out.println("Testcase 3 Passed");
    }
	
	@Test
    public static void testcse4() {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/student");
		
		driver.findElement(By.cssSelector("body > div > p:nth-child(7) > a")).click();
		
		System.out.println("Testcase 4 Passed");
    }
	
	@Test
    public static void testcse5() {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/forgot.html");
		
		driver.findElement(By.cssSelector("body > div > form > button")).click();
		
		System.out.println("Testcase 5 Passed");
    }
	
	@Test
    public static void testcse6() {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/forgot.html");
		driver.findElement(By.id("uname")).sendKeys("narasimha@gmail.com");
		driver.findElement(By.cssSelector("body > div > form > button")).click();
		
		System.out.println("Testcase 6 Passed");
    }
	
public static void main(String[] args) {
		
		testcse1();
		testcse2();
		testcse3();
		testcse4();
		testcse5();
		testcse6();

	}

}
