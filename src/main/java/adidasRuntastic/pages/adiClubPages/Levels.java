package adidasRuntastic.pages.adiClubPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import adidasRuntastic.base.PageBase;

public class Levels extends PageBase {

    public Levels(AppiumDriver driver) {
        super(driver);
    }


    private By levelHeader = By.id("com.runtastic.android.results.lite:id/levelTitle");
    private By unlocked = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup" +
            "/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout" +
            "/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup" +
            "/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]" +
            "/android.view.ViewGroup/android.widget.TextView[2]");
    private By lockedBtn = By.id("com.runtastic.android.results.lite:id/lockIcon");
    private By lockedTxt = By.id("com.runtastic.android.results.lite:id/headerLockedStatus");
    private By backBtnLevel = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");


    public String setLevelHeader(){

        return getText(levelHeader);
    }

    public String setUnlocked(){

        return getText(unlocked);
    }

    public void setLevelSwipe(){
        swipe(unlocked);
    }

    public void setLockedBtn(){
        click(lockedBtn);
    }

    public String setLockedTxt(){
        return getText(lockedTxt);
    }

    public void setBackBtnLevel() {
        click(backBtnLevel);
    }
}
