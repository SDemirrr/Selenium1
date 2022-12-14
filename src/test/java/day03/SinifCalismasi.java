package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SinifCalismasi {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        /*
                 1. Bir class oluşturun: LoginTest
         2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
            a. http://a.testaddressbook.com adresine gidiniz.
            b. Sign in butonuna basin
            c. email textbox,password textbox, and signin button elementlerini locate ediniz..
            d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
                i. Username : testtechproed@gmail.com
                ii. Password : Test1234!
            e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
            f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
         3. Sayfada kac tane link oldugunu bulun
         */


        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get(" http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        driver.findElement(By.linkText("Sign in")).click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emeailTextbox = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        WebElement signin = driver.findElement(By.name("commit"));
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        emeailTextbox.sendKeys("testtechproed@gmail.com");
        //ii. Password : Test1234!
        password.sendKeys("Test1234!");
        signin.click();
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedUser=driver.findElement(By.className("navbar-text"));
        if (expectedUser.isDisplayed()){
            System.out.println("ExpectedUser testi PASSED");
        }else {
            System.out.println("ExpectedUser testi FAILED");
        }
        //-------
        String expectedUserYazisi="testtechproed@gmail.com";
        String actualUserYazisi=expectedUser.getText();
        if (actualUserYazisi.equals(expectedUserYazisi)){
            System.out.println("ExpectedUser testi PASSED");
        }else {
            System.out.println("ExpectedUser testi FAILED");
        }

        //--------
        //Bir webelementin uzerindeki yaziyi konsolda yazdirabilmek icin getText() method'u kullanilir
         
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini(displayed) doğrulayin(verify).
        WebElement adresses=driver.findElement(By.linkText("Adresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if (adresses.isDisplayed()){
            System.out.println("Adresses testi PASSED");
        }else {
            System.out.println("Adresses testi FAILED");
        }

        if (signOut.isDisplayed()){
            System.out.println("Adresses testi PASSED");
        }else {
            System.out.println("Adresses testi FAILED");
        }
        //3. Sayfada kac tane link oldugunu bulun
        List<WebElement> linkList=driver.findElements(By.tagName("a"));
        System.out.println("Link adedi : "+linkList.size());

        //4.Linkleri yazdirin
        for (WebElement each:linkList) {
            System.out.println("Linkler : "+each.getText());

            //Linkleri LAMBDA ile yazdirin
            linkList.forEach(t-> System.out.println(t.getText()));

            //Sayfayi kapatiniz
            driver.close();
        }
    }
}
