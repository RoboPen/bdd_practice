package org.course.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.course.factory.WebDriverFactory;
import org.course.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BaseSteps {
    public static final Map<String, BasePage> PAGES_STORAGE = new HashMap<>();

    public static WebDriver driver;

    @Before
    public void initWebDriver() {
        driver = new WebDriverFactory().getWebDriver();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
