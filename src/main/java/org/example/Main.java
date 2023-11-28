package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printIsYearLeap(2023);
        printRecommendedAppVersion(0, 2023);
        printDeliveryDays(61);
    }

    public static void printIsYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год -  високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void printRecommendedAppVersion(int clientOs, int year) {
        System.out.print("Установите ");
        if (isDeviceOld(year)) {
            System.out.print("облегченную ");

        }
        System.out.print("версию для");
        if (clientOs == 0) {
            System.out.println(" iOS");
        } else System.out.print(" Android");
    }

    public static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear < currentYear;
    }

    public static void printDeliveryDays(int deliveryDistance) {
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }

    public static int calculateDeliveryDays(int distance) {
        int result = 1;
        if (distance > 20) {
            result++;
        }
        if (distance > 60) {
            result++;
        }
        if (distance > 100) {
            result = -1;
        }
        return result;
    }

}
