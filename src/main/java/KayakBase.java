import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class KayakBase { // Svarbiausios savybes.


    protected static WebDriver driver; // Kad butu pasiekiamos kitose klasese - static!!!

    public KayakBase(WebDriver driver){
        KayakBase.driver = driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}