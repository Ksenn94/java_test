package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class textboxTests {
    @BeforeAll
    static void configure() {
        //configuration нужна для прописания конфигов браузера, таймаутов и т.д.
        //используем браузер во всех тестах в классе, прописываем только относительный путь
        Configuration.baseUrl ="https://demoqa.com";
    }
    @Test
    void fullformtest() {
        open("/text-box");
        $("[id=userName]").setValue("Игорь");
        $("#userEmail").setValue("igor@mail.com");
        $("#currentAddress").setValue("lala street");
        $("#permanentAddress").setValue("gg street");
        $("#submit").click();
        $("#submit").click();
        $("#output").$("#email").shouldHave(Condition.text("igor@mail.com"));
        $("#output #name").shouldHave(Condition.text("Игорь"));
        $("#output #currentAddress").shouldHave(Condition.text("lala street"));
        $("#output #permanentAddress").shouldHave(Condition.text("gg street"));


        //$("#output" #name").shouldHave(Condition.text("Игорь"));
        //$("#output").shouldHave(Condition.text("Игорь"));
    }
}
