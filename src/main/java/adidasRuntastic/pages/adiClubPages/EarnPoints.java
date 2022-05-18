package adidasRuntastic.pages.adiClubPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import adidasRuntastic.base.PageBase;

public class EarnPoints extends PageBase {
    public EarnPoints(AppiumDriver driver) {
        super(driver);
    }


    private By earnPoints = By.id("com.runtastic.android.results.lite:id/pointsInfoViewTitle");
    private By earnPointsPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
    private By earnPointBack = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");



    public String setEarnPoints1(){
        return getText(earnPoints);

    }

    public void setEarnPoints2(){
        click(earnPoints);
    }

    public String setEarnPointsPage(){
        return getText(earnPointsPage);

    }

    public void setEarnPointBack(){
        click(earnPointBack);
    }

}
