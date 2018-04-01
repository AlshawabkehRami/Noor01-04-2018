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

public class SchoolsThatHaveCompletedTheFormAndHaveNotBeenApprovedByTheSchoolLeaderStaff {


    private By switch_profile_Locator = By.xpath("/html/body/form/div[4]/div[2]/div[1]/div[2]/a");
    private By director_of_security_and_safety_Locator = By.xpath("/html/body/form/div[4]/div[2]/div[1]/div[2]/div/div/div/div[1]/div/ul/li/a");
    private By reports_menu_Locator = By.xpath("/html/body/form/div[6]/div/div[1]/div/ul/li[2]/a");
    private By serach_logo_Locator = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/ul/li[2]/a/i");
    private By search_field_Locator = By.id("myInput");
    private By SchoolsThatHaveCompletedTheFormAndHaveNotBeenApprovedByTheSchoolLeader_link = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/div[3]/div[2]/a");
    private By drop_down_list_Locator = By.id("select2-ctl00_PlaceHolderMain_ddlFormName-container");
    private By txt_field_Locator = By.xpath("/html/body/span/span/span[1]/input");
    private By btn_search_Locator = By.id("ctl00_PlaceHolderMain_ibtnSearch");

    //
//المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها من قائد المدرسة
    @Test
    public void SchoolsThatHaveCompletedTheFormAndHaveNotBeenApprovedByTheSchoolLeader() throws InterruptedException {
        browserQA.findElement(switch_profile_Locator).click();
        browserQA.findElement(director_of_security_and_safety_Locator).click();
        WebElement reports_menu_Locator_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(reports_menu_Locator));
        reports_menu_Locator_wait.click();
        WebElement search_logo_Locator_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(serach_logo_Locator));
        search_logo_Locator_wait.click();
        WebElement search_field_Locator_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(search_field_Locator));
        search_field_Locator_wait.sendKeys("المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها");
        WebElement SchoolsThatHaveCompletedTheFormAndHaveNotBeenApprovedByTheSchoolLeader_link_Locator_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SchoolsThatHaveCompletedTheFormAndHaveNotBeenApprovedByTheSchoolLeader_link));
        SchoolsThatHaveCompletedTheFormAndHaveNotBeenApprovedByTheSchoolLeader_link_Locator_wait.click();
        WebElement drop_down_list_Locator_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(drop_down_list_Locator));
        drop_down_list_Locator_wait.click();
        WebElement txt_field_Locator_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(txt_field_Locator));
        txt_field_Locator_wait.sendKeys("AAAAAAAAAAAAAA" , Keys.ENTER);
        Thread.sleep(300);
        WebElement btn_search_Locator_wait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(btn_search_Locator));
        btn_search_Locator_wait.click();
        String expected_result = "   المدارس التي قامت بتعبئة الاستمارة ولم يتم اعتمادها من قائد المدرسة   ";
        By acutal_result = By.xpath("/html/body/form/div[7]/div[2]/div[2]/div/div/div[5]/div/span/div/table/tbody/tr[4]/td[3]/div/div[1]/div/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[5]/td[3]/table/tbody/tr/td/div/div/span");
        WebElement actual__reuslt = waitQA.until(ExpectedConditions.visibilityOfElementLocated(acutal_result));
        String actual___result = actual__reuslt.getText();
        System.out.println(actual___result);
        Assert.assertEquals(actual___result , expected_result , "التقرير المطلوب غير متوفر");


    }
}

