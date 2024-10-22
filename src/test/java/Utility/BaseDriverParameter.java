package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    @Parameters("browserTipi")
    public void BaslangicIslemleri(String browserTipi){
       // System.out.println("Başlangıç işlemleri yapılıyor");

        switch (browserTipi.toLowerCase())
        {
            case "firefox": driver=new FirefoxDriver();break;
            case "edge": driver=new EdgeDriver();break;
            case "safari": driver=new SafariDriver();break;
            default: driver=new ChromeDriver();
        }

        //driver.manage().window().maximize(); // Ekranı max yapıyor.
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

      // WebElement basvurButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='t-btn t-btn_md '])[1]")));
      // basvurButton.click();

      // WebElement userName=wait.until(ExpectedConditions.elementToBeClickable(By.id("mat-input-0")));
      // userName.click();

      // WebElement password = driver.findElement(By.id("mat-input-1"));
      // password.sendKeys("admin");

      // WebElement rememberMe = driver.findElement(By.cssSelector("input[id=\"RememberMe\"]"));
      // Tools.Bekle(1);
      // rememberMe.click();

      // WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit'][text()='Log in']"));
      // Tools.Bekle(1);
      // loginBtn.click();
      // Tools.Bekle(4);

      // wait.until(ExpectedConditions.titleIs("Dashboard"));

      // Assert.assertTrue(driver.getTitle().equals("Dashboard"), "Login olunamadı");
    }

}
