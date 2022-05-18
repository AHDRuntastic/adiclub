package adidasRuntastic.pages.adiClubPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import adidasRuntastic.base.PageBase;

public class History extends PageBase {
    public History(AppiumDriver driver) {
        super(driver);
    }

    private By historyTab = By.xpath("//android.widget.LinearLayout[@content-desc=\"HISTORY\"]/android.widget.TextView");
    private By historyData = By.id("com.runtastic.android.results.lite:id/engagementType");


    public void setHistoryTab(){
        click(historyTab);
    }

    public String setHistoryData(){
         return getText(historyData);
    }

}
