package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_MenageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        /*
        1. Yeni bir Class olusturalim.C07_ManageWindowSet
        2. Amazon soyfasina gidelim. https://www.amazon.com/
        3. Sayfanin konumunu ve boyutlarini yazdirin
        4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        8. Sayfayi kapatin
         */


        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boutlari : "+driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));//sayfanin konumunu istediginiz sekilde ayarlar
        driver.manage().window().setSize(new Dimension(600,300));//sayfanin olculerini iStediginiz sekilde ayarlar
        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanin yeni konumu : "+driver.manage().window().getPosition());
        System.out.println("Sayfanin yeni boutlari : "+driver.manage().window().getSize());
        //8. Sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();
    }
}
