package adidasRuntastic.pages.adiClubPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import adidasRuntastic.base.PageBase;

public class AdiClubPass extends PageBase {

    public AdiClubPass(AppiumDriver driver) {
        super(driver);
    }

    private By myAdiClubTxt = By.id("com.runtastic.android.results.lite:id/explanationTitle");
    private By gotItBtn = By.id("com.runtastic.android.results.lite:id/explanationCta");
    private By barCode = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView" +
            "/android.view.View/android.view.View[4]");
    private By levelTxt = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView" +
            "/android.view.View/android.view.View[2]");
    private By infoScreenBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout\n" +
            "    /android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView\n" +
            "    /android.view.View/android.view.View/android.view.View/android.widget.Button[2]");
    private By backBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout" +
            "/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View" +
            "/android.widget.Button[1]");

    public String setMyAdiClubTxt(){

    return getText(myAdiClubTxt);
   }

    public void setGotItBtn(){

        click(gotItBtn);
    }

    public boolean setBarCode(){

        return isExist(barCode);
    }

    public String setLevelTxt(){

        return getText(levelTxt);
    }

    public void setInfoScreenBtn(){

        click(infoScreenBtn);
    }

    public void setBackBtn(){
        click(backBtn);
    }



}
