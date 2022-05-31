package pageObject;

import static com.codeborne.selenide.Selenide.$;

public class OutMailFolderPage {
    public void checkOutMail(){
        $("[data-title='Исходящие'][href='#outbox']").click();
    }

}
