public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int year = 2027;
        whatYear(year);
        System.out.println("Задача №2");
        int clientOs = 0;
        int clientDeviceYear = 2013;
        findClientOS(clientOs, clientDeviceYear);
        System.out.println("Задача №3");
        howLong();
    }

    private static void whatYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s - високосный год\n", year);
        } else {
            System.out.printf("%s - не високосный год\n", year);
        }
    }

    private static void findClientOS(int clientOs, int clientDeviceYear) {
        if (clientOs == 1) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
        if (clientOs == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    private static int howLong() {
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1 день");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2 день");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3 день");
        } else {
            System.out.println("Вне зоны доставки");
        }
        return deliveryDistance;
    }
}


