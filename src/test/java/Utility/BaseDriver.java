package Utility;


import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri(){

        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Login();
    }

    @AfterClass
    public void KapanisIslemleri(){
       // System.out.println("Kapanis işlemleri yapılıyor");

        Tools.Bekle(3);
        driver.quit();
    }

    public void Login() {
        driver.get("https://admin-demo.nopcommerce.com/login?");
        Tools.Bekle(2);

        WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("admin@yourstore.com");


        WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("admin");

        WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit'][text()='Log in']"));
        loginBtn.click();

        wait.until(ExpectedConditions.titleIs("Dashboard"));

        Assert.assertTrue(driver.getTitle().equals("Dashboard"), "Login olunamadı");

    }
}
