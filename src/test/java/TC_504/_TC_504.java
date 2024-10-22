package TC_504;

import TC_501._501_Elementler;
import Utility.BaseDriverParameter;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _TC_504 extends BaseDriverParameter {

    @Test(groups = "Smoke Test")
    public void TC_504(){

        _501_Elementler element=new _501_Elementler();
        Actions actions=new Actions(driver);

        actions.moveToElement(element.courses);
        element.sdetcourse.click();
        Assert.assertTrue
                (element.sdetdogrulama.getText().toLowerCase().contains(("test")),"Sdet sayfası açılmadı");

        actions.moveToElement(element.courses);
        element.androidcourse.click();
        Assert.assertTrue
                (element.androiddogrulama.getText().toLowerCase().contains("android"),"Android kursu sayfası açılmadı");

        actions.moveToElement(element.courses);
        element.datacourse.click();
        Assert.assertTrue
                (element.veribilimidogrulama.getText().toLowerCase().contains("veri bilimi"),"Veri bilimi kursu sayfası açılmadı");


    }
}
