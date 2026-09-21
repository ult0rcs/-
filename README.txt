public class Practice02 {
    public static void main(String[] args) {
        int age = 18;
        double height = 1.78;
        char firstLetter = 'О';
        boolean isStudent = true;

        System.out.println("Задание 1:");
        System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);
        System.out.println();

        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1_200_000;
        long worldPopulation = 8_100_000_000L;

        System.out.println("Задание 2:");
        System.out.println(temperature);
        System.out.println(currentYear);
        System.out.println(cityPopulation);
        System.out.println(worldPopulation);
        System.out.println();

        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;

        System.out.println("Задание 3:");
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println();

        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';

        System.out.println("Задание 4:");
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);
        System.out.println();

        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;

        System.out.println("Задание 5:");
        System.out.println(isJavaFun);
        System.out.println(isFishFly);
        System.out.println(isSkyBlue);
        System.out.println();

        final double GRAVITY = 9.81;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";

        System.out.println("Задание 6:");
        System.out.println(GRAVITY);
        System.out.println(DAYS_IN_WEEK);
        System.out.println(UNIVERSITY_NAME);
        System.out.println();

        int intVal = 250;
        double doubleVal = intVal;

        System.out.println("Задание 7:");
        System.out.println("int: " + intVal);
        System.out.println("double: " + doubleVal);
        System.out.println();

        double priceWithPennies = 49.99;
        int roundedPrice = (int) priceWithPennies;

        System.out.println("Задание 8:");
        System.out.println(roundedPrice);
        System.out.println();

        int firstNumber = 5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean isValidUser = true;

        System.out.println("Задание 9:");
        System.out.println(firstNumber + ", " + userWeight + ", " + userCity + ", " + isValidUser);
        System.out.println();

        String firstName = "Тарас";
        String lastName = "Шевченко";
        int personAge = 47;

        System.out.println("Задание 10:");
        System.out.println("Меня зовут " + firstName + " " + lastName + ", мне " + personAge + " лет.");
        System.out.println();

        int a = 10;
        int b = 20;

        System.out.println("Задание 11:");
        System.out.println("Сумма без скобок: " + a + b);
        System.out.println("Сумма со скобками: " + (a + b));
        System.out.println();

        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        String email = login + "@" + domain;

        System.out.println("Задание 12:");
        System.out.println("Пользователь " + login + " (роль: " + role + ") имеет почту: " + email);
        System.out.println();

        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;

        System.out.println("Задание 13:");
        System.out.println("ЧЕК:\n"
                + "Товар: " + productName + "\n"
                + "Количество: " + quantity + " шт.\n"
                + "Цена: " + pricePerUnit + " грн");
        System.out.println();

        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        double balance = hryvnias + kopecks / 100.0;

        System.out.println("Задание 14:");
        System.out.printf("Текущий баланс: %.2f %s%n", balance, currency);
        System.out.println();

        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;

        System.out.println("Задание 15:");
        System.out.println("Запрос отправлен на: " + protocol + + host + endpoint + "/" + userId);
        System.out.println();

        String language = "Java";
        int level = 1;
        boolean isReady = true;

        System.out.println("Задание 16:");
        System.out.println("Язык: " + language + " | Уровень: " + level
                + " | Готовность к практике: " + isReady);
        System.out.println();

        int number = 19;
        int remainder = number % 2;

        System.out.println("Задание 17:");
        System.out.println("Число 19 при делении на 2 даёт остаток: " + remainder);
        System.out.println();

        int totalSeconds = 385;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Задание 18:");
        System.out.println(totalSeconds + " секунд = " + minutes + " мин " + seconds + " сек");
        System.out.println();

        int n = 47;
        int tens = n / 10;
        int units = n % 10;
        int digitSum = tens + units;

        System.out.println("Задание 19:");
        System.out.println("Число: " + n + ". Десятки: " + tens
                + ", Единицы: " + units + ". Сумма цифр: " + digitSum);
        System.out.println();

        int score = 100;

        score += 50;
        System.out.println("Задание 20:");
        System.out.println("После сложения: " + score);

        score -= 20;
        System.out.println("После вычитания: " + score);

        score *= 2;
        System.out.println("После умножения: " + score);

        score /= 4;
        System.out.println("После деления: " + score);
        System.out.println();

        int counter = 5;

        System.out.println("Задание 21:");
        System.out.println(counter++);
        System.out.println(counter);
        System.out.println();

        counter = 5;

        System.out.println("Задание 22:");
        System.out.println(++counter);
        System.out.println();

        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        double averageGrade = (grade1 + grade2 + grade3) / 3.0;

        System.out.println("Задание 23:");
        System.out.println("Средний балл: " + averageGrade);
        System.out.println();

        double celsius = 25.0;
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Задание 24:");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + " K");
        System.out.println();

        int userAge = 17;
        boolean isAdult = userAge >= 18;

        System.out.println("Задание 25:");
        System.out.println("Возраст: " + userAge + ". Является ли совершеннолетним: " + isAdult);
        System.out.println();

        int x = 15;
        int y = 20;

        System.out.println("Задание 26:");
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println();

        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <= 80);

        System.out.println("Задание 27:");
        System.out.println("Безопасная скорость: " + isSafeSpeed);
        System.out.println();

        personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);

        System.out.println("Задание 28:");
        System.out.println("Возраст: " + personAge + ". Право на бесплатный проезд: " + hasFreePass);
        System.out.println();

        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;

        System.out.println("Задание 29:");
        System.out.println("Дверь заперта: " + isDoorLocked);
        System.out.println("Можно ли войти: " + canEnter);
        System.out.println();

        number = 30;
        boolean isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("Задание 30:");
        System.out.println("Число 30 делится на 3 и на 5: " + isDivisibleByBoth);

        number = 25;
        isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("Число 25 делится на 3 и на 5: " + isDivisibleByBoth);
        System.out.println();

        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;

        System.out.println("Задание 31:");
        System.out.println("Доступ разрешён: " + canLogin);
        System.out.println();

        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("Задание 32:");
        System.out.println("Год " + year + " високосный: " + isLeapYear);
        System.out.println();

        double sideA = 3.0;
        double sideB = 4.0;
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        System.out.println("Задание 33:");
        System.out.println("Катеты: " + sideA + " и " + sideB + ". Гипотенуза: " + hypotenuse);
        System.out.println();

        double radius = 5.0;
        double circumference = 2 * Math.PI * radius;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("Задание 34:");
        System.out.println("Радиус: " + radius);
        System.out.println("Длина окружности: " + circumference);
        System.out.println("Площадь круга: " + circleArea);
        System.out.println();

        double dayTemp = 18.5;
        double nightTemp = -3.2;
        double temperatureDifference = Math.abs(dayTemp - nightTemp);
        double maxTemp = Math.max(dayTemp, nightTemp);
        double minTemp = Math.min(dayTemp, nightTemp);

        System.out.println("Задание 35:");
        System.out.println("Перепад температуры: " + temperatureDifference);
        System.out.println("Максимальная температура: " + maxTemp);
        System.out.println("Минимальная температура: " + minTemp);
        System.out.println();

        double num = 5.67;
        double negNum = -5.67;

        System.out.println("Задание 36:");
        System.out.println("Для 5.67:");
        System.out.println("Math.round: " + Math.round(num));
        System.out.println("Math.ceil: " + Math.ceil(num));
        System.out.println("Math.floor: " + Math.floor(num));
        System.out.println("Для -5.67:");
        System.out.println("Math.round: " + Math.round(negNum));
        System.out.println("Math.ceil: " + Math.ceil(negNum));
        System.out.println("Math.floor: " + Math.floor(negNum));
        System.out.println();

        double coefficientA = 1.0;
        double coefficientB = -7.0;
        double coefficientC = 10.0;
        double d = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
        double root1 = (-coefficientB + Math.sqrt(d)) / (2 * coefficientA);
        double root2 = (-coefficientB - Math.sqrt(d)) / (2 * coefficientA);

        System.out.println("Задание 37:");
        System.out.println("Дискриминант D = " + d);
        System.out.println("Корень x1 = " + root1);
        System.out.println("Корень x2 = " + root2);
        System.out.println();

        int dice = (int) (Math.random() * 6) + 1;

        System.out.println("Задание 38:");
        System.out.println("Выпало на кубике: " + dice);
        System.out.println();

        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;

        System.out.println("Задание 39:");
        System.out.println("Погода на завтра: " + randomTemp + "°C");
        System.out.println();

        double principal = 10_000.0;
        double rate = 12.0;
        int years = 3;
        double finalAmount = principal * Math.pow(1 + rate / 100, years);
        double profit = finalAmount - principal;

        System.out.println("Задание 40:");
        System.out.println("+------------------------------------+");
        System.out.println("|       ДЕПОЗИТНЫЙ КАЛЬКУЛЯТОР       |");
        System.out.println("+------------------------------------+");
        System.out.printf("Начальная сумма: %.2f грн%n", principal);
        System.out.printf("Срок: %d года под %.1f%% годовых%n", years, rate);
        System.out.printf("Итоговая сумма: %.2f грн%n", finalAmount);
        System.out.printf("Чистая прибыль: %.2f грн%n", profit);
        System.out.println("+------------------------------------+");
    }
}