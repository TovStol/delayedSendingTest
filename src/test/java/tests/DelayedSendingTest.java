package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pageObject.*;

import static com.codeborne.selenide.Selenide.switchTo;

public class DelayedSendingTest {
    @BeforeAll
    static void openBrowserLogin() {
        Selenide.open("https://yandex.ru");

    }

    @Test
    void delayedSending() {
        String login = "n.surnametest";
        String password = "!N.surnametest!";
        String address = "n.surnametest2@yandex.ru";
        String subject = "Тестовое письмо";
        String textLetter = "В чужбине свято наблюдаю\n" +
                "Родной обычай старины:\n" +
                "На волю птичку выпускаю\n" +
                "При светлом празднике весны.\n" +
                "Я стал доступен утешенью;\n" +
                "За что на бога мне роптать,\n" +
                "Когда хоть одному творенью\n" +
                "Я мог свободу даровать!\n";
        String delayTime = "23:30";
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        PasswordPage passwordPage = new PasswordPage();
        UserSideBarMainPage userSideBarMainPage = new UserSideBarMainPage();
        InboxPage inboxPage = new InboxPage();
        NewLetterPage newLetterPage = new NewLetterPage();

        mainPage
                .smokeCheckPage()
                .clickEnterButton();
        loginPage
                .smokeCheckPage()
                .mailLoginMode()
                .inputLogin(login);
        passwordPage
                .smokeCheckPage()
                .inputPassword(password);
        userSideBarMainPage
                .smokeCheckPage()
                .clickMailButton();
        switchTo().window(1);
        inboxPage
                .smokeCheckPage()
                .clickWriteButton();
        newLetterPage
                .smokeCheckPage()
                .fillFieldAdr(address)
                .fillFieldSubject(subject)
                .fillMessage(textLetter)
                .clickDelayedSendButton()
                    .smokeCheckPage()
                    .clickDateTimeSelectButton()
                        .smokeCheckPage()
                        .setDateTime(delayTime)
                        .clickDateTimeSaveButton()
                .checkDelayedTime(delayTime)
                .clickSendEmailButton();
        new SuccessfulSendingWindowPage().checkSuccesSendMail(delayTime);
    }
}
