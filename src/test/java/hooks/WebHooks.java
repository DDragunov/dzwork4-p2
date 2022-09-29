package hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
//import org.junit.jupiter.api.*;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class WebHooks {
    @Before
    public static void SetWebDriver()
    {
        Configuration.startMaximized = true;
    }

    @After
    public void CloseWebDriver()//закрываем драйвер после каждого теста
    {
        WebDriverRunner.closeWebDriver();
    }
}
