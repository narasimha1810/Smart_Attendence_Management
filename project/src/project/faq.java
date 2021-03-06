package project;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class faq {
	
	@Test
	public static void testcse1() {
    	System.setProperty("webdriver.chrome.driver","C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/faq");
		driver.findElement(By.cssSelector("")).click();
		System.out.println("Testcase 1 Passed");
    }
	
	@Test
	public static void testcse2() {
    	System.setProperty("webdriver.chrome.driver","C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/faq");
		
		driver.findElement(By.cssSelector("body > main > div.faq__holder > details:nth-child(2) > summary > span")).click();
		System.out.println("Testcase 2 Passed");
    }
	
	@Test
	public static void testcse3() {
    	System.setProperty("webdriver.chrome.driver","C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/faq");
		
		driver.findElement(By.cssSelector("details.faq__detail:nth-child(3) > summary:nth-child(1) > span:nth-child(1)")).click();
		System.out.println("Testcase 3 Passed");
    }
	
	@Test
	public static void testcse4() {
    	System.setProperty("webdriver.chrome.driver","C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/faq");
		driver.findElement(By.cssSelector("details.faq__detail:nth-child(4) > summary:nth-child(1) > span:nth-child(1)")).click();
		System.out.println("Testcase 4 Passed");
    }
	
	@Test
	public static void testcse5() {
    	System.setProperty("webdriver.chrome.driver","C:\\web browser\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:5000/faq");
		driver.findElement(By.cssSelector("details.faq__detail:nth-child(5) > summary:nth-child(1) > span:nth-child(1)")).click();
		System.out.println("Testcase 5 Passed");
    }
	
public static void main(String[] args) {
		
		testcse1();
		testcse2();
		testcse3();
		testcse4();
		testcse5();
	}

}
