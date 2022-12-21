package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/selenium depenicies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        /*
        1. Launch browser
        2. Navigate to url 'http://automationexercise.com'
        3. Verify that home page is visible successfully
        4. Click on 'Signup / Login' button
        5. Verify 'New User Signup!' is visible
        6. Enter name and email address
        7. Click 'Signup' button
        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        9. Fill details: Title, Name, Email, Password, Date of birth
        10. Select checkbox 'Sign up for our newsletter!'
        11. Select checkbox 'Receive special offers from our partners!'
        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        13. Click 'Create Account button'
        14. Verify that 'ACCOUNT CREATED!' is visible
        15. Click 'Continue' button
        16. Verify that 'Logged in as username' is visible
        17. Click 'Delete Account' button
        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

        */

        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePageVisible=driver.findElement(By.xpath("//section[@id='slider']"));
        if (homePageVisible.isDisplayed()){
            System.out.println("home page visible testi PASSED");
        }else {
            System.out.println("home page visible testi FAILED");
        }
        //4. Click on 'Signup / Login' button
        WebElement loginButton= driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        loginButton.click();
        //5. Verify 'New User Signup!' is visible
        WebElement newUserSignup= driver.findElement(By.xpath("//div[@class='signup-form']"));
        if (newUserSignup.isDisplayed()){
            System.out.println("New user Signup testi PASSED");
        }else {
            System.out.println("New user Signup testi FAILED");
        }
        //6. Enter name and email address
            WebElement nameBox= driver.findElement(By.xpath("//input[@name='name']"));
            WebElement emailBox= driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
            Thread.sleep(2000);
            emailBox.sendKeys("smhdmr007@gmail.com");
              Thread.sleep(2000);
             nameBox.sendKeys("Semih");
        Thread.sleep(2000);
        //7. Click 'Signup' button
        WebElement signupButton= driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        signupButton.click();
        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountInformation= driver.findElement(By.xpath("//h2[@class='title text-center']"));
        if (enterAccountInformation.isDisplayed()){
            System.out.println("Enter account information testi PASSED");
        }else {
            System.out.println("Enter account information testi FAILED");
        }
        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demir4545");
        driver.findElement(By.xpath("//option[@value='1']")).click();
        //driver.findElement(By.xpath("//div[@id='uniform-months]")).click();
        driver.findElement(By.xpath("//option[@value='2021']")).click();
        //10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Semih");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Demir");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Fenerbahce");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Manisa");
        driver.findElement(By.xpath("//option[@value='India']"));
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue'
    }
}
