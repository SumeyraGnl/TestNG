package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualitydemyNegatifLoginTesti {

    @Test
    public void test01(){
        // QUALITYDEMY ANA SAYFAYA GIDIN

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // login linkine tiklayin

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // gecersiz username ve sifre yi ilgili kutulara yazin

        qualitydemyPage.emailKutusu.sendKeys("qdGecersizUsername");
        qualitydemyPage.passwordKutusu.sendKeys("qdGecersizPassword");


        // login butonuna basin

        qualitydemyPage.loginButonu.click();

        // basarili olarak giris yapilamadigini test edin

        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        // sayfayi kapatin

        Driver.getDriver().close();
    }

}