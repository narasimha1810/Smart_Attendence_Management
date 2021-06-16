package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class home {

	@Test
    public static void testcse1() {
    	System.setProperty("webdriver.chrome.driver","C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/");
		
		System.out.println("Testcase 1 Passed");
    }
	@Test
	public static void testcse2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\web browser\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li.scroll-to-section:nth-child(2) > a:nth-child(1)")).click();
		System.out.println("Testcase 2 Passed");
	}
	
	@Test
	public static void testcse3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\web browser\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li.scroll-to-section:nth-child(3) > a:nth-child(1)")).click();
		System.out.println("Testcase 3 Passed");
	}
	
	@Test
	public static void testcse4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\web browser\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/");
		Thread.sleep(1000);
		driver.get("http://localhost:5000/admin");
		System.out.println("Testcase 4 Passed");
	}
	@Test
	public static void testcse5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\web browser\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/");
		Thread.sleep(1000);
		driver.get("http://localhost:5000/faculty");
		System.out.println("Testcase 5 Passed");
	}
	
	@Test
	public static void testcse6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\web browser\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/");
		Thread.sleep(1000);
		driver.get("http://localhost:5000/student");
		System.out.println("Testcase 6 Passed");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		testcse1();
		testcse2();
		testcse3();
		testcse4();
		testcse5();
		testcse6();
		
		
		
	}

}
