#language:ru
@google
Функционал: Поиск гугл

  Сценарий: Открытие страницы google.com, ввод значения в поиск

    * открыть url "https://www.google.ru/"
    * инициализация страницы "Google"
    * ввести в поле "поле поиска" значение "Погода в Москве"

    * на странице отсутствует текст "погода в ижевске"

    * на странице имеется элемент "кнопка поиска"
    * кликнуть на элемент "кнопка поиска"
    * переход на страницу "Google страница результатов"
    * на странице имеется элемент "виджет погоды"