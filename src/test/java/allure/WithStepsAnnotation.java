package allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class WithStepsAnnotation extends TestBase{
    @Test
    public void testAnnotatedStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        StepsForTest steps = new StepsForTest();

        steps.openRepositoryPage();
        steps.selectIssuesTab();
        steps.checkIssueName();
    }
}
