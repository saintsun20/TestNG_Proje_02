package TC_506;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _506_Elementler {

public _506_Elementler(){
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

    @FindBy(xpath = "(//a[@class='t-btn t-btn_md js-click-stat'])[1]")
    public WebElement bilgiAlin;

    @FindBy(xpath = "//img[@alt='TechnoStudy']")
    public WebElement imgButton;

    @FindBy(xpath = "(//a[@target='_blank'])[2]")
    public WebElement kullanimSart;

    @FindBy(xpath = "(//a[@target='_blank'])[3]")
    public WebElement gizlilikPolitika;

    @FindBy(xpath = "(//a[@target='_blank'])[4]")
    public WebElement cerezPolitika;

}
