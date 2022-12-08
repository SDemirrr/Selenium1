package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_NavigateClassWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        /*
        1-Youtube ana sayfasina gidelim https://youtube.com
        2-Amazon sayfasina gidelim https://amazon.com
        3-Tekrar youtube sayfasina donelim
        4-Yeniden amazon sayfasina gidelim
        5-Sayfayi Refresh(Yenile) yapalim
        6-Tum sayfalari kapatalim
         */

        // 1-Youtube ana sayfasina gidelim https://youtube.com
        Thread.sleep(2000);
        driver.navigate().to("https://youtube.com");
        // 2-Amazon sayfasina gidelim https://amazon.com
        Thread.sleep(2000);
        driver.navigate().to("https://amazon.com");
        // 3-Tekrar youtube sayfasina donelim
        Thread.sleep(2000);
        driver.navigate().back();
        // 4-Yeniden amazon sayfasina gidelim
        Thread.sleep(2000);
        driver.navigate().forward();
        // 5-Sayfayi Refresh(Yenile) yapalim
        Thread.sleep(2000);
        driver.navigate().refresh();
        // 6-Tum sayfalari kapatalim
        Thread.sleep(2000);
        driver.quit();
    }
}
