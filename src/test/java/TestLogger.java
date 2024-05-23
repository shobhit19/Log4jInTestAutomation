import dev.failsafe.internal.util.Assert;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestLogger {
    private static Logger log;
    public static void main(String[] args) {
        log= LogManager.getLogger(TestLogger.class);

        WebDriver driver = new ChromeDriver();
        log.info("Driver instance created");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        log.info("Implicit wait set");
        driver.get("https://www.amazon.com");
        log.info("Navigate to amazon");
        String title=driver.getTitle();
        log.info("Fetched the title");
        System.out.println("Title of the page "+title);
        log.info("Title is fetched");
        driver.quit();
        log.info("browser session closed");
    }
}
