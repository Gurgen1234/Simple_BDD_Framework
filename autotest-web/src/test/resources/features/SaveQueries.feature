#language:ru
@google
Функционал: Сохранение запросов

  Сценарий: Выполнение запроса, сохранение, проверка сохранения

    * открыть url "https://at-sandbox.workbench.lanit.ru"
    * инициализация страницы "Главная страница HelpDesk"
    * кликнуть на элемент "кнопка Log In"

    * инициализация страницы "страница Авторизации"
    * ввести в поле "поле Login" значение "admin"
    * ввести в поле "поле Password" значение "adminat"
    * кликнуть на элемент "кнопка Login"

    * инициализация страницы "страница Tickets"
    * кликнуть на элемент "кнопка Apply"

    * кликнуть на элемент "ссылка Save Query"
    * ввести в поле "поле Query Name" значение "Сохраненный запрос"
    * кликнуть на элемент "чек Shared?"
    * кликнуть на элемент "кнопка Query Save"
    * кликнуть на элемент "кнопка Saved Queries"
    * на странице присутствует текст "Сохраненный запрос"