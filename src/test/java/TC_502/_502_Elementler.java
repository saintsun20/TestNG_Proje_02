package TC_502;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _502_Elementler {

    public _502_Elementler(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy (xpath = "(//a[@class='t-btn t-btn_md '])[1]")
    public WebElement campusLogin;

    @FindBy(id = "mat-input-0")
    public WebElement usernamePlaceholder;
}
