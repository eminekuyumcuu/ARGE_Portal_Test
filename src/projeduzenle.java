import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class projeduzenle {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:/Users/emine.kuyumcu/Selenium/MicrosoftEdgeSetup.exe/");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("http://dev.argenerji.com/");
        //driver.get("http://127.0.0.1:8000");

        Thread.sleep(2000);
        driver.findElement(By.id("inputEmail")).sendKeys("admin@argenerji.com");
        driver.findElement(By.id("inputSifre")).sendKeys("123987");

        System.out.println("1. Kullanıcı giriş formunda email ve şifre alanı girildi. ");

        String str = JOptionPane.showInputDialog("Enter");
        WebElement element = driver.findElement(By.xpath("//input[@id='captcha_input']"));
        element.sendKeys(str);

        System.out.println("2. Güvenlik kodu alanı dolduruldu.. ");

        driver.findElement(By.id("fast_login")).click();

        System.out.println("3. Giriş Yap butonuna tıklanıldı. ");

        Thread.sleep(2000);

        driver.findElement(By.id("navbar_project")).click();

        System.out.println("4. Proje İşlemleri menüsüne tıklanıldı. ");

        Thread.sleep(2000);

        driver.findElement(By.id("project-list-navigate-id")).click();

        Thread.sleep(2000);

        WebElement durum = driver.findElement(By.id("approval_status"));
        new Select(durum).selectByValue("2");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"projectSearch\"]")).click();
        Thread.sleep(2000);

        WebElement islemeler = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[11]/select"));
        new Select(islemeler).selectByIndex(8);

        Thread.sleep(2000);

        driver.findElement(By.id("newProjectForm-t-0")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("name")).sendKeys("Düzenlendi - Emine Test Proje");

        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[2]/section[1]/form/div/div[5]/div[2]/button")).click();
    }
}
