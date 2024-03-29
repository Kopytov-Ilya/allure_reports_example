package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class TestWithLambda extends TestBase {


    @Test
    @Feature("Issue в репозитории")
    @Story("Проверка Issue")
    @Owner("Kopytov-Ilya")
    @DisplayName("Тест для примера запуска Allure c Lambda")
    public void issueSearch() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем страницу с репозиториями " + repoLink, () -> {
            open(repoLink);
        });

        step("Выбираем вкладку Issues", () -> {
            issueTab.click();
        });

        step("Проверяем, что имя ошибки " + name, () -> {
            issueName.should(Condition.exist);
        });
    }
}