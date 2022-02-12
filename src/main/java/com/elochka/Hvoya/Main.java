package com.elochka.Hvoya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Хочешь Ёлочку покажу?");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        try {
            if (operation.equalsIgnoreCase( "Да")) {
                elochka();
                System.out.println();
                elochka2();
            } else {
                System.out.println("Ну и не надо :(");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибочка!");
        }
    }

    public static void elochka() {
        int height = 10;
        for(int i=0; i<=height; i++) {
            for (int space=1; space<=height-i; space++) {
                System.out.print(" ");
            }
            for (int star=1; star<=i*2-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=2; i++)
        {
            for(int k=1; k<=7; k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
}

    public static void elochka2() {
        int i = 0;
        while(i<10){
            int j = 1;
            int k = 0;
            while(j<10-i){
                System.out.print(" ");
                j++;
            }
            while(k<(2*i)+1){
                System.out.print("*");
                k++;
            }
            ++i;
            System.out.println();
        }
    }
}
