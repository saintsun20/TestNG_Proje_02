package TC_506;

import Utility.BaseDriverParameter;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _TC_506 extends BaseDriverParameter {

    @Test(groups = "Smoke Test")
    public void TC_506(){
        _506_Elementler element=new _506_Elementler();
        Actions actions=new Actions(driver);

        actions.moveToElement(element.courses);
        element.sdetcourse.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();

        actions.moveToElement(element.courses);
        element.androidcourse.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();

        actions.moveToElement(element.courses);
        element.datacourse.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();

        actions.moveToElement(element.courses);
        element.jobcenter.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();

        element.kullanimSart.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();

        element.gizlilikPolitika.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();

        element.cerezPolitika.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();

        element.bilgiAlin.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.imgButton)).click();


    }
}
