package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facultydash {
	
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
		System.out.println("Testcase 1 Passed");
    }
	
	@Test
    public static void testcse3() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/faculty");
		driver.findElement(By.id("Username")).sendKeys("Dr. Swapna");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("654248");
		Thread.sleep(1000);
		driver.get("http://localhost:5000/faculty");
		Thread.sleep(1000);
		driver.get("file:///C:/Users/Narasimha%20Reddy/Desktop/Software_project-main/views/takeattendence.html");
		Thread.sleep(1000);
		driver.get("file:///C:/Users/Narasimha%20Reddy/Desktop/Software_project-main/views/checkstudent_attendence.html");
		System.out.println("Testcase 2 Passed");
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
		driver.get("file:///C:/Users/Narasimha%20Reddy/Desktop/Software_project-main/views/facultydash.html");
		Thread.sleep(1000);
		driver.get("file:///C:/Users/Narasimha%20Reddy/Desktop/Software_project-main/views/attendless.html");
		System.out.println("Testcase 3 Passed");
    }
	

	


public static void main(String[] args) throws InterruptedException {
	
	testcse1();
	testcse2();
	testcse3();

}
}
