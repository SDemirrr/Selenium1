package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locators_css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));


        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
           a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
           b. Locate email textbox
           c. Locate password textbox ve
           d. Locate signin button
           e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
               i. Username : testtechproed@gmail.com
               ii. Password : Test1234!
         */


        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://herokuapp.com");
        driver.findElement(By.cssSelector("a[class='sign-up highlight']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-sm btn-alt']")).click();
        // b. Locate email textbox
        WebElement emailTextBox=driver.findElement(By.cssSelector("input[id='email']"));
        // c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input[id='password']"));
        // d. Locate signin button
        WebElement signinButton=driver.findElement(By.cssSelector("button[class='btn btn-primary btn-lg btn-block']"));
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        emailTextBox.sendKeys("testtechproed@gmail.com");
        // ii. Password : Test1234!
        passwordTextBox.sendKeys("Test1234!");
        signinButton.click();

        driver.close();
    }
}
