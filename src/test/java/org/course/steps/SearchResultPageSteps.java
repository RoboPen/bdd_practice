package org.course.steps;

import io.cucumber.java.en.Then;
import org.course.pageobjects.pages.SearchResultPage;
import org.testng.Assert;

import static org.course.steps.BaseSteps.PAGES_STORAGE;

public class SearchResultPageSteps {
    @Then("{string} on {string} is printed")
    public void onIsPrinted(String message, String pageName) {
        String resultInfo = ((SearchResultPage) PAGES_STORAGE.get(pageName))
                .getTextForIncorrectProductName();

        Assert.assertEquals(resultInfo, message,
                "Info doesn't contain incorrect input when no results");
    }

    @Then("{string} in result info bar on {string} is displayed")
    public void inputInResultInfoBarOnIsDisplayed(String input, String pageName) {
        String displayedInput = ((SearchResultPage) PAGES_STORAGE.get(pageName))
                .getProductNameFromResultInfoBar();

        Assert.assertTrue(displayedInput.contains(input), "Input not present in info bar");
    }

    @Then("At least one title contains input on {string}")
    public void atLeastOneTitleContainsInputOnSearchResultPage(String pageName) {
        boolean isTitleContainingProductName = ((SearchResultPage) PAGES_STORAGE.get(pageName))
                .checkAnyTitleContainsProductName();

        Assert.assertTrue(isTitleContainingProductName, "None title contains input");
    }


}
