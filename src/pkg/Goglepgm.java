package pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Goglepgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hjujji");
	}

}
