import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Set;


public class DataHeroes {

    public static WebDriver driver;


    @Test
    public void Registration() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.dataheroes.pro/landing");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[1]/div[2]/div/button[1]/span")).click();
        Thread.sleep(2000);
        String window1 = driver.getWindowHandle();
        Set<String> currentWindows = driver.getWindowHandles();
        String window2 = null;

        for (String window : currentWindows) {
            if (!window.equals(window1)) {
                window2 = window;
                break;
            }
        }
        // Регистрация
        driver.switchTo().window(window2);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("113pablo@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678aA)");
        driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/form/div[2]/button")).click();

        driver.switchTo().window(window1);
        Thread.sleep(1000);
         // Подтверждение регистрации
        driver.findElement(By.xpath("//*[@id=\"v-step-1b178729\"]/div[2]/div[2]/button/span")).click();
        WebElement create_a_project = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[5]/div/button/span"));
        Assert.assertEquals(true, create_a_project.isDisplayed());
        driver.quit();



    }





    @Test
    public void Authorization() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.dataheroes.pro/landing");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/button/span")).click();
        Thread.sleep(2000);
        String window1 = driver.getWindowHandle();
        Set<String> currentWindows = driver.getWindowHandles();
        String window2 = null;

        for (String window : currentWindows) {
            if (!window.equals(window1)) {
                window2 = window;
                break;
            }
        }
        // Авторизиция
        driver.switchTo().window(window2);
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("113pablo@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678aA)");
        driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/form/div[2]/button")).click();
        driver.switchTo().window(window1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"v-step-1b178729\"]/div[2]/div[2]/button/span")).click();
        Thread.sleep(2000);
        WebElement create_a_project = driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[5]/div/button/span"));
        Assert.assertEquals(true, create_a_project.isDisplayed());
         // Создание проекта
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div[2]/div[5]/div/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"input-69\"]")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[3]/button[1]/span")).click();
        Thread.sleep(2000);
        WebElement TZ = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div[6]/div/div/div/div/div[3]/span"));
        Assert.assertEquals(true, TZ.isDisplayed());

        // Добавления пользователя
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div[6]/div/div/div/div/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div[5]/div[2]/button[3]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"input-172\"]")).sendKeys("211pronya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[2]/div/button[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[4]/div/div/div[3]/button[1]/span")).click();
        Thread.sleep(2000);
        WebElement invite_users = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div[5]/div[3]/div/div/table/tbody/tr[2]/td[1]/div"));
        Assert.assertEquals(true, invite_users.isDisplayed());

        // Удаление пользователя
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div[5]/div[3]/div/div/table/tbody/tr[2]/td[4]/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"list-item-203\"]/span")).click();
        Thread.sleep(2000);

        // Удаление проекта
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[1]/div/div[1]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div[6]/div/div/div/div/div[1]/div[2]/button/span")).click();
        driver.findElement(By.xpath("//*[@id=\"list-item-247\"]/span")).click();


        driver.quit();








    }









}
