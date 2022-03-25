package org.course.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.course.pageobjects.pages.IndexPage;
import org.course.pageobjects.pages.SearchResultPage;

import static org.course.steps.BaseSteps.PAGES_STORAGE;
import static org.course.steps.BaseSteps.driver;

public class IndexPageSteps {
    @Given("User is on {string}")
    public void userIsOnIndexPage(String pageName) {
        IndexPage indexPage = new IndexPage(driver);
        PAGES_STORAGE.put(pageName, indexPage);
        indexPage.open();
    }

    @When("User enters {string} into searchbar on {string}")
    public void userEntersInputIntoSearchbar(String input, String pageName) {
        PAGES_STORAGE.put("Search Result Page", ((IndexPage) PAGES_STORAGE.get(pageName)).searchProduct(input));
    }

}
