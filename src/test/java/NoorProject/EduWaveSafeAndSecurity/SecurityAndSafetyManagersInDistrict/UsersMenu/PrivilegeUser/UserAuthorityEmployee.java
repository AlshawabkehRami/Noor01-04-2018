/*
 * Created By Rami Alshawabkeh  3/18/18 5:02 PM
 */

package NoorProject.EduWaveSafeAndSecurity.SecurityAndSafetyManagersInDistrict.UsersMenu.PrivilegeUser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static NoorProject.Other.NoorLogin.browserQA;
import static NoorProject.Other.NoorLogin.waitQA;

public class UserAuthorityEmployee {

    private By SwitchProfileLocator = By.id("ctl00_oHeader_divSwitchUser");
    private By UserNameLabelLocator = By.partialLinkText("مدير الأمن والسلامة في إدارة التعليم");
    private By UsersTypeMenuLocator = By.id("divMenuItem_3923");
    private By MyInputLocator = By.id("myInput");
    private By UserNameLinkLocator = By.linkText("موظف صلاحيات مدير الامن والسلامة في ادارة التعليم");
    private By AddedNewUserLinkLocator = By.id("ctl00_PlaceHolderMain_lbtnAddManagementUser");
    private By UserIdFieldLocator = By.id("ctl00_PlaceHolderMain_tbIdentification");
    private By IbtnCheckIdentificationIDLocator = By.id("ctl00_PlaceHolderMain_ibtnCheckIdentificationID0");
    private By DDlNationalityLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlNationality-container");
    private By DDlNationalitySearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By PassportNumberLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbPassportNumber");
    private By CLRIdentificationDateLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_clrIdentificationDate_ibtnOpenCalendar");
    private By CLRIdentificationDayLocator = By.xpath("/html/body/div/table/tbody/tr[3]/td[5]");
    private By CLRResidenceDateLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_clrResidenceDate_ibtnOpenCalendar");
    private By CLRResidenceDayLocator = By.xpath("/html/body/div/table/tbody/tr[3]/td[3]");
    private By DDLIdentificationPlaceLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlIdentificationPlace-container");
    private By DDLIdentificationPlaceSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By ArabicFirstNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicFirstName");
    private By ArabicSecondNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicSecondName");
    private By ArabicThirdNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicThirdName");
    private By ArabicLastNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicLastName");
    private By EnglishFirstNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishFirstName");
    private By EnglishSecondNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishSecondName");
    private By EnglishThirdNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishThirdName");
    private By EnglishLastNameLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishLastName");
    private By BirthDateLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_clrBirthDate_ibtnOpenCalendar");
    private By BirthDateLocatorDate = By.xpath("/html/body/div/table/tbody/tr[3]/td[3]");
    private By ArabicBirthPlaceLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbArabicBirthPlace");
    private By EnglishBirthPlaceLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbEnglishBirthPlace");
    private By DDlReligionLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlReligion-container");
    private By DDlReligionSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLBloodTypesLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlBloodTypes-container");
    private By DDLBloodTypesSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDlResidenceTypeLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlResidenceType-container");
    private By DDlResidenceTypeSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDLResidenceOwnerShipLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlResidenceOwnerShip-container");
    private By DDLResidenceOwnerShipSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDlSocialSituationLOcator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlSocialSituation-container");
    private By DDlSocialSituationSerachLOcator = By.xpath("/html/body/span/span/span[1]/input");
    private By UserAuthenticationUCLocatr = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbUserName");
    private By UserAuthenticationUC_ibtnGoLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_ibtnGo");
    private By UserAuthenticationUClblUserNameVerifyLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_lblUserNameVerify");
    private By PasswordLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbPassword");
    private By ConfirmPasswordLoactor = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbConfirmPassword");
    private By DDLManagmentRegionLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlManagmentRegion-container");
    private By DDLManagmentRegionSearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDlCityLocator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlCity-container");
    private By DDlCitySearchLocator = By.xpath("/html/body/span/span/span[1]/input");
    private By DDlRegionLOcator = By.id("select2-ctl00_PlaceHolderMain_oUserAuthenticationUC_ddlRegion-container");
    private By DDlRegionSearchLOcator = By.xpath("/html/body/span/span/span[1]/input");
    private By MainStreetLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbMainStreet");
    private By SubStreetLOcator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbSubStreet");
    private By HouseNoLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbHouseNo");
    private By HouseNextToLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_tbHouseNextTo");
    private By TelephoneNo1Locator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbTelephoneNo1");
    private By TelephoneNo2LOcator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbTelephoneNo2");
    private By AdmissionMobileNoLOcator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbAdmissionMobileNo");
    private By EmailAddressLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbEmailAddress");
    private By StreetAddressLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbStreetAddress");
    private By ZipCodeLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbZipCode");
    private By POBoxLocator = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbPOBox");
    private By FaxNumber = By.id("ctl00_PlaceHolderMain_oUserAuthenticationUC_oAddressUC_tbFaxNumber");
    private By btnSaveLocator = By.id("ctl00_PlaceHolderMain_ibtnSave");


    @Test
    public void ADDUserAuthorityEmployee() throws InterruptedException {

        WebElement SwitchProfileLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(SwitchProfileLocator));
        SwitchProfileLocatorWait.click();

        WebElement UserNameLabelLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLabelLocator));
        UserNameLabelLocatorWait.click();

        WebElement UsersTypeMenuLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UsersTypeMenuLocator));
        UsersTypeMenuLocatorWait.click();

        WebElement MyInputLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(MyInputLocator));
        MyInputLocatorWait.sendKeys(" صلاحيات ");

        WebElement ReportLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserNameLinkLocator));
        ReportLinkLocatorWait.click();

        WebElement AddedNewUserLinkLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(AddedNewUserLinkLocator));
        AddedNewUserLinkLocatorWait.click();

        WebElement UserIdFieldLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserIdFieldLocator));
        Random Rand = new Random();
        int RandomNumber = Rand.nextInt(1000000);
        UserIdFieldLocatorWait.sendKeys("1" + RandomNumber);

        WebElement IbtnCheckIdentificationIDLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(IbtnCheckIdentificationIDLocator));
        IbtnCheckIdentificationIDLocatorWait.click();

        WebElement DDlNationalityLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlNationalityLocator));
        DDlNationalityLocatorWait.click();

        WebElement DDlNationalitySearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlNationalitySearchLocator));
        DDlNationalitySearchLocatorWait.sendKeys("أسبانيا" , Keys.ENTER);

        Thread.sleep(1000);
        WebElement PassportNumberLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(PassportNumberLocator));
        PassportNumberLocatorWait.sendKeys("2" + RandomNumber);


        try {
            WebElement CLRIdentificationDateLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDateLocator));
            CLRIdentificationDateLocatorWait.click();
        } catch (Exception e) {
            WebElement CLRIdentificationDateLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDateLocator));
            CLRIdentificationDateLocatorWait.click();
        }


        WebElement CLRIdentificationDayLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRIdentificationDayLocator));
        CLRIdentificationDayLocatorWait.click();


        WebElement CLRResidenceDateLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDateLocator));
        CLRResidenceDateLocatorWait.click();

        WebElement CLRResidenceDayLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(CLRResidenceDayLocator));
        CLRResidenceDayLocatorWait.click();

        WebElement DdlIdentificationPlaceLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLIdentificationPlaceLocator));
        DdlIdentificationPlaceLocatorWait.click();

        WebElement DDLIdentificationPlaceSearchLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLIdentificationPlaceSearchLocator));
        DDLIdentificationPlaceSearchLocatorWait.sendKeys("الشمال" , Keys.ENTER);

        browserQA.findElement(ArabicFirstNameLocator).sendKeys("رامي");
        browserQA.findElement(ArabicSecondNameLocator).sendKeys("أحمد");
        browserQA.findElement(ArabicThirdNameLocator).sendKeys("علي");
        browserQA.findElement(ArabicLastNameLocator).sendKeys("الشوابكة");
        browserQA.findElement(EnglishFirstNameLocator).sendKeys("Rami");
        browserQA.findElement(EnglishSecondNameLocator).sendKeys("Ahmad");
        browserQA.findElement(EnglishThirdNameLocator).sendKeys("Ali");
        browserQA.findElement(EnglishLastNameLocator).sendKeys("Alshawabkeh");

        WebElement BirthDateLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocator));
        BirthDateLocatorWait.click();
        WebElement BirthDateLocatorDateWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(BirthDateLocatorDate));
        BirthDateLocatorDateWait.click();

        WebElement ArabicBirthPlaceLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ArabicBirthPlaceLocator));
        ArabicBirthPlaceLocatorWait.sendKeys(" مكان الميلاد بالعربية ");
        browserQA.findElement(EnglishBirthPlaceLocator).sendKeys(" مكان الميلاد بالإنجليزية ");

        browserQA.findElement(DDlReligionLocator).click();
        browserQA.findElement(DDlReligionSearchLocator).sendKeys("أخرى" , Keys.ENTER);

        browserQA.findElement(DDLBloodTypesLocator).click();
        browserQA.findElement(DDLBloodTypesSearchLocator).sendKeys("AB+" , Keys.ENTER);


        WebElement DDlResidenceTypeLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlResidenceTypeLocator));
        DDlResidenceTypeLocatorWait.click();
        browserQA.findElement(DDlResidenceTypeSearchLocator).sendKeys("بيت شعر" , Keys.ENTER);

        WebElement DDLResidenceOwnerShipLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLResidenceOwnerShipLocator));
        DDLResidenceOwnerShipLocatorWait.click();
        browserQA.findElement(DDLResidenceOwnerShipSearchLocator).sendKeys("ملكية بالوقف/بالهبة" , Keys.ENTER);


        WebElement DDlSocialSituationLOcatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlSocialSituationLOcator));
        DDlSocialSituationLOcatorWait.click();
        browserQA.findElement(DDlSocialSituationSerachLOcator).sendKeys("مطلق" , Keys.ENTER);


        WebElement UserAuthenticationUCLocatrWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUCLocatr));
        UserAuthenticationUCLocatrWait.clear();
        //browserQA.findElement(UserAuthenticationUCLocatr).sendKeys("rami005");
        UserAuthenticationUCLocatrWait.sendKeys("Rami" + RandomNumber);
        WebElement UserAuthenticationUC_ibtnGoLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUC_ibtnGoLocator));
        UserAuthenticationUC_ibtnGoLocatorWait.click();

        WebElement UserAuthenticationUC_lblUserNameVerifyLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(UserAuthenticationUClblUserNameVerifyLocator));

        String ValidationMeassageUN = browserQA.findElement(UserAuthenticationUClblUserNameVerifyLocator).getText();
        String ValidationMeassageUNString = "تم استخدام اسم الدخول من قبل، الرجاء إدخال اسم جديد.";
        Assert.assertNotEquals(ValidationMeassageUN , ValidationMeassageUNString , "الرجاء ادخال اسم مستخدم غير مستخدم من قبل  ");

        browserQA.findElement(PasswordLocator).click();
        browserQA.findElement(PasswordLocator).sendKeys("1234");
        browserQA.findElement(ConfirmPasswordLoactor).clear();
        browserQA.findElement(ConfirmPasswordLoactor).sendKeys("1234");

        WebElement DDLManagmentRegionLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDLManagmentRegionLocator));
        DDLManagmentRegionLocatorWait.click();
        browserQA.findElement(DDLManagmentRegionSearchLocator).sendKeys("الرياض" , Keys.ENTER);

        Thread.sleep(1000);
        WebElement DDlCityLocatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlCityLocator));
        DDlCityLocatorWait.click();
        browserQA.findElement(DDlCitySearchLocator).sendKeys("محافظة الرياض 1" , Keys.ENTER);
        Thread.sleep(1000);
        WebElement DDlRegionLOcatorWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(DDlRegionLOcator));
        DDlRegionLOcatorWait.click();
        browserQA.findElement(DDlRegionSearchLOcator).sendKeys("مركز الرياض 1" , Keys.ENTER);
        browserQA.findElement(MainStreetLocator).sendKeys(" الشارع الرئيسي ");
        browserQA.findElement(SubStreetLOcator).sendKeys(" الشارع الفرعي ");
        browserQA.findElement(HouseNoLocator).sendKeys("123");
        browserQA.findElement(HouseNextToLocator).sendKeys("بجوار");
        browserQA.findElement(TelephoneNo1Locator).sendKeys("4546545646");
        browserQA.findElement(TelephoneNo2LOcator).sendKeys("3546546545");
        browserQA.findElement(AdmissionMobileNoLOcator).sendKeys("599999999");
        browserQA.findElement(EmailAddressLocator).sendKeys("www.Rami" + RandomNumber + "@gmail.com");
        browserQA.findElement(StreetAddressLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(ZipCodeLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(POBoxLocator).sendKeys("7" + RandomNumber);
        browserQA.findElement(FaxNumber).sendKeys("7" + RandomNumber);
        browserQA.findElement(btnSaveLocator).click();
      /*  By ValidationMessageAfterAddTheUser = By.id("ctl00_PlaceHolderMain_lblResult");
        WebElement ValidationMessageAfterAddTheUserWait = waitQA.until(ExpectedConditions.visibilityOfElementLocated(ValidationMessageAfterAddTheUser));

        String MSELoctor = browserQA.findElement(ValidationMessageAfterAddTheUser).getText();
        String MesaString = "لا يمكن اضافة ملف لعدم وجود ملف له في شؤون المعلمين";
        Assert.assertNotEquals(MSELoctor , MesaString , "يجب اضافة ملف فئات تشكيلية ");*/

    }

}
