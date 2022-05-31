package pageObject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SuccessfulSendingWindowPage {
    static String popupHasBeSentWindow = ".ComposeDoneScreen-Wrapper";


   public void succesSendWin(){
        $(popupHasBeSentWindow).shouldHave(text("Письмо будет отправлено"));
        $(popupHasBeSentWindow).shouldHave(text(NewLetterPage.SetTime));
        $(popupHasBeSentWindow).shouldHave(text("До тех пор оно будет лежать в папке \"Исходящие\""));
    }
}
