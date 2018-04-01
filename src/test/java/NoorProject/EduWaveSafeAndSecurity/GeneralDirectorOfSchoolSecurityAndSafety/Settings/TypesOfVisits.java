// Created By Rami Alshawabkeh  3/14/18 2:07 PM


//الاعدات الزاريات المدرسية
package NoorProject.EduWaveSafeAndSecurity.GeneralDirectorOfSchoolSecurityAndSafety.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class TypesOfVisits {


    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.linkText("مدير عام الأمن والسلامة المدرسية");
    private By AdminSettingsMenuLoactor = By.id("divMenuItem_5894");
    private By TypesOfVisitsLocator = By.linkText("أنواع الزيارات");
    private By TableLoactor = By.id("ctl00_PlaceHolderMain_gvVisitType");

    @Test
    public void AddTypesOfVisits() throws InterruptedException {


        WebElement SwitchProfileLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        WebElement AdminSettingsMenuLoactorWait=waitQA.until(ExpectedConditions.visibilityOfElementLocated(AdminSettingsMenuLoactor));
        AdminSettingsMenuLoactorWait.click();

        WebElement TypesOfVisitsLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TypesOfVisitsLocator));
        TypesOfVisitsLocatorWait.click();

        Thread.sleep(1000);

        WebElement TableLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TableLoactor));

        List ListRowsXpath = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));

        int NumberOfRowaToADD = ListRowsXpath.size() + 1;


        int NumberOfRowaToADDParametres = NumberOfRowaToADD;

        By RowAdd = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + NumberOfRowaToADDParametres + "_tbVisitTypeDesc");

        Random RandomNum = new Random();
        int Number = RandomNum.nextInt(100);
        browserQA.findElement(RowAdd).sendKeys("نوع الزبارة" + Number);
        //browserQA.findElement(RowAdd).sendKeys("dddddddd");
        By AddButton = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + NumberOfRowaToADDParametres + "_lbtnAdd");
        browserQA.findElement(AddButton).click();

        By AddValidationMesage = By.id("ctl00_PlaceHolderMain_lblOperationResult");

        String AddValidationMesageElementString = browserQA.findElement(AddValidationMesage).getText();
        String AddValidationMesageString = "نوع الزياره مدخل مسبقا.";
        Assert.assertNotEquals(AddValidationMesageElementString , AddValidationMesageString , "الرجاء ادخال نوع زيارة غير مستخدم مسبقا");


    }


    private By YesButton = By.id("ctl00_ibtnYes");

    @Test
    public void DeleteTypesOfVisits() {

        WebElement TableLoactorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(TableLoactor));

        List ListRowsXpath = browserQA.findElements(By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/table[1]/tbody/tr/td[1]"));
        int NoOfRows = ListRowsXpath.size() - 1;
        int NoOfRowsparameter = NoOfRows;

        By DeleteLinkLocator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl" + NoOfRowsparameter + "_lbtnDelete");
        WebElement DeleteLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DeleteLinkLocator));
        DeleteLinkLocatorWait.click();


        browserQA.findElement(YesButton).click();

        By ValidationMesageLocator = By.id("ctl00_PlaceHolderMain_lblOperationResult");

        WebElement ValidationMesageLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ValidationMesageLocator));
        String ValidationMesageLocatorWaitString = browserQA.findElement(ValidationMesageLocator).getText();
        String ValidationMesageString = "لا يمكن الحذف لارتباط نوع الزيارة ببطاقة مدرسة.";

        Assert.assertNotEquals(ValidationMesageLocatorWaitString , ValidationMesageString , "لايمكن حذف الزيارة المدرسية");


    }

    private By txt_edit_Locator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl08_tbVisitTypeDesc");
    private By save_link_Locator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl08_lbtnUpdate");
    private By edit_link_Locator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl08_lbtnEdit");

    @Test
    public void EditTypesOfVisits() {


        By txt_edit_Locator = By.id("ctl00_PlaceHolderMain_gvVisitType_ctl08_tbVisitTypeDesc");
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(edit_link_Locator)).click();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_edit_Locator)).clear();
        Random random = new Random();
        int rand = random.nextInt();
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_edit_Locator)).sendKeys("Raad" + rand);
        waitQA.until(ExpectedConditions.visibilityOfElementLocated(save_link_Locator)).click();
    }
}
