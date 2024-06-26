//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte clientOS = 1;
        if (clientOS != 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        for (int i = 0; i < 2; i++)
            System.out.println("\n");
        System.out.println("Задание 2");

        int clientDeviceYear = 2014;

        if (clientOS == 0){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else{
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else{
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        for (int i = 0; i < 2; i++)
            System.out.println("\n");
        System.out.println("Задание 3");

        int year = 2018;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

        for (int i = 0; i < 2; i++)
            System.out.println("\n");
        System.out.println("Задание 4");

        int km = 95;
        byte days = 1;

        if (km < 20){
            System.out.println("Потребуется " + days + " день.");
        } else if (km >= 20 && km <= 60){
            System.out.println("Потребуется " + (days+1) + " дня.");
        } else if (km > 60 && km <= 100){   //тут в интервал входит расстояние в 100 км, значит это значение учитывается
            System.out.println("Потребуется " + (days+2) + " дня.");
        } else if (km > 100){ //тут указано, что будет, если расстояние будет больше 100 км
            System.out.println("На такие большие расстояния не доставляем.");
        }


        for (int i = 0; i < 2; i++)
            System.out.println("\n");
        System.out.println("Задание 5");
        int monthNumber = 13;
        if (monthNumber > 12 || monthNumber < 1){
            System.out.println("Такого месяца нет!");
        } else if (monthNumber <= 12 && monthNumber >= 1) {
            switch (monthNumber) {
                case 1:
                    System.out.println(monthNumber + " - это " + "Январь");
                    break;
                case 2:
                    System.out.println(monthNumber + " - это " + "Февраль");
                    break;
                case 3:
                    System.out.println(monthNumber + " - это " + "Март");
                    break;
                case 4:
                    System.out.println(monthNumber + " - это " + "Апрель");
                    break;
                case 5:
                    System.out.println(monthNumber + " - это " + "Май");
                    break;
                case 6:
                    System.out.println(monthNumber + " - это " + "Июнь");
                    break;
                case 7:
                    System.out.println(monthNumber + " - это " + "Июль");
                    break;
                case 8:
                    System.out.println(monthNumber + " - это " + "Август");
                    break;
                case 9:
                    System.out.println(monthNumber + " - это " + "Сентябрь");
                    break;
                case 10:
                    System.out.println(monthNumber + " - это " + "Октябрь");
                    break;
                case 11:
                    System.out.println(monthNumber + " - это " + "Ноябрь");
                    break;
                case 12:
                    System.out.println(monthNumber + " - это " + "Декабрь");
                    break;
            }
        }
    }


}