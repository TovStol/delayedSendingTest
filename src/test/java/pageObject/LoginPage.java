package pageObject;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    String loginPopupWindow = ".passp-auth-content";
    String loginField = "[id='passp-field-login']";
    String enterButton = "[id='passp:sign-in']";
    String phoneInputField = "input[type=tel]";
    String changeModeLoginButton = ".Button2-Text";

    public LoginPage smokeCheckPage() {
        $(loginPopupWindow).shouldBe(visible);
        $(loginField).shouldBe(visible);
        $(enterButton).shouldBe(visible);
        return this;
    }
    public LoginPage mailLoginMode() {
        if ($(phoneInputField).exists()) {
            $(changeModeLoginButton, 0).parent().click();
        }
        return this;
    }
    public void inputLogin(String login) {
        $(loginField).setValue(login);
        $(enterButton).click();
    }
}
