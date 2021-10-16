package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;
import static com.codeborne.selenide.Selenide.$;

@Name("страница Авторизации")
public class LoginPage extends WebPage {
    @Name("поле Login")
    private SelenideElement loginFaild =  $("[name=\"username\"]");
    @Name("поле Password")
    private SelenideElement passwordFaild =  $("[name=\"password\"]");
    @Name("кнопка Login")
    private SelenideElement logInBtn =  $("[value=\"Login\"]");
}
