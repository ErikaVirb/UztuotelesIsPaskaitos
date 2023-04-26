import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class KayakHome extends KayakBase {


    private static final By stayButton = By.cssSelector("a[aria-label='Search for hotels']");
    private static final By  searchInput = By.cssSelector("input[placeholder='Enter a city, hotel, airport, address or landmark']");
    private static final By stayDate = By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div[1]/span");
    private  static final By firstDay = By.cssSelector("div[aria-label='Wednesday May 10, 2023']");
    private static final By lastDay = By.cssSelector("div[aria-label='Saturday May 27, 2023']"); //.mkUa.mkUa-pres-mcfly.mkUa-isEndDate.mkUa-isSelected
    private static final By guestsNumber = By.cssSelector(".G2iq-displayContent");
    private static final By minus1Adult = By.xpath("/html/body/div[16]/div/div/div/div/div/div[2]/div/button[1]");
    private static final By searchButton = By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div/div[1]/div/div/section/div/div/div/div/div/div[1]/div[2]/button");

    public KayakHome(WebDriver driver) { // Konstruktorius.
        super(driver);
    }


    public static void stays() {
        WebDriverWait stayButtonWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {   //stayButton
            WebElement stay = stayButtonWait.until(ExpectedConditions.visibilityOfElementLocated(stayButton)); // WebElement stay = driver.findElement(stayButton);
            stay.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Stay button is not displayed. ");

        }
    }
    public static void search() {
        WebDriverWait searchInputWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try{
            WebElement input = searchInputWait.until(ExpectedConditions.visibilityOfElementLocated(searchInput));
            WebElement inputField = driver.findElement(searchInput);
            String inputData = "Narutis Hotel";
            inputField.sendKeys(inputData);
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Search field is not displayed. ");
        }
    }
    public static void dates(){
        try{ // stayDate
            WebDriverWait stayDateWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement stayDates = stayDateWait.until(ExpectedConditions.visibilityOfElementLocated(stayDate)); // WebElement stay = driver.findElement(stayButton);
            stayDates.click();
            Thread.sleep(3000);
            //  firstDay
            WebDriverWait firstDayWait= new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstDays = firstDayWait.until(ExpectedConditions.visibilityOfElementLocated(firstDay));
            firstDays.click();
            Thread.sleep(3000);
            //   lastDay
            WebDriverWait lastDayWait= new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement lastDays = lastDayWait.until(ExpectedConditions.elementToBeClickable(lastDay));
            lastDays.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Add Days selection button is not displayed. ");
        }
    }
    public static void guestsNumber(){
        WebDriverWait guestNumberWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try { //  guestsNumber
            WebElement guestsNumbers = guestNumberWait.until(ExpectedConditions.visibilityOfElementLocated(guestsNumber));
            guestsNumbers.click();
            Thread.sleep(3000);
            //  minus1Adult
            WebDriverWait minus1AdultWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement minus1Adults = minus1AdultWait.until(ExpectedConditions.elementToBeClickable(minus1Adult));
            minus1Adults.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Guest Number button is not displayed. ");
        }
    }
    public static void searchButton(){
        WebDriverWait searchButtonWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try { //  searchButton
            WebElement searchButtons = searchButtonWait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
            searchButtons.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Search button is not displayed. ");
        }
    }
}