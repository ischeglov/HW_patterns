package ru.netology.delivery.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int shift, String pattern) {
        // TODO: добавляем логику для объявления переменной date и задания её значения, для генерации строки с
        //  датой используем класс LocalDate и его методы для получения и форматирования даты
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String generateCity(String locale) {
        // TODO: добавляем логику для объявления переменной city и задания её значения, генерацию выполняем
        //  используя массив валидных городов и класс Random
        String[] cities = {"Абакан", "Анадырь", "Архангельск", "Астрахань", "Барнаул", "Белгород",
                "Биробиджан", "Благовещенск", "Брянск", "Великий Новгород", "Владивосток", "Владикавказ",
                "Владимир", "Волгоград", "Вологда", "Воронеж", "Горно-Алтайск", "Грозный", "Донецк",
                "Екатеринбург", "Иваново", "Ижевск", "Иркутск", "Йошкар-Ола", "Казань", "Калининград",
                "Калуга", "Кемерово", "Киров", "Кострома", "Краснодар", "Красноярск", "Курган",
                "Курск", "Кызыл", "Липецк", "Луганск", "Магадан", "Магас", "Майкоп", "Махачкала",
                "Мелитополь", "Москва", "Москва", "Мурманск", "Нальчик", "Нарьян-Мар", "Нижний Новгород",
                "Новосибирск", "Омск", "Оренбург", "Орёл", "Пенза", "Пермь", "Петрозаводск", "Петропавловск-Камчатский",
                "Псков", "Ростов-на-Дону", "Рязань", "Салехард", "Самара", "Санкт-Петербург", "Санкт-Петербург",
                "Саранск", "Саратов", "Севастополь", "Симферополь", "Смоленск", "Ставрополь", "Сыктывкар",
                "Тамбов", "Тверь", "Томск", "Тула", "Тюмень", "Улан-Удэ", "Ульяновск", "Уфа", "Хабаровск",
                "Ханты-Мансийск", "Херсон", "Чебоксары", "Челябинск", "Черкесск", "Чита", "Элиста",
                "Южно-Сахалинск", "Якутск", "Ярославль"};
        Random random = new Random();
        String city = cities[random.nextInt(cities.length)];
        return city;
    }

    public static String generateName(String locale) {
        // TODO: добавляем логику для объявления переменной name и задания её значения, для генерации
        //  используем Faker
        Faker faker = new Faker(new Locale(locale));
        return faker.name().fullName();
    }

    public static String generatePhone(String locale) {
        // TODO: добавдяем логику для объявления переменной phone и задания её значения, для генерации
        //  используем Faker
        Faker faker = new Faker(new Locale(locale));
        return faker.phoneNumber().phoneNumber();
    }
}
