package pageObject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NewLetterPage {

    static String newLetterButton = ".ComposePopup-Content";
    static String addressInputField = ".MultipleAddressesDesktop-Field.ComposeYabblesField";
    String calendarPopup = ".ComposeDateTimePicker-Controls";
    static String topicInputField = "[name='subject']";
    static String textLetterField = "#cke_1_contents";
    static String sendEmailButton = "button.Button2.Button2_pin_circle-circle.Button2_view_default";

    static String delayedSendButton = ".ComposeDelayedSendingButton";


    public void clickSendEmailButton() {
        $(sendEmailButton).click();

    }

    public NewLetterPage checkDelayedTime(String delayTime) {
        $(calendarPopup).shouldNotBe(visible);
        $(sendEmailButton).shouldHave(text("сегодня в " + delayTime));
        return this;
    }


    public NewLetterPage smokeCheckPage() {
        $(newLetterButton).shouldHave(text("Новое письмо"));
        $(sendEmailButton).shouldBe(visible);
        return this;
    }

    public NewLetterPage fillFieldAdr(String address) {
        $$(addressInputField).first().lastChild().sendKeys(address);
        return this;
    }

    public NewLetterPage fillFieldSubject(String subject) {
        $(topicInputField).setValue(subject);
        return this;
    }

    public NewLetterPage fillMessage(String textLetter) {
        $(textLetterField).lastChild().setValue(textLetter);
        return this;
    }

    public DelayedSendPopup clickDelayedSendButton() {
        $(delayedSendButton).click();
        return new DelayedSendPopup();
    }
}
