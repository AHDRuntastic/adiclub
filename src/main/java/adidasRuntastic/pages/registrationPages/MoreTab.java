package adidasRuntastic.pages.registrationPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import adidasRuntastic.base.PageBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoreTab extends PageBase {

    public MoreTab(AppiumDriver driver) {
        super(driver);
    }

    private By moreTab = By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]" +
            "/android.view.ViewGroup");
    private By levelOne = By.id("com.runtastic.android.results.lite:id/currentLevel");
    private By adiClub = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]" +
            "/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ScrollView" +
            "/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]" +
            "/android.widget.TextView");
    private By showMoreBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout[1]" +
            "/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ScrollView" +
            "/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]" +
            "/android.widget.Button");

    public void setMoreTab(){

        click(moreTab);
    }

    public String getLevelOne(){
        return getText(levelOne);

    }

    public String getAdiClub(){

        return getText(adiClub);
    }

    public void setShowMoreBtn(){
        click(showMoreBtn);
    }

}
