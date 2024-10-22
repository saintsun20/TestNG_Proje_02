package TC_504;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _504_Elementler {

    public _504_Elementler(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "(//a[@class='t-menu__link-item t978__tm-link'])[1]")
    public WebElement courses;

    @FindBy(xpath = "(//li[@class='t978__menu-item t-submenublocks__item'])[1]")
    public WebElement sdetcourse;

    @FindBy(xpath = "(//li[@class='t978__menu-item t-submenublocks__item'])[2]")
    public WebElement androidcourse;

    @FindBy(xpath = "(//li[@class='t978__menu-item t-submenublocks__item'])[3]")
    public WebElement datacourse;

    @FindBy(xpath = "(//h1")
    public WebElement sdetdogrulama;

    @FindBy(xpath = "(//p[@style='text-align: center;'])[1]")
    public WebElement androiddogrulama;

    @FindBy(xpath = "(//div[@class='tn-atom'])[2]")
    public WebElement veribilimidogrulama;


}
