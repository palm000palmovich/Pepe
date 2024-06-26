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

        if (clientOS != 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS != 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        for (int i = 0; i < 2; i++)
            System.out.println("\n");
        System.out.println("Задание 3");

        int year0 = 1584, year = 1984;
        if ((year > year0) && ((((year - year0) % 4 == 0) || ((year - year0) % 4 == 0 && (year - year0) % 100 != 0)) ||
                ((year - year0) % 400 == 0))){
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }

        for (int i = 0; i < 2; i++)
            System.out.println("\n");
        System.out.println("Задание 4");

        int km = 111;
        byte days = 1;

        if (km < 20){
            System.out.println("Потребуется " + days + " день.");
        } else if (km >= 20 && km <= 60){
            System.out.println("Потребуется " + (days+1) + " дня.");
        } else if (km > 60 && km <= 100){
            System.out.println("Потребуется " + (days+2) + " дня.");
        } else if (km > 100){
            System.out.println("На такие большие расстояния не доставляем.");
        }

        }


}