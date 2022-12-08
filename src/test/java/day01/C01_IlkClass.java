package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En temel haliyle bir otomasyon yapmak icin
        Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermrmiz gerekir
        Bunun icin Java kutuphanesinden System.setProperty(); method'unu kullaniriz.
        ve method icine ilk olarak driver'i yazariz.Ikinci olarak onun fiziki yolunu kopyalariz.
         */

        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");

        System.out.println("Actual title : "+driver.getTitle());//Gidilen sitenin basligini yazdirir
        System.out.println("Actual URL : "+driver.getCurrentUrl());//Gidilen sayfanin Url'ini getirir.

        System.out.println(driver.getPageSource());

    }
}
