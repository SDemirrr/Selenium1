package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton=driver.findElement(By.xpath("//*[@class='added-manually']"));
        WebElement deleteButtonText=driver.findElement(By.xpath("//*[text()='Add Element']"));//xpath text ile locate alma
        /*
        Locate alirken sadece text() kullanaxaksak //*[text()='Add Element'] bu format kullanilir
        Attribute kullanacaksak //*[@class='added-manually'] bu format kullanilir
         */

        if (deleteButton.isDisplayed()){
            System.out.println("Delete Button Testi PASSED");
        }else {
            System.out.println("Delete Button Testi FAILED");
        }

        //4- Delete tusuna basin
        deleteButton.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement=driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElement.isDisplayed()){
            System.out.println("Add/Remove Elements yazisi Testi PASSED");
        }else {
            System.out.println("Add/Remove Elements yazisi Testi FAILED");
        }

        //sayfayi kapatin
        driver.close();
    }
}
