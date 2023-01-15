import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.ArrayList;

public class yeni_proje_ekleme_2 {


    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> paydaslar = new ArrayList<String>();
        paydaslar.add("Paydas 1");
        paydaslar.add("Paydas 2");
        paydaslar.add("Paydas 3");
        paydaslar.add("Paydas 4");

        System.setProperty("webdriver.gecko.driver", "C:/Users/emine.kuyumcu/Selenium/MicrosoftEdgeSetup.exe/");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        //driver.get("http://dev.argenerji.com/");
        driver.get("http://127.0.0.1:8000");

        Thread.sleep(3000);
        driver.findElement(By.id("inputEmail")).sendKeys("admin@argenerji.com");
        driver.findElement(By.id("inputSifre")).sendKeys("123987");

        System.out.println("1. Kullanıcı giriş formunda email ve şifre alanı girildi. ");

        String str = JOptionPane.showInputDialog("Enter");
        WebElement element = driver.findElement(By.xpath("//input[@id='captcha_input']"));
        element.sendKeys(str);

        System.out.println("2. Güvenlik kodu alanı dolduruldu.. ");

        driver.findElement(By.id("fast_login")).click();

        System.out.println("3. Giriş Yap butonuna tıklanıldı. ");

        Thread.sleep(1000);

        driver.findElement(By.id("navbar_project")).click();

        System.out.println("4. Proje İşlemleri menüsüne tıklanıldı. ");

        Thread.sleep(1000);

        driver.findElement(By.id("collapse-new")).click();

        System.out.println("5. Yeni Proje Ekle butonuna tıklanıldı. ");

        Thread.sleep(1000);

        driver.findElement(By.id("newProjectForm-t-0")).click();

        Thread.sleep(3000);

        WebElement dagitimturu = driver.findElement(By.id("company_kind"));
        new  Select(dagitimturu).selectByValue("1");

        System.out.println("6. Dağıtım Şirketi türü seçildi.");

        Thread.sleep(1000);

        WebElement dagitimsirketi = driver.findElement(By.id("company_id"));
        new  Select(dagitimsirketi).selectByValue("80");

        System.out.println("7. Dağıtım Şirketi Seçildi.");

        Thread.sleep(1000);

        driver.findElement(By.id("name")).sendKeys("Emine Test Proje");

        System.out.println("8. Proje adı girildi.");

        Thread.sleep(1000);

        WebElement kategori = driver.findElement(By.id("project_category_id"));
        new  Select(kategori).selectByValue("109");

        System.out.println("9. Proje kategorisi girildi.");

        Thread.sleep(1000);

        WebElement proje_turu = driver.findElement(By.id("project_kind_id"));
        new  Select(proje_turu).selectByValue("7");

        System.out.println("10. Proje Türü seçildi.");

        Thread.sleep(1000);

        WebElement proje_sorumlusu = driver.findElement(By.id("project_responsible_id"));
        new  Select(proje_sorumlusu).selectByValue("12277");

        System.out.println("11. Proje Sorumlusu seçildi.");

        Thread.sleep(1000);

        WebElement proje_bolgesi = driver.findElement(By.id("bootstrap-duallistbox-nonselected-list_"));
        new  Select(proje_bolgesi).selectByValue("63");
        new  Select(proje_bolgesi).selectByValue("65");
        new  Select(proje_bolgesi).selectByValue("68");
        new  Select(proje_bolgesi).selectByValue("69");
        new  Select(proje_bolgesi).selectByValue("70");
        new  Select(proje_bolgesi).selectByValue("71");
        new  Select(proje_bolgesi).selectByValue("72");
        new  Select(proje_bolgesi).selectByValue("73");
        new  Select(proje_bolgesi).selectByValue("74");
        new  Select(proje_bolgesi).selectByValue("75");
        new  Select(proje_bolgesi).selectByValue("76");
        new  Select(proje_bolgesi).selectByValue("77");
        new  Select(proje_bolgesi).selectByValue("78");
        new  Select(proje_bolgesi).selectByValue("79");
        new  Select(proje_bolgesi).selectByValue("80");
        new  Select(proje_bolgesi).selectByValue("81");
        new  Select(proje_bolgesi).selectByValue("82");
        new  Select(proje_bolgesi).selectByValue("83");
        new  Select(proje_bolgesi).selectByValue("84");
        new  Select(proje_bolgesi).selectByValue("85");
        System.out.println("12. Proje Bölgesi seçildi.");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectGeneralInformationForm\"]/div/div[3]/div[1]/div/div/div[1]/div/button[2]")).click();
        System.out.println("12.1. Proje Bölgesi seçim butonuna tıklanıldı.");
        Thread.sleep(1000);

        driver.findElement(By.id("time")).sendKeys("12");
        System.out.println("13. Proje Süresi (Ay) girildi.");
        Thread.sleep(1000);

        driver.findElement(By.id("start_date")).clear();
        System.out.println("14. Proje Başlangıç Tarihi alanı temizlendi.");
        Thread.sleep(1000);

        driver.findElement(By.id("start_date")).click();
        Thread.sleep(3000);

        WebElement baslangicay = driver.findElement(By.className("monthselect"));
        new Select(baslangicay).selectByValue("1");

        Thread.sleep(1000);

        WebElement baslangicyil = driver.findElement(By.className("yearselect"));
        new Select(baslangicyil).selectByValue("2021");

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("body > div.daterangepicker.ltr.auto-apply.single.opensright.show-calendar > div.drp-calendar.left.single > div.calendar-table > table > tbody > tr:nth-child(3) > td:nth-child(4)")).click();

        Thread.sleep(1000);

        /*WebElement tarih = driver.findElement(By.id("start_date"));
        tarih.sendKeys(Keys.ENTER);*/
        Thread.sleep(1000);

        driver.findElement(By.id("project_period")).clear();
        System.out.println("16. Proje Dönemi alanı temizlendi.");
        Thread.sleep(1000);



        driver.findElement(By.id("project_period")).sendKeys("Ocak");
        Thread.sleep(1000);
        System.out.println("16.1. Proje Dönemi Ay seçildi");


        WebElement donemyil = driver.findElement(By.id("project_period"));
        donemyil.sendKeys(Keys.ARROW_RIGHT);
        System.out.println("16.2. Proje Döneminde sağ yön tuşu ile yıla geçildi.");
        Thread.sleep(1000);

        driver.findElement(By.id("project_period")).sendKeys("2021");
        System.out.println("16.3. Proje Dönemi Yıl alanı girildi.");
        Thread.sleep(1000);

        WebElement kaydet = driver.findElement(By.id("saveAndNext"));
        kaydet.click();

        Thread.sleep(4000);

        driver.findElement(By.className("swal2-confirm")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectInfoDetailTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test");

        Thread.sleep(1000);

        driver.findElement(By.id("projectPurpose-tab")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectPurposeTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test2");

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[2]/form/div/div/div/div[3]/div[2]/div[2]/div[2]/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.className("swal2-confirm")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"targetsTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test3");

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[3]/form/div/div/div/div[2]/div[1]/div[2]/div[2]/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.className("swal2-confirm")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectAffected\"]/div/div/div/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("stakeholder_name")).sendKeys("Etkilenen 1");

        driver.findElement(By.className("custom-control-label")).click();

        driver.findElement(By.id("project_affected_save_btn")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("newProjectForm-t-4")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"innovativeAspectTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test4");

        Thread.sleep(1000);

        driver.findElement(By.id("addedValue-tab")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"addedValueTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test5");

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[5]/form/div/div/div/div[2]/div[4]/div[2]/div[2]/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectStakeholders\"]/div/div/div/button")).click();

        Thread.sleep(1000);

        WebElement paydasturu = driver.findElement(By.id("stakeholder_id"));
        new Select(paydasturu).selectByValue("1");

        Thread.sleep(1000);

        driver.findElement(By.id("stakeholder_title")).sendKeys("SAKARYA EDAŞ");

        Thread.sleep(1000);

        driver.findElement(By.className("custom-control-label")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("project_stakeholder_save_btn")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);


        driver.findElement(By.id("newProjectForm-t-6")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectInfoSectorTable\"]/tbody/tr[1]/td[2]/div/label[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("newProjectForm-t-7")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"keywordsTab\"]/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("keyword_title")).sendKeys("Anahtar Kelime 1");

        Thread.sleep(1000);

        driver.findElement(By.id("project_keyword_save_btn")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("projectDetail-tab")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectDetailTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test 6");

        Thread.sleep(1000);

        driver.findElement(By.id("projectInspiredBySource-tab")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectInspiredBySourceTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test 7");

        Thread.sleep(1000);

        driver.findElement(By.id("projectTechnicalDetail-tab")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectTechnicalDetailTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test 8");

        Thread.sleep(1000);

        driver.findElement(By.id("projectExpectedData-tab")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectExpectedDataTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test 9");

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[8]/form/div/div/div/div[2]/div[4]/div[2]/div[2]/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);


        driver.findElement(By.xpath("//*[@id=\"sectoralContributionTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test 10");

        Thread.sleep(1000);

        driver.findElement(By.id("staffContribution-tab")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"staffContributionTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test 11");

        Thread.sleep(1000);

        driver.findElement(By.id("otherContribution-tab")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"otherContributionTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test 12");

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[9]/form/div/div/div/div[2]/div[5]/div[2]/div[2]/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"technicalRiskTab\"]/div[1]/div[3]/div[2]")).sendKeys("Test 13");

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div/div[2]/section[10]/form/div/div/div/div[2]/div[1]/div[2]/div[2]/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        ((JavascriptExecutor)driver).executeScript("ShowProject.ShowProjectBusinessPackage(null)");

        Thread.sleep(1000);
        WebElement firma = driver.findElement(By.id("business_package_company_id"));
        new Select(firma).selectByValue("80");

        Thread.sleep(1000);

        driver.findElement(By.id("business_package_no")).sendKeys("1");

        Thread.sleep(1000);

        WebElement faaliyet_turu= driver.findElement(By.id("bootstrap-duallistbox-nonselected-list_"));
        new  Select(faaliyet_turu).selectByValue("2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"newProjectBusinessPlanFormWizard-p-0\"]/div/div/div[3]/div/div[1]/div/button[2]")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("business_package_name")).sendKeys("Hazırlık");

        Thread.sleep(1000);



        WebElement ispaketlideri = driver.findElement(By.id("business_package_leader_id"));
        new Select(ispaketlideri).selectByValue("80");

        Thread.sleep(1000);

        driver.findElement(By.id("start_date")).sendKeys("1");
        driver.findElement(By.id("end_date")).sendKeys("3");

        Thread.sleep(1000);

        driver.findElement(By.className("custom-control-label")).click();

        Thread.sleep(1000);

        driver.findElement(By.linkText("İleri")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"newProjectBusinessPlanFormWizard-p-1\"]/div/div[1]/div/div/div[3]/div[2]")).sendKeys("İş paketi detayı");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"newProjectBusinessPlanFormWizard-p-1\"]/div/div[2]/div/div/div[3]/div[2]")).sendKeys("Tamamlanacak Görevler");

        driver.findElement(By.linkText("İleri")).click();

        Thread.sleep(1000);

        WebElement paydas = driver.findElement(By.id("stakeholder_id1"));
        new Select(paydas).selectByIndex(1);

        Thread.sleep(1000);
        driver.findElement(By.linkText("İleri")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("output1")).sendKeys("Çıktı 1");

        Thread.sleep(1000);
        driver.findElement(By.id("output_date1")).sendKeys("3");

        Thread.sleep(1000);
        driver.findElement(By.linkText("Kaydet")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[10]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("newProjectForm-t-11")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectBudgetTab\"]/div/button")).click();

        Thread.sleep(1000);

        WebElement butcefirma = driver.findElement(By.id("spending_company_id"));
        new Select(butcefirma).selectByIndex(1);
        Thread.sleep(1000);

        WebElement butceturu = driver.findElement(By.id("spending_category_id"));
        new Select(butceturu).selectByValue("1");
        Thread.sleep(1000);

        WebElement ispaketi = driver.findElement(By.id("business_package_id"));
        new Select(ispaketi).selectByIndex(1);
        Thread.sleep(1000);

        WebElement butcepaydas = driver.findElement(By.id("business_package_stakeholder_id"));
        new Select(butcepaydas).selectByIndex(1);
        Thread.sleep(1000);

        driver.findElement(By.id("personel_date")).sendKeys("10");

        Thread.sleep(1000);
        driver.findElement(By.id("amount")).sendKeys("100000");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"newProjectSpendingForm\"]/div[8]/label")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("project_spending_save_btn")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[10]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.id("newProjectForm-t-12")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("newProjectForm-t-13")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("newProjectForm-t-14")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"projectAttachmentFilesForm\"]/div/div/div/button")).click();
        Thread.sleep(1000);

        WebElement dosyaturu = driver.findElement(By.id("files_type_id"));
        new Select(dosyaturu).selectByValue("4");

        Thread.sleep(1000);

        driver.findElement(By.id("files_content")).sendKeys("Dosya İçerik Bilgisi");

        Thread.sleep(1000);

        WebElement addFile = driver.findElement(By.id("file_url"));
        addFile.sendKeys("C:/Users/emine.kuyumcu/IdeaProjects/Test_Selenium_Deneme1/Untitled.pdf");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"checkbox\"]/label")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"project_attachment_files_save_btn\"]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[10]/div/div[3]/button[1]")).click();


        Thread.sleep(3000);

        driver.findElement(By.id("approvalStatusButton")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"epdkEbisTransfer\"]/div/div/div[4]/div/button")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[10]/div/div[3]/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[10]/div/div[3]/button[1]")).click();
    }

}