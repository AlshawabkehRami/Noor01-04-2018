/*
 * Created By Rami Alshawabkeh  3/21/18 11:15 AM
 */

package NoorProject.EduWaveSafeAndSecurity.StaffSAndSInDistrict.TheReport.Schools;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class SchoolDataWithEducationalStagesStaff {

    private By switch_profile_Locator = By.xpath("/html/body/form/div[4]/div[2]/div[1]/div[2]/a");
    private By director_of_security_and_safety_Locator = By.xpath("/html/body/form/div[4]/div[2]/div[1]/div[2]/div/div/div/div[1]/div/ul/li/a");
    private By reports_menu_Locator = By.id("divMenuItem_304");
    private By SerachBTNLocatr = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/ul/li[2]/a/i");
    private By SerachTXTLocatr = By.id("myInput");
    private By ReportLOcatr = By.xpath("//*[@id=\"ctl00_PlaceHolderMain_divSearchList\"]/div[3]/div[4]/a");
    private By OfficeNameLOcater = By.id("select2-ctl00_PlaceHolderMain_ddlSupervisionCenter-container");
    private By OfficeNameSearchLOcater = By.xpath("/html/body/span/span/span[1]/input");
    private By SearchBTNLocator = By.id("ctl00_PlaceHolderMain_ibtnSearch");
    private By BackBTN = By.id("ctl00_PlaceHolderMain_ibtnBack");


    //
//بيانات المدرسة مع المراحل التعليمية
    @Test
    public void SchoolDataWithEducationalStages() {
        browserQA.findElement(switch_profile_Locator).click();
        browserQA.findElement(director_of_security_and_safety_Locator).click();
        browserQA.findElement(reports_menu_Locator).click();
        browserQA.findElement(SerachBTNLocatr).click();
        WebElement SerachTXTLocatrWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SerachTXTLocatr));
        SerachTXTLocatrWait.sendKeys("بيانات المدرسة مع المراحل التعليمية");

        WebElement ReportLOcatrWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ReportLOcatr));
        ReportLOcatrWait.click();

        WebElement OfficeNameLOcaterWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(OfficeNameLOcater));
        OfficeNameLOcaterWait.click();
        browserQA.findElement(OfficeNameSearchLOcater).sendKeys("مكتب الخالدية الشمالية" , Keys.ENTER);
        try {
            WebElement SearchBTNLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchBTNLocator));
            SearchBTNLocatorWait.click();
        } catch (Exception e) {
            WebElement SearchBTNLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SearchBTNLocator));
            SearchBTNLocatorWait.click();
        }


        WebElement BackBTNWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BackBTN));
        BackBTNWait.click();

        System.out.println(browserQA.findElement(ReportLOcatr).getText());
        Assert.assertEquals(browserQA.findElement(ReportLOcatr).getText() , "بيانات المدرسة مع المراحل التعليمية" , "تم الروجع الى صفحة خاطئة");

    }
}
