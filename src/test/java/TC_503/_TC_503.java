package TC_503;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _TC_503 extends BaseDriverParameter {

    @Test(groups = {"Regression Test"})
    public void TC_503(){
       _503_Elementler element=new _503_Elementler();

       wait.until(ExpectedConditions.elementToBeClickable(element.basvurButon)).click();
       wait.until(ExpectedConditions.visibilityOf(element.name)).sendKeys("Test Selçuk Aydın");
       element.email.sendKeys("selcuk.sa32@gmail.com");
       element.phone.sendKeys("5079701066");
       element.yas.sendKeys("33");
       element.meslek.sendKeys("SDET");

        Select egitim=new Select(element.egitimSec);
        egitim.selectByValue("Üniversite");

        Select ulke=new Select(element.ulkeSec);
        ulke.selectByValue("Andorra");

        Select kurs=new Select(element.kurs);
        kurs.selectByValue("Sdet Türkçe");

        Select nerdenDuydun=new Select(element.neredenDuydunuz);
        nerdenDuydun.selectByValue("Youtube");

        element.onayKutu.click();
        element.gonder.click();

        Assert.assertTrue(element.basvuruOnay.getText().contains("alınmıştır"),"Başvuru alınamadı");


    }
}
