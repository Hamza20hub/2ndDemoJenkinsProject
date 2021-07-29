package twitter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwitterPageObject {
    @FindBy(xpath = "//a[@data-testid='signupButton']")
    WebElement signUpBtn;

    public void setSignUpBtn(){
        signUpBtn.click();
    }
    public boolean signUpBtnIsEnable(){
       return signUpBtn.isEnabled();
    }
}
