package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class TestWithListener extends TestBase {


    @Test
    @DisplayName("Тест для примера запуска Allure c Listener")
    public void issueSearch() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        open(repoLink);
        issueTab.click();
        issueName.should(Condition.exist);

    }
}
