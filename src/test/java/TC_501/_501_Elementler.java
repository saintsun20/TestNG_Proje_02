package TC_501;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _501_Elementler {

public _501_Elementler(){
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

    @FindBy(xpath = "(//li[@class='t978__menu-item t-submenublocks__item'])[4]")
    public WebElement jobcenter;

    @FindBy(xpath = "(//h1")
    public WebElement sdetdogrulama;

    @FindBy(xpath = "(//p[@style='text-align: center;'])[1]")
    public WebElement androiddogrulama;

    @FindBy(xpath = "(//div[@class='tn-atom'])[2]")
    public WebElement veribilimidogrulama;

    @FindBy(xpath = "//div[@class='t396__elem tn-elem tn-elem__6246351201622986948166']")
    public WebElement jobCenterDogrulama;


}
