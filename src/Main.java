public class Main {
    public static void printLeapYear ( int year){
           if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " високосный год");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void applicationVersion (int clientOs, int clientDeviceYear){
               if ( clientOs ==1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs ==1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs ==0 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        } else if (clientOs == 0 && clientDeviceYear <=2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
    }
    public static int printDeliveryTime(int deliveryDistance, int deliveryDays) {
           deliveryDays = 0;
           if (deliveryDistance < 20) {
               deliveryDays = deliveryDays + 1;
                     }
           else if (deliveryDistance >= 20 && deliveryDistance < 60) {
               deliveryDays = deliveryDays + 2;

           }
            else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
               deliveryDays = deliveryDays + 3;

           }
            return deliveryDays;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1.");
    int year = 2013;
        printLeapYear(year);
    }
    public static void task2(){
        System.out.println("Задача 2.");
        int clientOs =0;
        int clientDeviceYear = 2022;
        applicationVersion(clientOs, clientDeviceYear);
    }
    public static void task3(){
        System.out.println("Задача 3.");
        int deliveryDistance = 95;
        int deliveryDays =0;
        deliveryDays =  printDeliveryTime(deliveryDistance,deliveryDays);
           if ( deliveryDays ==0) {
            System.out.println("Доставки нет");}
        else {
            System.out.println(" Потребуется дней " + deliveryDays);
        }

        }

}