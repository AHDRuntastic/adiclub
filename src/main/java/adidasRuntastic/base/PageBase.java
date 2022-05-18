package adidasRuntastic.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {

    public AndroidDriver driver;
   // public static MobileElement mobileElement;
    WebDriverWait wait;
    AndroidTouchAction actions;


    public PageBase(AppiumDriver driver){
        this.driver = (AndroidDriver) driver;
    }

    //This method is to wait for the element before an action
    public void waitForElement(By e){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    //This method is to swipe left and right
    private void scroll(){
        Dimension dimension = driver.manage().window().getSize();
        int startScroll = (int) (dimension.getHeight()* 0.8);
        int endScroll = (int) (dimension.getHeight()* 0.1);

        actions = new AndroidTouchAction(driver)
                .press(PointOption.point(0,startScroll))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(0,endScroll)).release().perform();

    }


    public void click (By e){
        waitForElement(e);
        driver.findElement((By) e).click();
    }

    public void clear (By e){
        waitForElement(e);
        driver.findElement((By) e).clear();
    }

    public void addText (By e, String string){
        waitForElement(e);
        driver.findElement(e).clear();
        driver.findElement((By) e).sendKeys(string);
    }

    public  String getAttribute(By e, String attribute){
        waitForElement(e);
        return driver.findElement((By) e).getAttribute(attribute);
    }

    public  String getText(By e){
        waitForElement(e);
        String text = driver.findElement((By) e).getText();
        return text;
    }

    public boolean isExist (By e){
        waitForElement(e);
        boolean result = driver.findElement(e).isDisplayed();
        return result;
    }

    public void swipe(By e){
        waitForElement(e);
        scroll();
        AndroidElement pic1 = (AndroidElement) driver.findElement(e);
        actions.press(ElementOption.element(pic1)).waitAction().moveTo(PointOption.point(-1300,0))
                .release().perform();
    }

}
