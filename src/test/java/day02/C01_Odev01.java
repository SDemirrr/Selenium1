package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        /*
          1. Yeni bir package olusturalim : day01
          2.Yeni bir class olusturalim : C03_GetMethods
          3.Amazon sayfasina gidelim. https://www.amazon.com/
          4.Sayfa basligini(title) yazdirin
          5.Sayfa basliginin “Amazon” icerdigini test edin
          6.Sayfa adresini(url) yazdirin
          7.Sayfa url’inin “amazon” icerdigini test edin.
          8.Sayfa handle degerini yazdirin
          9.Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
          10. Sayfayi kapatin.
         */



        //3.Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //4.Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi : "+driver.getTitle());
        //5.Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle= driver.getTitle();
        String expectedTitle="Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }
        //6.Sayfa adresini(url) yazdirin
        System.out.println("Sayfanin Url'i : "+driver.getCurrentUrl());
        //7.Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="amazon";
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAILED");
        }

        //8.Sayfa handle degerini yazdirin
        System.out.println("Handle degeri : "+driver.getWindowHandle());
        //9.Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualPageSource=driver.getPageSource();
        String expectedPageSource="Gateway";
        if (actualPageSource.contains(expectedPageSource)){
            System.out.println("SourceCode testi PASSED");
        }else {
            System.out.println("SourceCode testi FAILED");
        }
        //10. Sayfayi kapatin.
        driver.close();
    }
}
