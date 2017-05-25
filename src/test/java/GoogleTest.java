import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Collection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.junit.ScreenShooter.failedTests;

/**
 * Created by LENOVO on 23.05.2017.
 */
public class GoogleTest {
    @Rule
    public ScreenShooter photographer = failedTests().succeededTests();

    public class GooglePage {
        public void searchFor(String query) {
            $(By.name("q")).setValue(query).pressEnter();
        }

        public Collection<SelenideElement> results() {
            return $$("#ires div.g");
        }

        public SelenideElement getResult(int index) {
            return $("#ires div.g", index);
        }
    }

    @Test
    public  void search_selenide_in_google() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        Configuration.browser = "chrome";

        open("http://www.google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$("#ires div.g").shouldHaveSize(9);
        $("#ires div.g").shouldHave(text(" Selenide "));

        //GooglePage page = open("http://google.com", GooglePage.class);
        //page.searchFor("selenide");
        //assertEquals(10, page.results().size());
        //(page.getResult(0).getText().contains("selenide.org"));

        sleep(10000);
    }
}
