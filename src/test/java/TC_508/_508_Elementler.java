package TC_508;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _508_Elementler {

    public _508_Elementler(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//a[@rel='noreferrer noopener']")
    public WebElement kullanimŞart;

    @FindBy(xpath = "//div[@class='t-col t-col_8 t-prefix_2']")
    public WebElement sartlarMetin;
}
