package allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WithStepsAnnotation extends TestBase{
    @Test
    @Feature("Issue в репозитории")
    @Story("Проверка Issue")
    @Owner("Kopytov-Ilya")
    @DisplayName("Тест для примера запуска Allure c Annotation Steps")
    public void testAnnotatedStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        StepsForTest steps = new StepsForTest();

        steps.openRepositoryPage();
        steps.selectIssuesTab();
        steps.checkIssueName();
    }
}
