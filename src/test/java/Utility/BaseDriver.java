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
        driver.get("https://techno.study/tr/");
        Tools.Bekle(2);

        WebElement basvurButton = driver.findElement(By.xpath("//a[@class='tn-atom js-click-zero-stat'][text()='BAŞVUR']"));
        basvurButton.click();


        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        Tools.Bekle(1);
        password.clear();
        Tools.Bekle(1);
        password.sendKeys("admin");

        WebElement rememberMe = driver.findElement(By.cssSelector("input[id=\"RememberMe\"]"));
        Tools.Bekle(1);
        rememberMe.click();

        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit'][text()='Log in']"));
        Tools.Bekle(1);
        loginBtn.click();
        Tools.Bekle(4);

        wait.until(ExpectedConditions.titleIs("Dashboard"));

        Assert.assertTrue(driver.getTitle().equals("Dashboard"), "Login olunamadı");
    }
}
