package com.sayzen.campfiresdk.app.develop

/*

    Баг. Если отредактировать вики на русском, потом на английском то русская пропадает
    Баг. При отвнре ссылки ломаются
    Баг. Не могут зарегаться люди
    Баг. Очистить
    Фантомное сообщение Brut



    Сделать фильтр на карму по умолчанию включенным
    Ананимные оценки
    У пользователя задание заработать 2 кармы на комменте
    ? Показывать кол-во символов которое напечатал пользователь?
    Баг. В подписках и бездне разные результаты голосования в одно и тоже время
    ? Уменьшить количество анимаций
    Уведомления о реакции
    Сделать смайлы картинками


    Рубрики

    Примечания
            -   Выбор цвета
            -   Долгий тап на аватар
            -   Отображение увета на аватаре
            -   Возможность добавить примечанеи долгим тапом на аватар

    Campfire Hello
            -   Экран обучения
            -   Возврат к обучению
            -   Вынести ПК на экран правил
            -   Медленно появляются варианты ответа
            -   Публикация в Campfire Hello
            -   Перенести выбор категорий в Hello
            -   Баг. В диалоге выбора даты нельзя скролить год
            -   ! Можно нажать на back
            -   ! Подскакивает экран при переходе (вставляется новый элемент, который шире старого)

    Баг. Очень часто сообщение которое установлено как последнее в чате - удалено

----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            RELEASE
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    - При закрытии диалогов не скрывалась клавиатура.

----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            BACK LOG
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------


    Информативность при удалении
        - Причина удаления фэндома
        - Причина удаления поста
        - Причина удаления фрума

    Программная потдержка рубрик
        -   Повышение/Понижение коофа кармы
        -   Возможность подписаться
        -   Раздел рубрик в фэндоме
        -   Возможность модератору создать
        -   Возможность поменять ведущего

    Модернизировать систему блокировок
    Не информативное уведомление о блокировке
    При блокировке стикера в профилях должно появлятсья событие и должно приходить уведомление
    В блокировках отображать наказание и заблокированы ли последнии

    HTTP - https://habr.com/ru/post/69136/
    Категория: Места
    Отображать фэндом при поиске по тегам
    % Редактор фото (возможность расширить фон)
    % Редактор фото (возможность рисовать)
    Возможность цитировать аудио сообшения (+ свайп)
    Индикартор что есть новые уведомления при изпользовании драйвера
    Отображать пользователя что было заблокированно. Хоть как-то!!!
    При игноре - игнорить посты, сообщения
    При игноре - игнорить упоминаяния
    Настройка - ставить оценку ананимно
    Программная потдержка эстафет
    Система хештегов. Тренды. Поиск по хештегу.

    Баг. Если один раз не удалось загрузить картинку, эту картинку не загрузин никогда
    Баг. Иногда реклама отображается в самом начале ленты (а может и фича, кто знает)
    Баг. ? Сломается завершение квеста по уведомлению!
    Баг. Если проскроллить к коментам и назад к посту то нельзя скопировать текст
    Баг. Иногда появляется навигациия при откратии диалогов в полноэкранном режиме
    Баг. При открытии диалога меняется цвет навигации
    Баг. При переходе к большому списку комментов через уведомления, не находит коммент
    Баг. Нет анимации клика на заоловке фэндома в посте
    Баг. Нельзя скопировать текст в описании профиля
    Баг. При создни поста нельзя копироть текст
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
            BACK LOG (LOW)
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

        Возможность ставить эмоции на комменты
            -   ? Категории
            -   ? Недавнии
            -   ? На сообщения

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

    Project created 10 apr 2016




 */
