package pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Googlelepgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abc@gmail");
		driver.findElement(By.id("pass")).sendKeys("hkmk");
		driver.findElement(By.id("login")).click();
		driver.close();
		
	}

}
