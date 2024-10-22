package TC_502;

import Utility.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _TC_502 extends BaseDriverParameter {
    _502_Elementler element=new _502_Elementler();

    @Test(groups = {"Smoke Test"})
    public void TC_502(){
        element.campusLogin.click();
        Assert.assertTrue(element.usernamePlaceholder.isSelected(),"Giriş sayfası açılamadı");
    }
}
