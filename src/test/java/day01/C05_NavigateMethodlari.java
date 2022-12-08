package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to(); methodu sayfada ileri geri yapmak icin kullanilir
        //driver.get(); methodu gibi bizi istedigimiz url'e goturur

        driver.navigate().to("https://techproeducation.com");

        //Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back(); //Bir onceki sayfaya geri doner
        //Tekrar techProed sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); //ilk sayfadan ileri gider
        //Techproed sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();//Sayfayi yeniler
        //Son olarak sayfayi kapatiniz
        driver.close();

    }
}
