package adidasRuntastic.pages.registrationPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import adidasRuntastic.base.PageBase;

public class Registration extends PageBase {

    public Registration(AppiumDriver driver) {
        super(driver);
    }

    private By journeyBtn = By.id("com.runtastic.android.results.lite:id/startJourneyButton");
    private By signupBtn = By.id("com.runtastic.android.results.lite:id/mail_sign_up_button");
    private By fName = By.id("com.runtastic.android.results.lite:id/firstName");
    private By lName = By.id("com.runtastic.android.results.lite:id/lastName");
    private By email = By.id("com.runtastic.android.results.lite:id/email");
    private By password = By.id("com.runtastic.android.results.lite:id/password");
    private By birthdate = By.id("com.runtastic.android.results.lite:id/birthdatePicker");
    private By birthdate2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText");
    private By birthdate3 = By.id("android:id/button1");
    private By joinBtn = By.id("com.runtastic.android.results.lite:id/joinButton");



    public void setJourneyBtn(){
        click((By) journeyBtn);
    }

    public void setSignupBtn(){
        click((By) signupBtn);
    }

    public void setFName(String FirstName){
        addText(fName, FirstName);
    }

    public void setlName(String LastName){
        addText(lName, LastName);
    }

    public void setEmail(String Email){
        addText(email, Email);
    }

    public void setPassword(String Password){
        addText(password, Password);
    }


    public void setBirthdate(){
        click(birthdate);
        addText(birthdate2,"2000");
        click(birthdate2);
        click(birthdate3);
    }

    public void setJoinBtn(){
        click(joinBtn);
    }

}
