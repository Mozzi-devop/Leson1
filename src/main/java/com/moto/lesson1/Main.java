package com.moto.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор");
        System.out.println("Выберете метод исчисления +, -, *, / ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        try {
            if (operation.equals( "+")) {
                calcsum();
            } else if (operation.equals("-")) {
                calcdgr();
            } else if (operation.equals("*")) {
                calcmult();
            } else if (operation.equals("/")) {
                calcdivis();
            } else {
                System.out.println("Я не умею так делать :(");
            }
        } catch(java.util.InputMismatchException e){
            System.out.println("Не правильный тип данных, программа будет перезапущена");
            try {
                if (operation.equals( "+")) {
                    calcsum();
                } else if (operation.equals("-")) {
                    calcdgr();
                } else if (operation.equals("*")) {
                    calcmult();
                } else if (operation.equals("/")) {
                    calcdivis();
                } else {
                    System.out.println("Я не умею так делать :(");
                }
            } catch(java.util.InputMismatchException y) {
                System.out.println("не верный запрос");
            }
        }
    }
    private static void calcmult() {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        float a;
        a = scanner.nextFloat();
        float b;
        System.out.println("Введите второе число");
        b = scanner.nextFloat();
        System.out.printf("result =" + (a*b));
    }
    private static void calcdivis() {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        float a;
        a = scanner.nextFloat();
        float b;
        System.out.println("Введите второе число");
        b = scanner.nextFloat();
        System.out.printf("result =" + (a/b));
    }
    private static void calcdgr() {
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
