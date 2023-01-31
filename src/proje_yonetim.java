import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class proje_yonetim   {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:/Users/emine.kuyumcu/Selenium/MicrosoftEdgeSetup.exe/");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("http://dev.argenerji.com/");

        Thread.sleep(3000);
        driver.findElement(By.id("inputEmail")).sendKeys("admin@argenerji.com");
        driver.findElement(By.id("inputSifre")).sendKeys("123987");
        System.out.println("1. Kullanici Girisinde email ve sifre alani dolduruldu.");


        String str = JOptionPane.showInputDialog("Enter");
        WebElement element = driver.findElement(By.xpath("//input[@id='captcha_input']"));
        element.sendKeys(str);
        System.out.println("2. Gunvelik Kodu alani dolduruldu.");

        driver.findElement(By.id("fast_login")).click();
        System.out.println("3. Giris Yap butonuna tiklanildi.");
        Thread.sleep(2000);

        driver.findElement(By.id("navbar_projectmanager")).click();
        System.out.println("4. Proje Yonetim Izleme menusune tikanildi.");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"arrw\"]")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("project-actions-select-686")).click();
        System.out.println("5. Yonetilecek olan projenin Islemlerine tiklanildi.");
        Thread.sleep(2000);

        driver.findElement(By.id("project-edit-686")).click();
        System.out.println("6. Islemlerden Yonet butonuna tiklanildi.");
        /*WebElement islemler = driver.findElement(By.id("project-actions-select-686"));
        new Select(islemler).selectByVisibleText("Yönet");*/
        Thread.sleep(3000);


        System.out.println("*****SOZLESME EKLEME TESTI BASLADI*****");

        driver.findElement(By.xpath("//*[@id=\"contractManagementForm\"]/div/div/div[1]/div/div/button[2]")).click();
        Thread.sleep(3000);
        System.out.println("7. Sayfa icerisinde Sozlesme Yonetiminde Ekle butonuna tiklanildi.");


        driver.findElement(By.id("contract_name")).sendKeys("Sözleşme");
        Thread.sleep(3000);
        System.out.println("8. Sozlesme Adi girildi.");

        driver.findElement(By.id("contract_date")).sendKeys("01-05-2021");
        Thread.sleep(2000);
        System.out.println("9. Sozlesme Baslangic Tarihi girildi.");

        driver.findElement(By.id("contract_end_date")).sendKeys("01-05-2022");
        Thread.sleep(2000);
        System.out.println("10. Sozlesme Bitis Tarihi girildi.");

        WebElement imzalayan_firma = driver.findElement(By.id("bootstrap-duallistbox-nonselected-list_"));
        new  Select(imzalayan_firma).selectByValue("63");
        new  Select(imzalayan_firma).selectByValue("65");
        new  Select(imzalayan_firma).selectByValue("68");
        new  Select(imzalayan_firma).selectByValue("69");
        new  Select(imzalayan_firma).selectByValue("70");
        new  Select(imzalayan_firma).selectByValue("71");
        new  Select(imzalayan_firma).selectByValue("72");
        new  Select(imzalayan_firma).selectByValue("73");
        new  Select(imzalayan_firma).selectByValue("74");
        new  Select(imzalayan_firma).selectByValue("75");
        new  Select(imzalayan_firma).selectByValue("76");
        new  Select(imzalayan_firma).selectByValue("77");
        new  Select(imzalayan_firma).selectByValue("78");
        new  Select(imzalayan_firma).selectByValue("79");
        new  Select(imzalayan_firma).selectByValue("80");
        new  Select(imzalayan_firma).selectByValue("81");
        new  Select(imzalayan_firma).selectByValue("82");
        new  Select(imzalayan_firma).selectByValue("83");
        new  Select(imzalayan_firma).selectByValue("84");
        new  Select(imzalayan_firma).selectByValue("85");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contract_partner\"]/div/div/div[1]/div/button[2]")).click();
        System.out.println("11. Sozlesme imzalayan firmalar secildi.");

        Thread.sleep(2000);

        WebElement addFile = driver.findElement(By.id("file"));
        addFile.sendKeys("C:/Users/emine.kuyumcu/Downloads/deneme.pdf");
        System.out.println("12. Sozlesme dosyasi eklenildi.");

        Thread.sleep(2000);

       /* WebElement sozlesme_statu = driver.findElement(By.id("main_contract_status"));
        new Select(sozlesme_statu).selectByValue("1");
        System.out.println("13. Sozlesme Ana Sozlesme mi Secimi secildi.");
        ** İlk kayıtta ana sözleşme evet dediğimiz için bu input çıkmadı o yüzden adım kaldırıldı.

        */

        Thread.sleep(20000);

        driver.findElement(By.id("contractManagementSaveBtn")).click();
        System.out.println("14. Kaydet butonuna tiklanildi.");
        Thread.sleep(20000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]")).click();
        System.out.println("15. Sozlesme basarili eklenildi pop-up icerisinde Tamam butonuna tiklanildi.");
        Thread.sleep(3000);


        System.out.println("*****SOZLESME EKLEME TESTI BITTI*****");
        Thread.sleep(3000);



        System.out.println("*****PERSONEL GIDERI EKLEME TESTI BASLADI*****");



        driver.findElement(By.xpath("//*[@id=\"projectManagementForm-t-1\"]")).click();
        Thread.sleep(2000);
        System.out.println("1. Personel Giderleri sekmesine tiklanildi.");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"personnelExpensesForm\"]/div/div/div[2]/div/div/button[2]")).click();
        System.out.println("2. Personel Gideri Ekle butonuna tiklanildi.");
        Thread.sleep(2000);


        WebElement HarcamaDonemAy = driver.findElement(By.id("monthperiod"));
        new Select(HarcamaDonemAy).selectByValue("02");
        System.out.println("3. Harcama Donemi Ay 'Subat' secildi");
        Thread.sleep(2000);

        WebElement HarcamaDonemYil = driver.findElement(By.id("yearperiod"));
        new Select(HarcamaDonemYil).selectByValue("2021");
        System.out.println("4. Harcama Donemi Yil '2022' secildi.");
        Thread.sleep(2000);

        WebElement dagitimsirketi = driver.findElement(By.id("company_id"));
        new Select(dagitimsirketi).selectByValue("80");
        System.out.println("5. Dagitim Sirketi 'SAKARYA EDAS' secildi.");
        Thread.sleep(2000);

        WebElement ispaketi = driver.findElement(By.id("business_package_id"));
        new Select(ispaketi).selectByValue("334");
        System.out.println("6. 1.İs Paketi Hazirlik secildi.");
        Thread.sleep(2000);

        WebElement paydas = driver.findElement(By.id("business_package_stakeholder_id"));
        new Select(paydas).selectByValue("3356");
        System.out.println("7. Paydas secildi 'SAKARYA EDAS'");
        Thread.sleep(2000);

        driver.findElement(By.id("personel_expenses_efor")).sendKeys("1,5");
        System.out.println("8. Efor girildi.");
        Thread.sleep(2000);

        driver.findElement(By.id("amount")).sendKeys("100");
        System.out.println("9. Personel Gideri girildi.");
        Thread.sleep(2000);

        driver.findElement(By.id("saved_time")).sendKeys("10-02-2022");
        System.out.println("10. Personel Gideri Muhasebelestirilme Tarihi Girildi.");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"personnel_expenses_save_btn\"]")).click();
        System.out.println("11. Personel gideri Kaydet ve Kapat butonuna tiklanildi.");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]")).click();
        System.out.println("Personel Gideri Basarili ile girildi pop-up uyarisinda Tamam butonuna tiklanildi.");

        System.out.println("*****PERSONEL GIDERI EKLEME TESTI BITTI*****");

        Thread.sleep(2000);
        System.out.println("*****SEYEHAT GIDERI EKLEME TESTI BASLADI*****");

        driver.findElement(By.id("projectManagementForm-t-2")).click();
        System.out.println("1. Seyahat Giderleri sekmesine tiklanildi.");
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//*[@id=\"travelExpensesForm\"]/div/div/div[2]/div/div/button[2]")).click();
//        System.out.println("2. Seyahat Giderleri sayfasinda Ekle butonuna tiklanildi.");
//        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick='ShowProjectManagement.NewTravelExpenses()']")).click();


        Thread.sleep(2000);

        WebElement HarcamaDonemAy2 = driver.findElement(By.id("monthperiod"));
        new Select(HarcamaDonemAy2).selectByValue("02");
        System.out.println("3. Harcama Donemi Ay 'Subat' secildi");
        Thread.sleep(2000);

        WebElement HarcamaDonemYil2 = driver.findElement(By.id("yearperiod"));
        new Select(HarcamaDonemYil2).selectByValue("2021");
        System.out.println("4. Harcama Donemi Yil '2022' secildi.");
        Thread.sleep(2000);

        WebElement dagitimsirketi2 = driver.findElement(By.id("company_id"));
        new Select(dagitimsirketi2).selectByValue("80");
        System.out.println("5. Dagitim Sirketi 'SAKARYA EDAS' secildi.");
        Thread.sleep(2000);

        WebElement ispaketi2 = driver.findElement(By.id("business_package_id"));
        new Select(ispaketi2).selectByValue("334");
        System.out.println("6. 1.İs Paketi Hazirlik secildi.");
        Thread.sleep(2000);

        WebElement paydas2 = driver.findElement(By.id("business_package_stakeholder_id"));
        new Select(paydas2).selectByValue("3356");
        System.out.println("7. Paydas secildi 'SAKARYA EDAS'");
        Thread.sleep(2000);

        driver.findElement(By.id("comment")).sendKeys("Açıklama");
        System.out.println("8. Butce aciklamasi girildi.");
        Thread.sleep(2000);

        driver.findElement(By.id("invoice_no")).sendKeys("FN1");

        Thread.sleep(2000);

        driver.findElement(By.id("amount")).sendKeys("110");

        Thread.sleep(2000);

        WebElement faturakesilen = driver.findElement(By.id("invoice_company_id"));
        new Select(faturakesilen).selectByIndex(2);

        Thread.sleep(2000);

        driver.findElement(By.id("invoice_company")).sendKeys("Pamukkale Turizm");
        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/section[3]/div/div/div/div[2]/div/form/div[13]/div[2]/div/label[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"travel_expenses_save_btn\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[1]")).click();

        Thread.sleep(2000);
        System.out.println("*****HIZMET GIDERI EKLEME TESTI BASLADI*****");

        driver.findElement(By.id("projectManagementForm-t-3")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"travelExpensesForm\"]/div/div/div[2]/div/div/button[2]")).click();

        Thread.sleep(2000);

        WebElement HarcamaDonemAy3 = driver.findElement(By.id("monthperiod"));
        new Select(HarcamaDonemAy2).selectByValue("02");
        Thread.sleep(2000);

        WebElement HarcamaDonemYil3 = driver.findElement(By.id("yearperiod"));
        new Select(HarcamaDonemYil2).selectByValue("2021");

        Thread.sleep(2000);

        WebElement dagitimsirketi3 = driver.findElement(By.id("company_id"));
        new Select(dagitimsirketi2).selectByValue("80");
        Thread.sleep(2000);

        WebElement ispaketi3 = driver.findElement(By.id("business_package_id"));
        new Select(ispaketi2).selectByValue("334");
        Thread.sleep(2000);

        driver.findElement(By.id("comment")).sendKeys("Açıklama");

        Thread.sleep(2000);

        driver.findElement(By.id("invoice_no")).sendKeys("FN2");
    }

}