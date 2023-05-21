package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassSonHali {

    // 3 tane test methodu olusturalim

    // 1. method'da amazon 'a gidip url'in amazon icerdigini test edin

    // 2. method'da Wisequarter anasayfaya gidip,title'in wisequarter icerdigini test edin

    // 3. method'da facebook anasayfaya gidip,title'in facebook icerdigini test edin

    // her method'da yeni bir driver olusturup, method sonunda driver'i kapatin


    @Test
    public void amazonTest(){

        // 1. method'da amazon 'a gidip url'in amazon icerdigini test edin

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();

    }

    @Test
    public void wiseTest(){

        // 2. method'da Wisequarter anasayfaya gidip,title'in Wise Quarter icerdigini test edin

        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedIcerik="Wise Quarter";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();

    }

    @Test
    public void facebookTest(){

        // 3. method'da facebook anasayfaya gidip,title'in Facebook icerdigini test edin

        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        String expectedIcerik="Facebook";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();


    }



}
