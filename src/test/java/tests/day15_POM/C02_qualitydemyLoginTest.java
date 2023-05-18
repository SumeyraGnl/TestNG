package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C02_qualitydemyLoginTest {

    @Test
    public void test01(){

        // qualitydemy anasayfaya gidin

        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage=new QualitydemyPage();

        // login linkine tiklayin

        qualitydemyPage.ilkLoginLinki.click();

        // gecerli username ve sifreyi ilgili kutulara yazin

        qualitydemyPage.emailKutusu.sendKeys(" anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        // login butonuna basin

        qualitydemyPage.loginButonu.click();

        // basarili olarak giris yapildigini test edin

        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());

        // sayfayi kapatin

        Driver.closeDriver();
    }
}
