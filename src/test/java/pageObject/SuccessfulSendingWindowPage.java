package pageObject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SuccessfulSendingWindowPage {
    String popupHasBeSentWindow = ".ComposeDoneScreen-Wrapper";


    public void checkSuccesSendMail(String delayTime) {
        $(popupHasBeSentWindow).shouldHave(text("Письмо будет отправлено"));
        $(popupHasBeSentWindow).shouldHave(text(delayTime));
        $(popupHasBeSentWindow).shouldHave(text("До тех пор оно будет лежать в папке \"Исходящие\""));
    }
}
