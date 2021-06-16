package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class admin {

	
	@Test
	public static void testcse1() {
		System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/admin");
	    System.out.println("Testcase 1 Passed");
		
	}
	@Test
    public static void testcse2() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/admin");
		driver.findElement(By.id("Username")).sendKeys("Dr. Vishnu");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("526517");
		driver.findElement(By.id("submit")).click();
		
		System.out.println("Testcase 2 Passed");
    }
	
	@Test
    public static void testcse3() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/admin");
		driver.findElement(By.id("Username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("654248");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		System.out.println("Testcase 3 Passed");
    }

	@Test
    public static void testcse4() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/admin");
		driver.findElement(By.id("Username")).sendKeys("Dr. Swapna");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("654248");
		driver.findElement(By.id("submit")).click();
		driver.get("file:///C:/Users/Narasimha%20Reddy/Desktop/Software_project-main/views/admindashboard.html");
		driver.get("file:///C:/Users/Narasimha%20Reddy/Desktop/Software_project-main/views/signup_faculty.html");
		System.out.println("Testcase 4 Passed");
    }

	public static void main(String[] args) throws InterruptedException {
		
		testcse1();
		testcse2();
		testcse3();
		testcse4();
		

	}

}


