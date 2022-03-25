package org.course.invoker.implementations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.course.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalChromeInvoker implements WebDriverInvoker {
    public WebDriver invokeWebDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
