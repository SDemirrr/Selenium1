package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.techproeducation.com");
        driver.close();
        /*
        ileride wait konusunu daha genis ele alacagz
        Bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore bir
        yukkleme suresine ihtiyac vardir veya bir webelementin kullailbilmesi icin zamana ihtiyac olabilir
        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        maximum sureyi belirleme olanagi tanir
        */
    }
}
