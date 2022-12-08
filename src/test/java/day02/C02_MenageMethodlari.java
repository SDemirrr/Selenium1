package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_MenageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        /*
        1. Yeni bir Class olusturalim.C06_ManageWindow
        2. Amazon soyfasina gidelim. https://www.amazon.com/
        3. Sayfanin konumunu ve boyutlarini yazdirin
        4. Sayfayi simge durumuna getirin
        5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        7. Sayfayi fullscreen yapin
        8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        9. Sayfayi kapatin
         */


        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere Konumu : "+driver.manage().window().getPosition());//Brovserin konumunu verir
        System.out.println("Pencere Olculeri : "+driver.manage().window().getSize());//Browserin olculerini verir
        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();//Penceryi simge durumuna getirir
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Yeni Pencere Konumu : "+driver.manage().window().getPosition());
        System.out.println("Yeni Pencere Olculeri : "+driver.manage().window().getSize());
        //7. Sayfayi fulscreen yapin
        driver.manage().window().fullscreen();
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen Pencere Konumu : "+driver.manage().window().getPosition());
        System.out.println("FullScreen Pencere Olculeri : "+driver.manage().window().getSize());
        //9. Sayfayi kapatin
        driver.close();
    }
}
