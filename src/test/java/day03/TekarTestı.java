package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class TekarTestı {
    public static void main(String[] args) {
        /*
        a.web sayfasına gidin. https://www.amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
         */
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amazon.com");
        //b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);
        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonuc=driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramaSonuc.get(0).getText());
        //sadece sonuc sayisini yazdirin
       String sonucYazisi=aramaSonuc.get(0).getText();
       String[] sonucYazisiElementi=sonucYazisi.split(" ");
        System.out.println("city bike arama sonucu : "+sonucYazisiElementi[2]);
        //sonuc sayisini LAMBDA ile yazdirin
        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(t-> System.out.println(t));
        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ilkResim=driver.findElements(By.className("s-image"));
        ilkResim.get(0).click();
        //sayfayi kapatin
        driver.close();



    }
}
