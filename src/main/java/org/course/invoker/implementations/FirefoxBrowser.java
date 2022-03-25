package org.course.invoker.implementations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.course.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements WebDriverInvoker {
    private static FirefoxBrowser firefoxBrowserInstance=null;
    private final WebDriver webDriver;

    private FirefoxBrowser(){
        WebDriverManager.firefoxdriver().setup();
        webDriver = new FirefoxDriver();
    }

    public static FirefoxBrowser getFirefoxBrowserInstance(){
        if(firefoxBrowserInstance==null){
            firefoxBrowserInstance = new FirefoxBrowser();
        }
        return firefoxBrowserInstance;
    }

    public WebDriver invokeWebDriver() {
        return webDriver;
    }
}
