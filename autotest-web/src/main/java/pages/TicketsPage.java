package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.*;

@Name(value = "страница Tickets")
public class TicketsPage extends WebPage {
    @Name(value = "кнопка Apply")
    private SelenideElement  applyBtn = $("[value=\"Apply Filters\"]");
    @Name(value = "ссылка Save Query")
    private SelenideElement  save = $("[class=\"fas fa-save\"]");
    @Name(value = "поле Query Name")
    private SelenideElement  queryName = $("[id=\"id_title\"]");
    @Name(value = "кнопка Query Save")
    private SelenideElement  querySavebtn = $("[value=\"Save Query\"]");
    @Name(value = "кнопка Saved Queries")
    private SelenideElement  savedQuerisBtn = $("[id=\"ticketsDropdown\"]");
    @Name(value = "чек Shared?")
    private SelenideElement shared = $("[id=\"id_shared\"]");
    @Name(value = "список Saved Queries")
    private SelenideElement savedQueriesList = $("[id=\"id_query_selector\"]");
    @Name(value = "кнопка Attach File")
    private SelenideElement attachFilesBtn = $("[id=\"ShowFileUpload\"]");
    @Name(value = "кнопка Browse")
    private SelenideElement searchBtn = $("[id=\"file0\"]");
    @Name (value = "название файла")
    private SelenideElement selectFile  = $("[id=\"file0\"]");
    @Name(value = "кнопка Up Date")
    private SelenideElement upBtn = $("[class=\"btn btn-primary float-right\"]");
}
