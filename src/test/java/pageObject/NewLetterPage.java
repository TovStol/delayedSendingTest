package pageObject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NewLetterPage {
    static String SetTime = "23:30";

    static String newLetterButton = ".ComposePopup-Content";
    static String addressInputField = ".MultipleAddressesDesktop-Field.ComposeYabblesField";
    static String email = "n.surnametest2@yandex.ru";
    static String topicInputField = "[name='subject']";
    static String textLetterField = "#cke_1_contents";
    static String sendEmailButton = "button.Button2.Button2_pin_circle-circle.Button2_view_default";
    static String textLetter = "В чужбине свято наблюдаю\n" +
            "Родной обычай старины:\n" +
            "На волю птичку выпускаю\n" +
            "При светлом празднике весны.\n" +
            "Я стал доступен утешенью;\n" +
            "За что на бога мне роптать,\n" +
            "Когда хоть одному творенью\n" +
            "Я мог свободу даровать!\n";
    static String delayedSendButton = ".ComposeDelayedSendingButton";
    static String deleyedSendPopup = ".DelayedSendingOptions";
    static String dateTimeSelectionButton = ".DelayedSendingOptions-Item.DelayedSendingOptions-CustomDate";
    static String calendarPopup = ".ComposeDateTimePicker-Controls";
    static String inputTimeField = ".ComposeDateTimePicker-Input_time input";
    static String dataTimeSelectionSaveButton = ".ComposeDateTimePicker-Button_save";
    static String deleyedTimeSet = ".DelayedTimePicker__Container .DelayedTimePicker__Button";


    public void writeNewLetter() {

        $(newLetterButton).shouldHave(text("Новое письмо"));
        $$(addressInputField).first().lastChild().sendKeys(email);
        $(topicInputField).setValue("Тестовое письмо");
        $(textLetterField).lastChild().setValue(textLetter);
        $(delayedSendButton).click();
        $(deleyedSendPopup).shouldBe(visible);
        $(dateTimeSelectionButton).click();
        $(calendarPopup).shouldBe(visible);
        $(inputTimeField).click();
        $$(deleyedTimeSet).find(text(SetTime)).click();
        $(dataTimeSelectionSaveButton).click();
        $(calendarPopup).shouldNotBe(visible);
        $(sendEmailButton).shouldHave(text("сегодня в " + SetTime));
        $(sendEmailButton).click();

    }


    public NewLetterPage fillFieldAdr(String address){
        return this;
    }

    public NewLetterPage fillFieldSubject(String subject){
        return this;
    }

    /**
     * Пишем новое сообщение
     * @param message - текст сообщения
     *
     */
    public NewLetterPage fillMessage(String message){
        return this;
    }
}
