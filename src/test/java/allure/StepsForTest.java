package allure;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class StepsForTest extends TestBase {

    @Step("Открываем страницу с репозиториями {repoLink}")
    public void openRepositoryPage() {
        open(repoLink);
    }

    @Step("Выбираем вкладку Issues")
    public void selectIssuesTab() {
        issueTab.click();
    }

    @Step("Проверяем, что имя ошибки {name}")
    public void checkIssueName() {
        issueName.should(Condition.exist);
    }
}
