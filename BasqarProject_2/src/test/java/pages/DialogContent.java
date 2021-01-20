package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    WebElement myElement;

    public DialogContent() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(linkText = "Got it!")
    private WebElement gotItButton;
    @FindAll({@FindBy(linkText = "Got it!")})
    private List<WebElement> gotItBtns;
    @FindBy(xpath = "//span[text()='Dashboard ']")
    private WebElement dashboard;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "gotItButton":
                if (gotItBtns.size() == 0) return;
                myElement = gotItButton;
                break;
        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndFindVerifyContainsText(String elementName, String text) {
        switch (elementName) {
            case "dashboard":
                myElement = dashboard;
                break;

        }

        verifyElementContainsText(myElement, text);
    }

}
