package pageObject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarPopup extends DelayedSendPopup{

    String inputTimeField = ".ComposeDateTimePicker-Input_time input";
    String deleyedTimeSet = ".DelayedTimePicker__Container .DelayedTimePicker__Button";
    String dataTimeSelectionSaveButton = ".ComposeDateTimePicker-Button_save";
    public CalendarPopup smokeCheckPage() {
        $(calendarPopup).shouldBe(visible);
        return this;
    }

    public CalendarPopup setDateTime(String delayTime) {
        $(inputTimeField).click();
        $$(deleyedTimeSet).find(text(delayTime)).click();
        return this;
    }

    public NewLetterPage clickDateTimeSaveButton() {
        $(dataTimeSelectionSaveButton).click();
        return new NewLetterPage();
    }

}
