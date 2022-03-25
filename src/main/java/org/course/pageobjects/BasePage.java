package org.course.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait wait;

    protected BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        PageFactory.initElements(webDriver, this);
    }
}
