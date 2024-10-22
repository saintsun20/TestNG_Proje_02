package TC_505;

import Utility.BaseDriverParameter;
import io.opentelemetry.semconv.UrlAttributes;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class _TC_505 extends BaseDriverParameter {

    @Test(groups = "Regression Test")
    public void TC_505(){
    _505_Elementler element=new _505_Elementler();

    element.fbImage.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com/technostudy.turkiye"));

    element.YtImage.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("instagram.com/technostudy"));

    element.igImage.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("youtube.com/@TechnoStudyTR"));

    element.lnkdImage.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("company/techno-study-tr"));

    }
}
