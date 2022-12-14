package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    public static void main(String[] args) {
        /*
        Amazon sayfasina gidiniz
        Arama kutusunu locate ediniz
        Arama kutusunun tagName'inin input oldugunu test ediniz
        Arama kutusunun name attribute'nun degerinin field-keywords oldugunu test ediniz
        Sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        //Amazon sayfasina gidiniz
        driver.get("https://amazon.com");
        //Arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //Arama kutusunun tagName'inin input oldugunu test ediniz
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName testi PASSED : "+actualTagName);
        }else {
            System.out.println("TagName testi FAILED : "+actualTagName);
        }
        //Arama kutusunun name attribute'nun degerinin field-keywords oldugunu test ediniz
        String expectedAttributeName="field-keywords";
        String actualAttributeName=aramaKutusu.getAttribute("name");
        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("AttributeName testi PASSED");
        }else {
            System.out.println("AttributeName testi FAILED");
        }

        //Arama kutusunun konumunu yazdirin
        System.out.println("Arama kutusu konumu : "+aramaKutusu.getLocation());

        //Sayfayi kapatin
        driver.close();


    }
}
