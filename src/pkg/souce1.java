package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class souce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String sour=driver.getPageSource();
		if(sour.contains("mail")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
