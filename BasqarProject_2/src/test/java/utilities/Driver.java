package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName=new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        if (threadBrowserName.get()==null)
        {
            threadBrowserName.set("firefox");
        }


        if (threadDriver.get() == null)
        {
            switch (threadBrowserName.get())
            {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set( new ChromeDriver() );
                    break;

                default:
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set( new FirefoxDriver() );
                    break;
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver()
    {
        if (threadDriver.get() != null)
        {
            threadDriver.get().quit();
            WebDriver driver=threadDriver.get(); // threadLocl deki ilgili driverının referansı alındı.
            driver=null;
            threadDriver.set(driver);
        }
    }
}