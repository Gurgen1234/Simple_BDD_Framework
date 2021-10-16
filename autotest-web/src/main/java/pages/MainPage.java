package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$;
@Name(value = "Главная страница HelpDesk")
public class MainPage extends WebPage {
    @Name(value = "кнопка New Ticket")
    private SelenideElement newTicket = $("[id=\"tickets/submit/\"]");
    @Name(value = "кнопка Log In")
    private SelenideElement logIn = $("[id=\"userDropdown\"]");
}
