package TC_507;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _507_Elementler {

    public _507_Elementler(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@class='t396__elem tn-elem tn-elem__5159634201661161478639']")
    public WebElement sdetDetay;

    @FindBy(xpath = "//div[@class='t396__elem tn-elem tn-elem__5159634201663336291315']")
    public WebElement androidDetay;

    @FindBy(xpath = "//div[@class='t396__elem tn-elem tn-elem__5159634201490289915734']")
    public WebElement veriBilimiDetay;

    @FindBy(xpath = "//img[@alt='TechnoStudy']")
    public WebElement imgButton;

    @FindBy(xpath = "//h1")
    public WebElement sdetdogrulama;

    @FindBy(xpath = "(//p[@style='text-align: center;'])[1]")
    public WebElement androiddogrulama;

    @FindBy(xpath = "(//div[@class='tn-atom'])[2]")
    public WebElement veribilimidogrulama;
}
