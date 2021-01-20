package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class US_11_NotationKeysPOM extends Parent {

    WebElement myElement;
    List<WebElement> myList;

    public US_11_NotationKeysPOM() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setup2;
    @FindBy(xpath = "//span[text()='Notation Keys']")
    private WebElement notationKeys;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.ADD')]//button")
    private WebElement addButton;
    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement namebox;
    @FindBy(xpath = "//input[@name='shortName']")
    private WebElement shortnamebox;
    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement formnamebox;
    @FindBy(xpath = "//input[@name='multiplier']")
    private WebElement multiplerbox;
    @FindBy(xpath = "//ms-button/button/span[1]/span")
    private WebElement applyButton;

    @FindBy(xpath = "//input[@id='mat-input-4']")
    private WebElement nameSearch;


    @FindBy(xpath = "//h3[text()='  Timesheet Notation Keys ']")
    private WebElement notationKeysconfirm;


    @FindBy(xpath = "//ms-browse-search/div/div/button")
    private WebElement searchButton;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "(//button[@class='mat-focus-indicator mat-tooltip-trigger mat-button mat-icon-button mat-button-base'])[2]")
    private WebElement closeButton;

    @FindBy(css = "div#toast-container")
    private WebElement message;


    @FindAll({@FindBy(css = "div#toast-container")})
    private List<WebElement> messageList;
    @FindAll({@FindBy(css = "ms-delete-button.ng-star-inserted")})
    private List<WebElement> delete;
    @FindAll({@FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")})
    private List<WebElement> edit;
    @FindAll({@FindBy(css = "tbody>tr>td:nth-child(2)")})
    private List<WebElement> nameList;


    @FindBy(css = "button[type='submit']")
    private WebElement yesButton;


    public void findElementAndClickFunction(String element) {
        switch (element) {
            case "setup2":
                myElement = setup2;
                break;
            case "humanResources":
                myElement = humanResources;
                break;
            case "notationKeys":
                myElement = notationKeys;
                break;

            case "addButton":
                myElement = addButton;
                break;
            case "namebox":
                myElement = namebox;
                break;
            case "closeButton":
                myElement = closeButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "applyButton":
                myElement = applyButton;
                break;
            case "searchButton":
                myElement = searchButton;
                break;


            case "nameSearch":
                myElement = nameSearch;
                break;

            case "yesButton":
                myElement = yesButton;
                break;


        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String element, String value) {
        switch (element) {
            case "namebox":
                myElement = namebox;
                break;
            case "shortnamebox":
                myElement = shortnamebox;
                break;
            case "formnamebox":
                myElement = formnamebox;
                break;
            case "multiplerbox":
                myElement = multiplerbox;
                break;

            case "nameSearch":
                myElement = nameSearch;
                break;


        }

        sendKeysFunction(myElement, value);
    }

    public void findElementAndFindVerifyContainsText(String element, String text) {
        switch (element) {
            case "success/error":
                myElement = message;
                break;

            case "notation":
                myElement = notationKeysconfirm;
                break;

            case "namelist":
                myElement = nameList.get(0);
                break;

        }
        verifyElementContainsText(myElement, text);
    }

    public void editAndDeleteFunction(String editorDelete, String elementName) {
        if (messageList.size() > 0) {
            //   if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        switch (editorDelete) {
            case "edit":
                myList = edit;
                break;

            case "delete":
                myList = delete;
        }


        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(elementName)) {
                clickFunction(myList.get(i));
                break;
            }
        }
    }


    public void findElementAndCheckIfEqual(String text) {
        Assert.assertEquals(nameList.get(0).getText(), text);
    }

}
