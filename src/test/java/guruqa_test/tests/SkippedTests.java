package guruqa_test.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SkippedTests extends TestBase {

    @Tag("skipped")
    @Test
    @Disabled
    void hh_ruTestSKD() {
        step("Открыть главную страницу сайта hh.ru", () -> open("https://hh.ru"));

        step("Проверить текст заголовка", () -> {
           String actualResult = $(".bloko-header-promo-3").getText();
            Assertions.assertEquals("Работа найдется для каждого", actualResult);
        });
    }
}
