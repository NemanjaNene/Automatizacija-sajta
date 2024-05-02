package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokatorsajta {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milica\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		
		driver.findElement(By.id("email")).sendKeys("KlaraNemanja@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Neneklara1");
		driver.findElement(By.className("btn-primary")).click();
	   System.out.println(driver.findElement(By.cssSelector(".text-with-icon")).getText());
	   driver.findElement(By.linkText("bodySmall form-footer")).click();

	}

}
      //desava se da je programu nekada potrebno nekoliko sekundi da izbaci gresku,npr za pogresnu lozinku, mail...i za to
     // je potrebno ubaciti posebnu recenicu u program, kako bi Selenium sacekao odredjeno vreme
     // maksimalno vreme za koje SELENIUM MOZE DA CEKA DO IZBACIVANJA GRESKE JE 5 SEKUNDI
     //kod se mora pisati odmah posle moje 13-te recenice
    // KOD:
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));