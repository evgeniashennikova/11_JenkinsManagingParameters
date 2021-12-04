package guruqa_test.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class NegativeTest {

    @Tag("NegativeTest")
    @Test
    void hh_ruTestNegative() {

        step("Открыть главную страницу сайта hh.ru", () -> open("https://hh.ru"));

        step("В поисковой строке написать название должности", () -> {
            $("[data-qa='search-input']").setValue("QA Engineer");
        });

        step("Нажать кнопку 'Найти работу' для начала поиска", () ->
                $("[data-qa='search-button']").click());

        step("На странице результатов поиска проверить вакансии на соответствие введённому запросу", () -> {
            $("[data-qa='vacancy-serp__results']").shouldHave(text("Продавец"));
        });
    }

}
