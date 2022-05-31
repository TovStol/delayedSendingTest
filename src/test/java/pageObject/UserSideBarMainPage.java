package pageObject;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class UserSideBarMainPage {
    String mailButton = ".desk-notif-card__mail-title";

    public UserSideBarMainPage smokeCheckPage() {
        $(mailButton).shouldBe(visible);
        return this;
    }

    public void clickMailButton() {
        $(mailButton).click();
    }
}
