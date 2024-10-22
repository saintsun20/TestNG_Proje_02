package TC_508;

import Utility.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_508 extends BaseDriverParameter {

    @Test(groups = "Smoke Test")
    public void TC_508(){
    _508_Elementler element=new _508_Elementler();

    element.kullanimŞart.click();

    Assert.assertTrue(element.sartlarMetin.getText().contains("Web sitesinin amacı"),"Sayfa açılmadı");

    }
}
