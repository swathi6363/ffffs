package pkg;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle= driver.getTitle();
		String expectedtitle="google123";
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
