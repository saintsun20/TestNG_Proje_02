package TC_503;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _503_Elementler {

    public _503_Elementler(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//a[@class='tn-atom js-click-zero-stat']")
    public WebElement basvurButon;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "tildaspec-phone-part[]")
    public WebElement phone;

    @FindBy(name = "Input")
    public WebElement yas;

    @FindBy(name = "Input_2")
    public WebElement meslek;

    @FindBy(name = "country")
    public WebElement egitimSec;

    @FindBy(name = "country_2")
    public WebElement ulkeSec;

    @FindBy(name = "course")
    public WebElement kurs;

    @FindBy(name = "survey")
    public WebElement neredenDuydunuz;

    @FindBy(name = "Checkbox")
    public WebElement onayKutu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement gonder;

    @FindBy(xpath = "(//p[@style='text-align: center;'])[1]")
    public WebElement basvuruOnay;


}
