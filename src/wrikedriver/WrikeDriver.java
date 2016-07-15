package wrikedriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WrikeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wrike.com/wa/");
        Thread.sleep(100);
        
        WebElement solutions;
        solutions = driver.findElement(By.className("wg-header__desktop-primary-nav-span"));
        solutions.click();
        Thread.sleep(100);
        
        WebElement PDT;
        PDT = driver.findElement(By.cssSelector("a.wg-header__sticky-submenu-item:nth-child(4) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)"));
        PDT.click();
        Thread.sleep(100);
        
        WebElement emailBox;
        emailBox = driver.findElement(By.cssSelector(".solution-form > input:nth-child(2)"));
        emailBox.click();
        emailBox.sendKeys("invalid");
        Thread.sleep(100);
        
        WebElement sbmtBtn;
        sbmtBtn = driver.findElement(By.cssSelector(".wg-btn--gray"));
        sbmtBtn.click();
        Thread.sleep(100);
        
        driver.navigate().refresh();
        Thread.sleep(100);
        
        WebElement element = driver.findElement(By.cssSelector(".section-features > div:nth-child(1) > div:nth-child(1) > h2:nth-child(1)"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        Thread.sleep(100);
        
        WebElement viewFullProduct;
        viewFullProduct = driver.findElement(By.cssSelector(".view-all-features-link"));
        viewFullProduct.click();
        Thread.sleep(100);
        
        /*JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        Thread.sleep(100*/
        
        WebElement scroll = driver.findElement(By.cssSelector(".wg-header__top-menu > div:nth-child(1) > div:nth-child(2)"));
        scroll.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(5000);
        
        
        WebElement getStartedForFree;
        getStartedForFree = driver.findElement(By.cssSelector(".r > form:nth-child(1) > button:nth-child(3)"));
        getStartedForFree.click();
        Thread.sleep(5000);
        
        WebElement validEmail;
        validEmail = driver.findElement(By.cssSelector(".wg-input--invalid"));
        validEmail.click();
        validEmail.sendKeys("validemail@mail.ru");
        Thread.sleep(10000);
        
        getStartedForFree.click();
        Thread.sleep(5000);
        
        driver.quit();
    }
    
}
