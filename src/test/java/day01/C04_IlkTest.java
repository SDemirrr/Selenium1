package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.IllegalFormatCodePointException;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        /*
        1-Amazon sayfasina gidiniz
        2-Basligin "Amazon" icerdigini test ediniz
        3-URL'in amazon icerdigini test ediniz
        4-Sayfayi kapatiniz
         */

        // 1-Amazon sayfasina gidiniz
        driver.get("https://amazon.com");
        // 2-Basligin "Amazon" icerdigini test ediniz
        String actualTitle= driver.getTitle();
        String expectedTitle= "Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED");
        }
        // 3-URL'in amazon icerdigini test ediniz
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="amazon";
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url test PASSED");
        }else {
            System.out.println("Url test FAILED");
        }
        // 4-Sayfayi kapatiniz
        driver.quit();


    }
}
