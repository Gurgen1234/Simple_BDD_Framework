#language:ru
@test

Функционал: Тестирование сервиса HelpDesk
  - Создание нового тикета POST запросом с телом из json файла, значения которого заполняем сгенерированным значениями

  Сценарий: Создание тикета
    * сгенерировать переменные
      | title           | ПроверочныйDDDDDDD       |
      | created         | 2021-10-15T11:27:48.467Z |
      | modified        | 2021-10-15T11:27:48.467Z |
      | submitter_email | EEEE@example.com         |
      | status          | 1                        |
      | on_hold         | true                     |
      | description     | Кек                      |
      | resolution      | Пока                     |
      | priority        | 2                        |
      | due_date        | 2021-10-15T11:27:48.467Z |
      | secret_key      | Привет                   |
      | queue           | 2                        |
      | assigned_to     |                          |
      | kbitem          |                          |
    * создать запрос
      | method | path         | body              |
      | POST   | api/tickets/ | createTicket.json |
    * добавить header
      | Content-Type  | application/json |
    * отправить запрос
    * статус код 201