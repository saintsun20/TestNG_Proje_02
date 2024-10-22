package TC_505;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _505_Elementler {
   public  _505_Elementler (){
       PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "(//img[@class='tn-atom__img t-img loaded'])[10]")
    public WebElement fbImage;

   @FindBy(xpath = "(//img[@class='tn-atom__img t-img loaded'])[11]")
    public WebElement igImage;

    @FindBy(xpath = "(//img[@class='tn-atom__img t-img loaded'])[12]")
    public WebElement YtImage;

    @FindBy(xpath = "(//img[@class='tn-atom__img t-img loaded'])[13]")
    public WebElement lnkdImage;



}
