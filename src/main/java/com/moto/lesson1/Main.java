package com.moto.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберете + или -");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        try {
            if(!operation.equals("-")) {
                calcsum();
            }
            else {
                calcdgr();
            }
        } catch(java.util.InputMismatchException e){
            System.out.println("Не правельный тип данных, программа будет перезапущена");
            try {
                if(!operation.equals("-")) {
                    calcsum();
                }
                else {
                    calcdgr();
                }
            } catch(java.util.InputMismatchException y) {
                System.out.println(" не верный запрос");
            }
        }
    }
    private static void calcdgr() {
        System.out.println("Добро пожаловать в калькулятор");
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        float a;
        a = scanner.nextFloat();
        float b;
        System.out.println("Введите второе число");
        b = scanner.nextFloat();
        System.out.printf("result =" + (a-b));
    }
    private static void calcsum() {
        System.out.println("Добро пожаловать в калькулятор");
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        float a;
        a = scanner.nextFloat();
        float b;
        System.out.println("Введите второе число");
        b = scanner.nextFloat();
        System.out.printf("result =" + (a+b));
    }
}
