Todo Manager — мини-система управления задачами на Spring Boot

Добро пожаловать в мой пет-проект **Todo Manager** — простое, но мощное REST API-приложение для управления задачами. Это учебный проект, созданный с целью изучения **Spring Boot**, **REST**, **JPA** и взаимодействия с базой данных.

---

Что умеет приложение

- Получать список всех задач
- Получать задачу по ID
- Добавлять новую задачу
- Обновлять существующую
- Удалять задачу
- 
Технологии и инструменты

| Инструмент       | Назначение                         |
|------------------|------------------------------------|
| Java 24          | Язык программирования              |
| Spring Boot      | Основной фреймворк                 |
| Spring Web       | Создание REST-контроллеров         |
| Spring Data JPA  | Работа с базой данных              |
| PostgreSQL       | Реляционная база данных            |
| Lombok           | Автогенерация геттеров/сеттеров    |
| Postman          | Тестирование REST-запросов         |
| Maven            | Сборка проекта                     |

---

Архитектура проекта

 Controller  
Обрабатывает HTTP-запросы от клиента (например, через Postman)

 Service  
Логика обработки задач — получение, обновление, удаление и т.д.

 Repository  
Интерфейс для работы с базой данных с помощью JPA

 Model (Entity)  
Сущность `Task`, которая хранит:
- `id`: уникальный идентификатор
- `title`: текст задачи
- `completed`: вероятность выполнения

Разработчик: @Askarov Adilet
Связь: tg:@Adeke07 / gmail: adilet.askarov.2xxx@gmail.com / LinkedIn:Adilet Askarov 



На изображениях вы можете увидеть процесс работы:

<img width="1280" alt="Screenshot_21" src="https://github.com/user-attachments/assets/94caa4ab-3ce6-49a7-a5dc-2b3a6f45007b" />
<img width="1280" alt="Screenshot_22" src="https://github.com/user-attachments/assets/ad62ddaf-473f-4828-8eac-d34385d5f615" />
<img width="1280" alt="Screenshot_23" src="https://github.com/user-attachments/assets/832df57d-4d48-4d48-aee7-4e467218934c" />
<img width="996" alt="Screenshot_24" src="https://github.com/user-attachments/assets/f0b56a75-2d01-482d-be95-56182a7521bd" />
<img width="1012" alt="Screenshot_26" src="https://github.com/user-attachments/assets/67817c7e-8116-4f72-b7fa-9d9ef2fd05bf" />
<img width="986" alt="Screenshot_25" src="https://github.com/user-attachments/assets/71dea241-3fd4-4bfd-8711-00897abd8d07" />


