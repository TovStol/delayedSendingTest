package pageObject;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PasswordPage {
    String passwordField = "[id='passp-field-passwd']";

    public PasswordPage smokeCheckPage() {
        $(".CurrentAccount").shouldBe(visible);
        return this;
    }

    public void inputPassword(String password) {
        $(passwordField).setValue(password).pressEnter();

    }
}
