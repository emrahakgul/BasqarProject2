package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US_06_DocumentTypesPOM extends Parent {

    WebElement myElement;
    List<WebElement> myList;

    public US_06_DocumentTypesPOM() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;
    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.ADD')]//button")
    private WebElement addButton;
    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement namebox;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-button mat-icon-button mat-button-base ng-star-inserted']")
    private WebElement language;
    @FindBy(xpath = "//input[@id='ms-text-field-0' ]")
    private WebElement nameSearch;
    @FindBy(xpath = "//span[@class='title dialog-title']")
    private WebElement documentTitle;

    @FindAll({
            @FindBy(xpath = "//mat-select[@role='combobox'])[3]")
    })
    public List<WebElement> stageSelect;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(id = "mat-input-5")
    private WebElement description;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "(//button[@class='mat-focus-indicator mat-tooltip-trigger mat-button mat-icon-button mat-button-base'])[2]")
    private WebElement closeButton;

    @FindBy(css = "div#toast-container")
    private WebElement message;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement stage;
    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement option1;


    @FindAll({@FindBy(css = "div#toast-container")})
    private List<WebElement> messageList;
    @FindAll({@FindBy(css = "ms-delete-button.ng-star-inserted")})
    private List<WebElement> deleteButton;
    @FindAll({@FindBy(css = "ms-edit-button.ng-star-inserted")})
    private List<WebElement> editButton;
    @FindAll({@FindBy(css = "tbody>tr>td:nth-child(2)")})
    private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")
    private WebElement yesButton;


    public void findElementAndClickFunction(String element) {
        switch (element) {
            case "setup":
                myElement = setup;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "documentTypes":
                myElement = documentTypes;
                break;
            case "language":
                myElement = language;
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
            case "searchButton":
                myElement = searchButton;
                break;
            case "documentTitle":
                myElement = documentTitle;
                break;

            case "stage":
                myElement = stage;
                break;
            case "option1":
                myElement = option1;
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
            case "description":
                myElement = description;
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
                myList = editButton;
                break;

            case "delete":
                myList = deleteButton;
        }


        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(elementName)) {
                clickFunction(myList.get(i));
                break;
            }
        }
    }


}
