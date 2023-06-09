package stepDefinitions;

import utilities.GWD;
import io.cucumber.java.*;
import org.openqa.selenium.*;

public class Hooks {
    @After
    public void after(Scenario scenerio){
        System.out.println("The scenerio has finished");

        if (scenerio.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            scenerio.attach(hafizadakiHali, "image/png","screen shot");
        }
        GWD.quitDriver();
    }
}
