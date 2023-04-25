import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KayakHome extends KayakBase {


    private static final By stayButton = By.cssSelector("a[aria-label='Search for hotels']");

    private static final By  searchInput = By.cssSelector("input[placeholder='Enter a city, hotel, airport, address or landmark']");

    public KayakHome(WebDriver driver) { // Konstruktorius.
        super(driver);
    }



    public static void stays() {
        WebDriverWait stayButtonWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            WebElement stay = stayButtonWait.until(ExpectedConditions.visibilityOfElementLocated(stayButton)); // WebElement stay = driver.findElement(stayButton);
            stay.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Stay button is not displayed. ");

        }
    }
    public static void searchInput() {
        WebDriverWait searchInputWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            WebElement input1 = searchInputWait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
            Thread.sleep(3000);
            /////////////////////////////
        } catch (Exception e){
            System.out.println("Search Input is not displayed. ");

        }
    }
}