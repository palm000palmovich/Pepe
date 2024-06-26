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


        }



}