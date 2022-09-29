package PageObject.PageSteps;

import io.cucumber.java.ru.И;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static PageObject.PageElements.MainPageElem.*;

public class MainPageSteps {
    @И ("переходим на страницу проекта")
    public static void MainMetodProject() {
        projectMenu.shouldBe(visible, Duration.ofSeconds(60)).click();
        myProjectTEST.shouldBe(visible, Duration.ofSeconds(60)).click();
        fullListTask.shouldBe(visible, Duration.ofSeconds(60)).click();
    }
    @И ("смотрим количесво задач в проекте")
    public static void PageProjectTask(){

        String numberTask = countAllTask.getText();//Вывод количества задач проекта в консоль
        System.out.println("Общее Количество задач в проекте: " + numberTask);
    }

}
