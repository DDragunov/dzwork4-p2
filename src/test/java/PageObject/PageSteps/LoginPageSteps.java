package PageObject.PageSteps;

import io.cucumber.java.ru.*;
import utils.Configuration;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.*;
import static PageObject.PageElements.LoginPageElem.*;

public class LoginPageSteps {

    @Дано ("^открываем страницу авторизации Jira - \"([^\"]*)\"$")
    public static void openUrl(String url)
    {
        open(url);
    }

    @Когда("^пользователь вводит логин - \"([^\"]*)\" и пароль - \"([^\"]*)\"$")
    public static void  authorization (String login, String pass){
        loginIcon.click();
        //loginField.shouldBe(Condition.visible).sendKeys(Configuration.getConfigurationValue ("login"));
        loginField.shouldBe(Condition.visible).sendKeys(login);
        //passwordField.sendKeys(Configuration.getConfigurationValue("password"));
        passwordField.shouldBe(Condition.visible).sendKeys(pass);
        loginBtn.shouldBe(Condition.enabled).click();

        String elemVal = assertElemPage.shouldBe(Condition.visible, Duration.ofSeconds(10) ).getText();
        Assertions.assertEquals(elemVal, "System Dashboard", "Ошибка открытия главной страницы");
    }
    @Тогда("^должна открыться главная страница Jira с заголовком - \"([^\"]*)\"$")
    public static void openMainPageAccert(String namepage)
    {
        String elemVal = assertElemPage.shouldBe(Condition.visible, Duration.ofSeconds(10) ).getText();
        Assertions.assertEquals(elemVal, namepage, "Ошибка открытия главной страницы");
    }
}
