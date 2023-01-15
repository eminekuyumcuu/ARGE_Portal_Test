import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class disardan_kayit {



    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:/Users/emine.kuyumcu/Selenium/MicrosoftEdgeSetup.exe/");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("http://dev.argenerji.com/");

        System.out.println("Giriş Başarılı");

        Thread.sleep(1000);

        driver.findElement(By.linkText("Kayıt Olun")).click();
        Thread.sleep(1000);
        System.out.println("Kayit Ol Sayfasina Gitti");

        driver.findElement(By.id("register_name")).sendKeys("Emine");
        Thread.sleep(1000);
        System.out.println("Kullanici Adi Girildi");

        driver.findElement(By.id("register_email")).sendKeys("emine12@gmail.com");
        Thread.sleep(1000);
        System.out.println("Email Girildi");

        WebElement sirket_sec = driver.findElement(By.id("register_companyId"));
        new Select(sirket_sec).selectByValue("18");
        Thread.sleep(1000);
        System.out.println("Baglı Firma Secildi");

        driver.findElement(By.id("register_surname")).sendKeys("Kuyumcu");
        Thread.sleep(1000);
        System.out.println("Soyad girildi");

        driver.findElement(By.id("register_phone")).sendKeys("5555555555");
        Thread.sleep(1000);
        System.out.println("Telefon Numarasi Girildi");

        WebElement departman_sec = driver.findElement(By.id("register_departmentId"));
        new Select(departman_sec).selectByValue("5");
        Thread.sleep(1000);
        System.out.println("Departman secildi");

        driver.findElement(By.id("register_sifre_first")).sendKeys("Nil312!_");
        Thread.sleep(1000);
        System.out.println("Sifre Girildi");
        driver.findElement(By.id("register_sifre_second")).sendKeys("Nil312!_");
        Thread.sleep(1000);
        System.out.println("Kullanici sifre tekrar girildi");
        driver.findElement(By.id("register_save")).click();
        System.out.println("Kayit ol butonuna tiklanildi");
    }
}