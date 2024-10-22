package TC_507;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_507 extends BaseDriverParameter {

    @Test()
    public void TC_507(){
        _507_Elementler element=new _507_Elementler();

        element.sdetDetay.click();
        Assert.assertTrue
                (element.sdetdogrulama.getText().toLowerCase().contains(("test")),"Sdet sayfası açılmadı");

        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.androidDetay)).click();
        Assert.assertTrue
                (element.androiddogrulama.getText().toLowerCase().contains("android"),"Android kursu sayfası açılmadı");

        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.veriBilimiDetay)).click();
        Assert.assertTrue
                (element.veribilimidogrulama.getText().toLowerCase().contains("veri bilimi"),"Veri bilimi kursu sayfası açılmadı");


    }
}
