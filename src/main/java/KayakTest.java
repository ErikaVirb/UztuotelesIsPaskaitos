import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

  public class KayakTest extends KayakBase {


    private KayakHome kayakHome;

      public KayakTest() {
          super(driver);
      }


      @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/Mano/Mokslai/IT mokymai/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        KayakBase.driver =  new ChromeDriver(options);
        KayakBase.driver.manage().window().maximize();



    }
    @Test
    public void kayakStayTest(){
//       KayakBase.goTo();
       KayakHome.stays();
       KayakHome.search();
       KayakHome.dates();
       KayakHome.guestsNumber();
       KayakHome.searchButton();
    }

    @AfterClass
    public static void teardown(){
//        driver.quit();
    }

}