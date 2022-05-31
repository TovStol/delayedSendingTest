package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pageObject.*;

import static java.lang.Thread.sleep;

public class DelayedSendingTest {
    @BeforeAll
    static void openBrowserLogin() {
        Selenide.open("https://yandex.ru");

    }


    @Test
    void delayedSending() {
        String login = "n.surnametest";    //getSittings.xml
        String password = "!N.surnametest!";
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        PasswordPage passwordPage = new PasswordPage();
        UserSideBarMainPage userSideBarMainPage = new UserSideBarMainPage();
        NewLetterPage writeNewLetterPage = new NewLetterPage();
        InboxPage inboxPage = new InboxPage();


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
        //switchTo().window(1);
        inboxPage
                .smokeCheckPage()
                .clickWriteButton();
       // writeNewLetterPage
              //  .smokeCheckPage()
               // .fillFieldAdr("address")
              //  .fillFieldSubject("subject")
              //  .fillMessage("message");
    }
}
