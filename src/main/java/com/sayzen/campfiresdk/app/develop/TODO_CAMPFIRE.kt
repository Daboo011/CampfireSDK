package com.sayzen.campfiresdk.app.develop

/*

    Возможность сделать мультиязычный пост не мультиязычным
    Возможность модератору сделать мультиязычный пост не мультиязычным





    Баг. Вылеты в крашлитике
    Баг. Если вставить ссылку после символа или переноса то она домается
    Баг. Неработает приближение тапом
    Баг. Белая-цветная: Иконки в меню
    Цитировать гифку как гифку
    % Редактор фото (возможность расширить фон)
    


    $ Создание постов офлайн
    Вики
    -   Шапка
    -   Сообщение что не заполнено на пашем языке
    -   Переключение на английский
    -   Режим редактирования
    -   Создание статьи
    -   Изменение статьи
    -   Изменение заголовочника статьи
    -   Перенос разделов
    -   Возможность жаловаться
    -   Возможность переводить вики
    -   Перекрестные ссылки
    -   Юниты о публикации и редактировании в профиле и фэндоме
    -   Ссылки на разделы
    -   Ссылки на статьи
    -   Поиск
    -   Автоматически парсить текст на сервере на предмет ссылок на вики и добавлять форматирование с названиями (+ обновлять при пересохранении статьи на случай изменения)
    -   Над всеми языками нужна подпись
    -   Возможность востановить из удаленных
    -   Возможность откатить изменения элемента
    -   Возможность откатить изменения статьи


----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            RELEASE
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Было несколько бивт идей и в однйо из них победила фоновая музыка в чатах, я не могу пока этого сделать, по этому беру идею со второго места, созданеи постов офлайн. Другой идеей было добавить мини игру, в случае если нет достпа к серверу, это я сделал :). Исправил кучу багов, постарался не добавить новых.

    Изменения:
    - Добавлена мини игра, если зайти в приложение без доступа к серверу.
    - Размер карточки с заданием стал меньше
    - Изменен стиль окна обновления, оно больше не будет таким ярким.
    - Доработан алгоритм чтения фраз для ленты из ресурсов, протоадминам станет проще их добавлять.
    - Администраторы и модераторы теперь могут банить на 6 месяцев и на год,
    - Добавлнена новая категория растения.
    - Теперь возможно вернуть мультиязычный пост в черновики.
    - Модераторы тепреь могут вернуть мультиязычный пост в черновики.

    Исправления:
    - Пользователи иногда ставили 0 кармы.
    - У полос в опросе были не круглые края.
    - В событиях админов нет принятых фэндомов.
    - Если обновить раздел жалоб, происходит хаус с карточками.
    - Экран уведомлений иногда обновлялся даже если небыло уведомлений.
    - Если пользователь забанен, больше не будет болтатьться карточка отправки сообщения в чате, при попытке его отправить.
    - У слова "ред." на комменте небыло пробела.
    - Хакеры больше не смогут делать мультиязычными чужие посты.
    - Было невозможно оценить стикеры.
    - Исправлена опечатка "you'r".
    - При перемещении поста в другой фэндом, создавалось два события.
    - У пользователя в профиле небыло события что его пост перемещен в другой фэндом.
    - Изгнан ктулху.
    - Не грузило все подписки на фэндомы если их много.
    - Если поменять своё имя, оно не менялось в крытом меню.
    - Если в чате заблокировать несколько сообщений то создавалось несколько карточек с событием.
    - Если выйти с аккаунта он еще 15 минут был в сети.
    - Некорректный комментарий к модерации при блокировке постов через жалобы.
    - Если перейти в форум по уведомлению то небыло скролла. (опять)
    - На событиях в профиле пользователя было некорректное имя админа/модератора.
    - Если на экране чатов нажать назад, то вместовозврата в ленту был выход из приложения.


----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            MAST HAVE IN RELEASE
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    Подготовка к др 7го октября
    Авточистка кеша
    Возможность цитировать аудио сообшения (+ свайп)
    Индикартор что есть новые уведомления при изпользовании драйвера
    Баг. Нельзя скопировать текст в описании профиля
    Баг. При создни поста нельзя копироть текст
    Вики. Список объектов (+ заголовок)
    Вики. Избранное
    Вики. Объект ссылка на вики статью/раздел
    Вики. Возможность переключится на сетку
    Отображать пользователя что было заблокированно. Хоть как-то!!!
    При примечании к пользователю выбирать цвет для обводки аватара. Долгий тап по аватару показывает примечание.
    При блокировке стикера в профилях должно появлятсья событие и должно приходить уведомление
    При блокировке набора стикеров в профилях должно появлятсья событие и должно приходить уведомление
    При игноре - игнорить посты, сообщения
    При игноре - игнорить упоминаяния
    Настройка - ставить оценку ананимно
    Программная потдержка эстафет
    Админы. Возожноть протоадмину посмотреть заблокированные публикации пользователя
    Система хештегов. Тренды. Поиск по хештегу.
    Баг. В модераторском событии о изменении тегов поста, нет информации о тегах
    Баг. Если открыть сообщение по уведомлению на счетчике оно не пропадает
    Баг. Не пропадают чаты при удалении фэндома
    Баг. Иногда в блокировках отображается пустой пост
    Баг. Подвисает лента если в ней большой текст
    Баг. Уехала таблца 292845
    Картинки
        -   Пустой вики список
        -   Пустой вики статья
        -   Пустой список стикеров
        -   Пустой пакет стикеров
        -   Уровни 10-20
    Контроль работы сервера, медиа сервера, пушей
        -   Каждые 30 минут пытаться связаться с сервером, если не полчится выводить алерт
        -   Каждые 30 минут присылать пуши протоадмину в подпотоке, если пуша небыло 1 час выводить алерт в телефоне.
        -   При кадом пуше пытаться загрузить картинку, если не полчится выводить алерт



----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------
            BACK LOG
----------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------

    HTTP - https://habr.com/ru/post/69136/
    Оптимизировать EUnitsBlockGetAll
    Возможность выбрать стартовый экран лента/чаты/фэндом
    Блокнот
    Возожность просмотривать фэндомы сеткой.

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
    Скрывать навигацию при полном экране
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
