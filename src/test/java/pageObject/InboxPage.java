package pageObject;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class InboxPage {
    static String toWriteButton = "[href='#compose']";

    public InboxPage smokeCheckPage() {
        $(toWriteButton).shouldBe(visible);
        return this;
    }

    public void clickWriteButton() {
        $(toWriteButton).click();
    }
}
