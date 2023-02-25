package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.driverFactory;
import util.propertiesFactory;

import java.io.File;

public class general {
    driverFactory driverFactory = new driverFactory();
    propertiesFactory propertiesFactory = new propertiesFactory();
    DesiredCapabilities capabilities;


    @Given("clear cache without delete")
    public void clearCacheWithoutDelete() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "5a7b5e20");
        capabilities.setCapability("appPackage", "com.hmh.api");
        capabilities.setCapability("appActivity", "com.hmh.api.ApiDemos");
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("autoAcceptAlerts", "true");
        capabilities.setCapability("fullReset", "false");//uygulamayı kaldırmak
        capabilities.setCapability("noReset", "true");//verileri silmek
        driverFactory.initDriverWithCaps(propertiesFactory.getBrowser(), capabilities);
    }

    @Given("reinstall app")
    public void reinstallApp() {
        File applicationParentDirectoryPath = new File("src");
        File app = new File(applicationParentDirectoryPath, "./test/resources/app/Demos.apk");
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "5a7b5e20");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("autoAcceptAlerts", "true");
        capabilities.setCapability("fullReset", "true");//uygulamayı kaldırmak
        capabilities.setCapability("adbExecTimeout", "50000");
        driverFactory.initDriverWithCaps(propertiesFactory.getBrowser(), capabilities);
    }
}
