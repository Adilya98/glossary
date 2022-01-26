package com.example.services;

import com.example.models.GlossaryModel;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class GlossaryService {
    private final List<GlossaryModel> listOfModels = new ArrayList<>();


    @PostConstruct
    void setUp() {
        GlossaryModel android = new GlossaryModel("Android",
                "Мобильная ОС на основе Linux от Google и Open Handest Alliance. Система свободно распространяется и используется на различных мобильных устройствах.");
        GlossaryModel androidStudio = new GlossaryModel("Android Studio",
                "Это современная среда программирования, созданная для тестирования и разработки приложений для ПК под ОС Android. При разработке оболочки были внедрены необходимые инструменты для комфортного, качественного и быстрого создания новых и отладки существующих приложений.");

        GlossaryModel api = new GlossaryModel("API (Application Programming Interface)",
                "Интерфейс программирования мобильных приложений. Готовый код, который упрощает написание приложений.");

        GlossaryModel dart = new GlossaryModel("Dart",
                "Язык программирования общего назначения от компании Google, который предназначен прежде всего для разработки веб-приложений (как на стороне клиента, так и на стороне сервера) и мобильных приложений.");

        GlossaryModel flutter = new GlossaryModel("Flutter",
                "Это разработанный Google фреймворк с открытым программным кодом, который позволяет просто и быстро создавать мобильные приложения для iOS и Android.");

        GlossaryModel layout = new GlossaryModel("Layout",
                "В контексте программирования Android это слово обозначает планировку экрана приложения и конфигурацию визуальных элементов, из которых приложение состоит.");

        GlossaryModel market = new GlossaryModel("Market (Google Play market, маркет, рынок)",
                "Официальный магазин приложений для android OS от Google. Доступ к магазину через телефон осуществляется через одноимённое приложение Play Маркет - каталог приложений разделённый по тематикам.");

        GlossaryModel sdk = new GlossaryModel("SDK –  (Software Development Kit)",
                "(Здесь для Android), пакет программного обеспечения для поддержки разработки ПО.");

        GlossaryModel ui = new GlossaryModel("UI (User Interface)",
                "Интерфейс пользователя. Под этим обычно понимается внешний вид экрана приложения (программы) Android и алгоритм взаимодействия приложения с пользователем.");

        GlossaryModel widget = new GlossaryModel("Виджет",
                "Это объект, который служит интерфейсом для взаимодействия с пользователем. Иначе, виджеты – это обычные элементы управления: кнопки, текстовые поля, флажки, переключатели, списки.");

        GlossaryModel interfaceModel = new GlossaryModel("Интерфейс",
                "Граница между двумя функциональными объектами, требования к которой определяются стандартом, совокупность средств, методов и правил взаимодействия (управления, контроля и т. д.) между элементами системы.");

        GlossaryModel container = new GlossaryModel("Контейнер в программировании",
                "Тип, позволяющий инкапсулировать в себе объекты других типов.");

        GlossaryModel mobileApp = new GlossaryModel("Мобильное приложение",
                "Программное обеспечение, предназначенное для работы на смартфонах, планшетах и других мобильных устройствах, разработанное для конкретной платформы (iOS, Android, Windows Phone и т. д.).");

        GlossaryModel modeling = new GlossaryModel("Моделирование",
                "Это метод научного познания, основанный на изучении объектов посредством их моделей.");

        GlossaryModel modelingApp = new GlossaryModel("Проектирование приложения",
                "Это процесс переноса  идеи в техническое задание, по которому будет проводится разработка и создание приложения.");

        GlossaryModel framework = new GlossaryModel("Фреймворк",
                "Заготовка, готовая модель в IT для быстрой разработки, на основе которой можно дописать собственный код.");

        GlossaryModel onlineEdu = new GlossaryModel("Электронное обучение",
                "Это система обучения при помощи информационных и электронных технологий.");

        GlossaryModel androidEmulator = new GlossaryModel("Эмулятор Android",
                "Это программа, которая по сути копирует (эмулирует) функции и возможности одной системы в другой. Эмулятор андроид эмулирует операционную систему, предназначенную для мобильных платформ Android в операционной системе предназначенной для настольных компьютеров (windows).");

        listOfModels.add(android);
        listOfModels.add(androidStudio);
        listOfModels.add(api);
        listOfModels.add(dart);
        listOfModels.add(flutter);
        listOfModels.add(layout);
        listOfModels.add(market);
        listOfModels.add(sdk);
        listOfModels.add(ui);
        listOfModels.add(widget);
        listOfModels.add(interfaceModel);
        listOfModels.add(container);
        listOfModels.add(mobileApp);
        listOfModels.add(modeling);
        listOfModels.add(modelingApp);
        listOfModels.add(framework);
        listOfModels.add(onlineEdu);
        listOfModels.add(androidEmulator);
    }

    public List<GlossaryModel> getModels() {
        return listOfModels;
    }
}
