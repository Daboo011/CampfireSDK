package com.sayzen.campfiresdk.app.develop

/*


    !!! Оображать нормальный диалог с просьбой удалить/добавить стикерпак в колеекцию
    !!! Возможность посмотреть фоворитные стикеры другого пользователя
    Виджет загрузки на диалог стикеров
    Обработка ошибки на диалог стикеров
    Уменьшить картинку в карточке что добавил новый стикер
    Баг. Дублируются посты на экарен кармы пользователя
    В админской не понятно в каком фэндоме изменен коф. кармы





    Закрытые посты

    Баг. Если проскроллить к коментам и назад к посту то нельзя скопировать текст

    На модераторском дейтии писать почему отклонено
    Кнопка для добавления ссылок
    Уведомление о выполненном задании + текст задания (есть уведомление о достижении)



    ? Если стоит не беспокоить, то просто не воспроизводить звук и вибрацию

----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            RELEASE
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------


    !!! Убрать STD, поставить Campfire Team
    !!! Миграция

    Campfire 0.86 Beta
    Лента разделена на два экрана, в первом будут отображаться подписки во втором все подряд. Вместо кодов языков, теперь отображаются флаги. Добавлена новая информация в профиль пользователя. История публикации.

    Изменения:
    - Уменьшено качество стикеров. Оно было слишком большим и сильно влияло на производительность.
    - Теперь протоадмины могут посмотреть все заблокированные публикации конкретного пользователя.
    - Теперь модераторы могут переносить стаатью в вики на разные языки.
    - Теперь при попытке редактировать статью вики на не родном языке - будет предупреждение.
    - На экране статьи вики теперь отображается язык с возможность переключить его.
    - Теперь при нажатии удалить/перезаписать при создании голосового сообщения оно будет отсанавливаться если проигрывалось.
    - При блокировке публикации будет событие в профиле пользователя.
    - При блокировке набора стикеров в профиле будет появлятсья событие.
    - Стикеры и черный список перехали в профиль. Теперь можно смотреть эти экраны у других пользователей.
    - В профиль пользователя добавлены фэндомы на которые он подписан.
    - Ограничен уровень с которого можно создавать стикеры.
    - Теперь в истории оценок отображается дата когда оценка была поставлена.
    - Протоадмины теперь могут назначать других протоадминов.
    - Цитаты в сообщениях и комментариях тепреь максимум 300 символов.
    - В фэндоме теперь отображается количество элементов в вики.
    - Теперь можно ответить стикером на сообщения и комментарии.
    - На постах, сообщениях и комментариях теперь можно посмотреть историю событий и изменений.
    - При скролле на экране фэндомов больше не будет пропадать поиск и тулбар.
    - Теперь можно нажать на название фэндома на посте.
    - Протоадмины теперь могут вотсанавливать публикации из глубокой блокировки.
    - Ленат разделаена на подписки и все подряд.
    - В полном экарне будут скрываться кнопки навигации.
    - Коды языков заменены на флаги.
    - Теперь можно открыть свою фоновою картинку долгим нажатием.
    - Оптимизирована карточка с постом. Лента должна меньше подлагивать.
    - В истории оценок поста теперь отображается коофицент кармы. Надеюсь теперь мне перестанут стучать в дверь посреди ночи с вопрсом почему лолон поставил 24 кармы.
    - Карточка с коофицентом кармы фэндома вынесена из под спойлера.
    - Теперь если в фэндоме повышен коофицент кармы, это бедет видно на постах в ленте.
    - Оптимизировал черный список фэндомов. Ничего не изменится, просто добавил в список изменений, не зря же делал.
    - Ускорена загрузка стикеров в виджете для их отправки.

    Исправления:
    - В историю вики записывались некорректные коды ошибок.
    - Вечная загрузка если стикерпак удалён.
    - В профиле модераторов отображалось сообщение чата, о том что заблокирвоан пользователь.
    - Пользователь мог увидеть что он офлайн.
    - Одновременно могло проигрываться несколько голосовых сообщений.
    - Нельзя было поставить на паузу своё голосовое сообщение
    - При проигрывании голосового сообщение время могло стать отрицательным.
    - Голосовое сообщение проигрывалось бесконечно.
    - При проигрывании голосового сообщения не отображася прогресс.
    - В заголовке раздела вики всегда было английское название.
    - Пользователи могли видеть кнопки модерации вики.
    - Заказана пицца.
    - В ленте настроеной на все публикации, не отображались посты из закрытых фэндомов на которые подписан.
    - Опечатка "летнию".
    - Не удалялись статьи и разделы в вики.
    - Опечатка "В получили".
    - На эмуляторах не отображались изображения (Возможно исправлено, неначём проверить).
    - При блокировке стерпака отображается кнопка заблокирвоать во всем приложении.
    - У некоторых пользователей была пустая лента.
    - На экране предложеных фэндомов можно было нажать на аватар фэндома.
    - В модераторском событии об изменении тегов были некорректные новые теги.
    - Иногда в модераторском событии об изменении тегов  не отображались тэги.
    - При нажатии на свой аватар в профиле открывался экарн просмотра картинки.
    - Дублировались разделы в вики.
    - Сбрасывался счет в миниигре.
    - Иногда отображалась некорректная кратинка в чате.
    - Иногда при переходе на какой-то экран мог произойти вылет в ленту
    - Если цититюровать очень большое сообщение, оно скрывало поое вывода.
    - Если не подписан не на один фэндом, то их не видно в поиске.
    - После того как сделал мультиязычным нельзя было сразу сделать не мультиязычным.
    - В чате иногда дублировались сообщения.
    - Иногда пропадало скруление у картинок в комментариях.
    - В черном списке отображались заблокированные фэндомы.


----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            MAST HAVE IN RELEASE
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Модернизировать систему блокировок
    Не информативное уведомление о блокировке
    При блокировке стикера в профилях должно появлятсья событие и должно приходить уведомление
    В блокировках отображать наказание и заблокированы ли последнии

    HTTP - https://habr.com/ru/post/69136/
    Категория: Места
    Отображать фэндом при поиске по тегам
    % Редактор фото (возможность расширить фон)
    % Редактор фото (возможность рисовать)
    Подготовка к др 7го октября
    Возможность цитировать аудио сообшения (+ свайп)
    Индикартор что есть новые уведомления при изпользовании драйвера
    Отображать пользователя что было заблокированно. Хоть как-то!!!
    При примечании к пользователю выбирать цвет для обводки аватара. Долгий тап по аватару показывает примечание.
    При игноре - игнорить посты, сообщения
    При игноре - игнорить упоминаяния
    Настройка - ставить оценку ананимно
    Программная потдержка эстафет
    Система хештегов. Тренды. Поиск по хештегу.

    Баг. Иногда появляется навигациия при откратии диалогов в полноэкранном режиме
    Баг. При открытии диалога меняется цвет навигации
    Баг. При переходе к большому списку комментов через уведомления, не находит коммент
    Баг. Нет анимации клика на заоловке фэндома в посте
    Баг. Нельзя скопировать текст в описании профиля
    Баг. При создни поста нельзя копироть текст
    Баг. Неработает приближение тапом
    Баг. Белая-цветная: Иконки в меню
    Баг. Если открыть сообщение по уведомлению на счетчике оно не пропадает
    Баг. Не пропадают чаты при удалении фэндома
    Баг. Иногда в блокировках отображается пустой пост
    Баг. Подвисает лента если в ней большой текст

    Вики
        -   Список объектов (+ заголовок)
        -   Избранное
        -   Объект ссылка на вики статью/раздел
        -   Возможность переключится на сетку
        -   Возможность востановить из удаленных
        -   Возможность откатить изменения элемента
        -   Возможность откатить изменения статьи
        -   Перенос разделов
        -   Возможность жаловаться
        -   Возможность переводить вики
        -   Перекрестные ссылки
        -   Юниты о публикации и редактировании в профиле и фэндоме
        -   Поиск
        -   Автоматически парсить текст на сервере на предмет ссылок на вики и добавлять форматирование с названиями (+ обновлять при пересохранении статьи на случай изменения)
        -   Над всеми языками нужна подпись
        -   ? Есл удалить кратинку, то она пропадет во всех ревизиях
        -   Сообщение что не заполнено на вашем языке
        -   Переключение на английский

    Контроль работы сервера, медиа сервера, пушей
        -   Каждые 30 минут пытаться связаться с сервером, если не полчится выводить алерт
        -   Каждые 30 минут присылать пуши протоадмину в подпотоке, если пуша небыло 1 час выводить алерт в телефоне.
        -   При кадом пуше пытаться загрузить картинку, если не полчится выводить алерт

    Картинки
        -   Пустой вики список
        -   Пустой вики статья
        -   Уровни 10-15
        -   Картинка с флажками на фон профиля



----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            BACK LOG
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Гибридные ЕЗ
    Оптимизировать EUnitsBlockGetAll
    Возможность выбрать стартовый экран лента/чаты/фэндом
    Блокнот
    Возожность просмотривать фэндомы сеткой.
    Возможность рассмотреть стикер
    Реакция на комменты

    Баг. При удалении старницы, не чистятся ресурсы
    Полезные публикации
    Фэндом. Календарь с событиями
    Возможность закреплять форумы
    Войс. Линия не отражает реальный звук
    Войс. Если поднести к уху - менять динамик (Если уубрать от уха - пауза) (Код написан, но не работает)
    Возможность пометить пост как фейк или сомнительный (отображать комментарий) + событие
    Возможность отключить загрузку гифок в настройках - Если у пользователя отключена загрузка гифок, нужно как-то давать ему возможность её загрузить кликом (+вес?)
    Разделть ленту на экраны (подписки/лучшее/хорошее/бездна)  -   В фильтрах возможность отключить или перемстить экран подписок
    Посты. Музыка
    Посты. Страница Тест
    Посты. Страница Викторины
    Чат. Конфиренции (публичность)(управление людьми)
    Чат. Звонки
    Фэндом. Расширеннй поиск, с отображание скринштов
    Кнопка прачитано в шторке для сообщений
    Возможность подтвердить модерацию на экране её просмотра
    Отображать до 5 сообщений в уведомлениях
    Добавить пояснения к правилам (картинки)
    Возможность передать черновики. (+ защита от спама (через чс?)) (+ возможность отключить)
    Админы. Возможность жаловаться на админа/модератора
    Админы. Экран жалоб на админов/модераторов
    Админы. Экран c админскими банами и комментариями
    Опрос. Опрос с нескольими вариантами
    Опрос. посмотреть результаты голосования без голосования (опционально)
    Опрос. Возможность посмотреть кто голосовал в опросах (открытый / закрытый опрос)
    Опрос. Опрос с картинками
    Улучшить защиту ресурсов
    Оптимизация. Сервер на час виснит ночью изза обновления кармы
    Оптимизация. Кещирование страниц статьи
    Посты. Переводы статей
    Почты. Репост статей с других сообществ
    Посты. Страница Твит
    Посты. Страница Куб
    Посты. Возможность делится файлами
    Чат. Ограничение ЛС (только те на кого подписан)
    Чат. Возможность отвечать на сообщеняи в уведомлении
    Чат. Возможность отключить уведомленяи от конкретного пользователя (на время / навсегда)
    Фэндом. Возможность посмотреть подписчиков и их уровень подписки в фэндоме
    Фэндом. Поиск групп
    Фэндом. WebView с wiki
    Фэндом. Кастомизация фэндомов цветом
    Фэндом. Подписка на теги
    Профиль. Функция вайп аккаунта - удлить ВСЁ связанное с аккаунтом, кроме id и GoogleId
    Возможность в течении короткого времени поменять оценку
    Возможность призвать админа/модератора (@Admin @Moderator)
    Ссылки на фендом по названию (Как быть с языком? Что если в названии есть _)
    Помечать топовых пользователей
    Голосовой чат в обычных чатах


    Полезные посты
        -   отображать в профиле
        -   отображать в фендоме
        -   достижения

    Баг. Комментарий создается с лишней анимацией
    Баг. При расширении поста мерцает картинка
    Баг. Дергается экран если открывать спойлер в ленте
    Баг. При клике по уведомлению не всегда открывается пост
    Баг. Очень часто при переходе из уведомлений/ачивок в ленту зависает приложение
    Баг. Если из черновика перейти в чат, потом вернуться, клавиатура не открывается
    Баг. У некоторых пользователей время в приложении на час отличается от реального

----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            Dream
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Страница - генератор рандома. Задаешь срок. И в это время она генерирует случайное число / выбирает случайного пользователя / комментарий / текст

    Гильдии
        -   Кнопки: Чат, Участники, Теги, Форумы, Фэндомы
        -   Описание
        -   Картинки
        -   Ссыли
        -   Посты
        -   Система заявок
        -   Система званий/привелегий
        -   Система меток (консты)
        -   Система контроля. (таблицы / налоги)

    Переводы песен + приложение
    Секретные ачивки
    Холивары
    Инвентарь / валюта
    Совместное создание статьи
    Потдержка (пользовательская (тикеты?))
    Оптимизация экранов под планшеты
    Вселенные
    Система званий
    Система коммитетов

----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            INFO
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Project created 7 oct 2015




 */
