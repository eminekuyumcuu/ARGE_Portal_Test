import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class icerden_kullanici_kayit {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:/Users/emine.kuyumcu/Selenium/MicrosoftEdgeSetup.exe/");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("http://dev.argenerji.com/");

        Thread.sleep(3000);
        driver.findElement(By.id("inputEmail")).sendKeys("admin@argenerji.com");
        driver.findElement(By.id("inputSifre")).sendKeys("123987");
        System.out.println("1. Kullanıcı Girişinde email ve şifre alanı dolduruldu.");
        String str = JOptionPane.showInputDialog("Enter");
        WebElement element = driver.findElement(By.xpath("//input[@id='captcha_input']"));
        element.sendKeys(str);
        System.out.println("2. Güvenlik Kodu alanı dolduruldu.");
        driver.findElement(By.id("fast_login")).click();
        System.out.println("3. Giriş yap butonuna tıklanıldı.");
        Thread.sleep(1000);

        driver.findElement(By.id("navbar_setting")).click();
        System.out.println("4. Ayarlar menüsüne tıklanıldı.");
        Thread.sleep(1000);

        driver.findElement(By.id("collapse-user")).click();
        System.out.println("5. Kullanıcı İşlemleri başlığına tıklanıldı.");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[1]/div[2]/div/button[1]")).click();
        System.out.println("6. Sayfada bulunan Ekle butonuna tıklanıldı.");
        Thread.sleep(1000);

        driver.findElement(By.id("user_name")).sendKeys("Test");
        System.out.println("7. Kullanıcı Ekleme sayfasında Ad alanı dolduruldu.");
        Thread.sleep(1000);

        driver.findElement(By.id("user_surname")).sendKeys("User");
        System.out.println("8. Kullanıcı Ekleme sayfasında Soyad alanı dolduruldu.");
        Thread.sleep(1000);

        driver.findElement(By.id("user_email")).sendKeys("test@user.com");
        System.out.println("9. Kullanıcı Ekleme sayfasında email alanı dolduruldu.");
        Thread.sleep(1000);

        driver.findElement(By.id("user_phone")).click();
        System.out.println("10. Kullanıcı Ekleme sayfasında telefon alanına tıklanıldı..");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();
        System.out.println("11. Email kontrol pop-up ekranında Tamam butonuna tıklanıldı.");
        Thread.sleep(1000);

        driver.findElement(By.id("user_phone")).sendKeys("5555555555");
        System.out.println("12. Kullanıcı Ekleme sayfasında telefon alanı dolduruldu.");
        Thread.sleep(1000);

        driver.findElement(By.id("user_sifre_first")).sendKeys("Otomasyon123!_");
        System.out.println("13. Kullanıcı Ekleme sayfasında Şifre alanı dolduruldu.");
        Thread.sleep(1000);

        driver.findElement(By.id("user_sifre_second")).sendKeys("Otomasyon123!_");
        System.out.println("14. Kullanıcı Ekleme sayfasında Şifre Tekrar alanı dolduruldu.");

        WebElement sirket = driver.findElement(By.id("user_companyId"));
        new Select(sirket).selectByValue("85");
        System.out.println("15. Kullanıcı Ekleme sayfasında Bağlı Olduğu Şirket seçildi");

        Thread.sleep(1000);

        WebElement departman = driver.findElement(By.id("user_departmentId"));
        new Select(departman).selectByValue("5");
        System.out.println("16. Kullanıcı Ekleme sayfasında Kullanıcı Departmanı seçildi.");
        Thread.sleep(1000);

        driver.findElement(By.id("user_save")).click();
        System.out.println("17. Kullanıcı Ekleme sayfasında tüm alanlar doldurulduktan sonra Kaydet butonuna tıklanıldı.");
    }
}