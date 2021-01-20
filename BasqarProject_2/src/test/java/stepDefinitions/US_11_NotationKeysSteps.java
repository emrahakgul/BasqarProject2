package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.Parent;

import pages.US_11_NotationKeysPOM;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class US_11_NotationKeysSteps extends Parent {


    US_11_NotationKeysPOM notationKeys = new US_11_NotationKeysPOM();

    public US_11_NotationKeysSteps() {
    }


    @And("^Userrr sending the keys$")
    public void userrrSendingTheKeys(DataTable elements) {

        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {
            notationKeys.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Userrr should see \"([^\"]*)\" message$")
    public void userrrShouldSeeMessage(String message) {
        notationKeys.findElementAndFindVerifyContainsText("success/error", message);
    }


    @Then("^Userrr \"([^\"]*)\" \"([^\"]*)\"$")
    public void userrr(String editorDelete, String value) {
        notationKeys.editAndDeleteFunction(editorDelete, value);
    }


    @Then("^user should confirm \"([^\"]*)\" text$")
    public void userShouldConfirmText(String text) {
        notationKeys.findElementAndFindVerifyContainsText("notationKeysconfirm", text);
    }

    @Then("^\"([^\"]*)\" should be visible$")
    public void shouldBeVisible(String text) {
        notationKeys.findElementAndCheckIfEqual(text);
    }

    @When("^User clicks on the elements in Page$")
    public void userClicksOnTheElementsInPage(DataTable elements) {
        List<String> elementList = elements.asList(String.class);

        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i));
            notationKeys.findElementAndClickFunction(elementList.get(i));
        }
    }
}
