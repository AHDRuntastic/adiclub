package adidasRuntastic.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import adidasRuntastic.utilities.LoadProperties;


public class TestBase extends AbstractTestNGCucumberTests  {
    public static AppiumDriver driver;
    public static AppiumDriverLocalService service;
    LoadProperties loadProperties;
    public static Process process;

   public void startServer() //method to automatically start the server and should exist in every test class

    {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        //Set Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("noReset", "false");

        //Build the Appium service
        builder = new AppiumServiceBuilder();
        builder.withIPAddress("0.0.0.0");
        builder.usingPort(4723);
        builder.withCapabilities(cap);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

        //Start the server with the builder
        service = AppiumDriverLocalService.buildService(builder);
        service.start();

        }

    public void AndroidSetUp() throws MalformedURLException {
        loadProperties = new LoadProperties();
        String applicationName = loadProperties.getDataFromPropertiesFile();

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("platformVersion","11.0");
        cap.setCapability("deviceName","Pixel 4 XL AHD");

        switch (applicationName) {
            case "Training":
                cap.setCapability("appPackage", "com.runtastic.android.results.lite");
                cap.setCapability("appActivity", "com.runtastic.android.results.MainActivity");
                cap.setCapability("app",System.getProperty("user.dir")+"/applications/AdiTrainingApp.apk");
                break;
            case "Running":
                cap.setCapability("appPackage", "com.runtastic.android");
                cap.setCapability("appActivity", "com.runtastic.android.activities.StartActivity");
                cap.setCapability("app",System.getProperty("user.dir")+"/applications/AdiRunningApp.apk");
                break;
        }

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
    }

    public void iOSSetUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "iOS");
        cap.setCapability("automationName","XCUITest");
        cap.setCapability("platformVersion","15.4");
        cap.setCapability("deviceName","iPhone 12");
        cap.setCapability("appPackage", "com.runtastic.android.results.lite");
        cap.setCapability("appActivity", "com.runtastic.android.results.MainActivity");
        cap.setCapability("app",System.getProperty("user.dir")+"/apps/AdiTrainingApp.app");

        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"),cap);
    }

    public void closeDriver() throws IOException{

        if (null != driver){

            driver.quit();
        }
    }

    public static void stopAppiumServer() throws IOException {
        if (process != null) {
            process.destroy();
        }
        System.out.println("Appium server stop");
    }

}
