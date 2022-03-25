package org.course.factory;

import org.course.properties.converters.BrowserConverter;
import org.course.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory1 {
    public WebDriver getWebDriver() {
        return BrowserConverter.valueOfWebBrowser(
                new PropertyHolder().readProperty("browser")).invokeWebDriver();
    }
}
