public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1(){
        System.out.println("Задание 1");
        char clientOS = 1;
        switch (clientOS){
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Купите нормальный телефон");
        }
    }

    public static void task2(){
        System.out.println("Задание 2");
        char clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015){
            switch (clientOS){
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("К сожалению, этот телефон не поддерживается");
            }
        }else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                default:
                    System.out.println("К сожалению, этот телефон не поддерживается");
            }
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0){
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int delivryPeriod = 1;
        if (deliveryDistance <=20){
            System.out.println("Потребуется дней: " + delivryPeriod);
        }else if (deliveryDistance >20 && deliveryDistance < 60){
            delivryPeriod += 1;
            System.out.println("Потребуется дней: " + delivryPeriod);
        } else if (deliveryDistance >=60 && deliveryDistance <=100) {
            delivryPeriod += 2;
            System.out.println("Потребуется дней: " + delivryPeriod);
        }else if (deliveryDistance>100){
            System.out.println("Доставки нет");
        }
    }
    public static void task5(){
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует. Введите число от 1 до 12");
        }
    }
}