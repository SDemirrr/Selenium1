package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

        //Amazonda nutella arat
       // WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
      //aramaKutusu.sendKeys("nutella"+ Keys.ENTER); //id uniqe oldugu icin sorunsuz calisir

      //WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
      //aramaKutusu.sendKeys("nutella"+ Keys.ENTER); //uniqe oldugu icin sorunsuz calisir

       // WebElement aramaKutusu=driver.findElement(By.className("nav-search-field "));
       // aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        /*
        Bu locator calismadi
        Locator alirken gozumuzden kacan detaylar olabililr
        aldigimiz bir locator calismazsa alternatif loctorlar denemeliyiz
         */

        driver.findElement(By.partialLinkText("oducts on Amazon")).click();//a tag'indan link isminden istedigimiz bir parcayi ekleyebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();
    }
}
