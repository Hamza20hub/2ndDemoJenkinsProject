package twiterHomeTest;

import base.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import twitter.TwitterPageObject;

public class TwitterHomePageTest extends BaseClass {
    public static TwitterPageObject twitterPageObject = null;
    @BeforeClass
    public void init() {
        twitterPageObject = PageFactory.initElements(driver, TwitterPageObject.class);
        driver.get("https://www.twitter.com");
    }
    @Test
    public void verifyTitleTest(){
      String title=  driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Twitter");
    }
    @Test
    public void signUpBtn() throws InterruptedException {
        twitterPageObject.setSignUpBtn();
        Thread.sleep(1000);
        Assert.assertTrue(twitterPageObject.signUpBtnIsEnable());
    }
}
