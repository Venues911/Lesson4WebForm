package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestTextBox {


    @BeforeAll
    static void configure(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 9000;

    }


    @Test
    void fillFormTest(){
        open("/text-box");
        $("#userName").setValue("valera");
        $("#userEmail").setValue("valera@testmail.com");
        $("#currentAddress").setValue("Some Address");
        $("#permanentAddress").setValue("Some Address 1");
        $("#submit").click();

    }
}
