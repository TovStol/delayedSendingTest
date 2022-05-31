package pageObject;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DelayedSendPopup extends NewLetterPage{
    String deleyedSendPopup = ".DelayedSendingOptions";
    String dateTimeSelectionButton = ".DelayedSendingOptions-Item.DelayedSendingOptions-CustomDate";

    public DelayedSendPopup smokeCheckPage() {
        $(deleyedSendPopup).shouldBe(visible);
        return this;
    }
    public CalendarPopup clickDateTimeSelectButton() {
        $(dateTimeSelectionButton).click();
        return new CalendarPopup();
    }

}
