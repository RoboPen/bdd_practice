package org.course.invoker.implementations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.course.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements WebDriverInvoker {
    private static ChromeBrowser chromeBrowserInstance=null;
    private final WebDriver webDriver;

    private ChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    public static ChromeBrowser getChromeBrowserInstance(){
        if(chromeBrowserInstance==null){
            chromeBrowserInstance = new ChromeBrowser();
        }
        return chromeBrowserInstance;
    }

    public WebDriver invokeWebDriver() {
        return webDriver;
    }
}
