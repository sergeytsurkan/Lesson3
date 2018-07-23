package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double var;
        double var_double;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер задания от 1 до 10");
        while (true) {
            var_double = in.nextInt();
            if ((var_double >= 1) && (var_double <= 10)) {
                break;
            }
            System.out.println("ERROR!!! Не верно указан номер задания");
        }
        System.out.println("Выполняем задание № "+var_double);

        if (var_double == 1) {
            task1();
        }
        else if (var_double == 2){
            task2();
        }
        else if (var_double == 3){
            task3();
        }
        else if (var_double == 4){
            task4();
        }
        else if (var_double == 5){
            task5();
        }
        else if (var_double == 6){
            task6();
        }
        else if (var_double == 7){
            task7();
        }
        else if (var_double == 8){
            task8();
        }
        else if (var_double == 9){
            task9();
        }
        else if (var_double == 10){
            task10();
        }
}

    private static void task1() {
        int a;
        int b;
        double h;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        a = in.nextInt();
        System.out.println("Введите значение : b");
        b = in.nextInt();
        System.out.println("Введите значение : h");
        h = in.nextDouble();

        for (double x = a; x <= b; x++) {

            System.out.println("x = " + x + " : y = " +  (x - Math.sin(x)));
        }

    }
    private static void task2() {
        int a;
        int b;
        double h;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        a = in.nextInt();
        System.out.println("Введите значение : b");
        b = in.nextInt();
        System.out.println("Введите значение : h");
        h = in.nextDouble();

        for (double x = a; x <= b; x++) {

            System.out.println("x = " + x + " : y = " +  ((Math.sin(x)*Math.sin(x)*x)));
        }

    }
    private static void task3() {
        int a;
        int b;
        double h;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        a = in.nextInt();
        System.out.println("Введите значение : b");
        b = in.nextInt();
        System.out.println("Введите значение : h");
        h = in.nextDouble();

        for (double x = a; x <= b; x++) {

            System.out.println("x = " + x + " : y = " +  ((2*Math.cos(x))-1));
        }

    }
    //Написать программу вычисления функции 2    y ax b     при    a  3 ;   b 5 . Аргумент  x принимает значения от 1 до 5 с шагом 0,5.
    private static void task4() {
        int a;
        int b;
        double z;
        z = 5;
        a = 3;
        b = -5;


        for (double x = 1; x <=z ; x+=0.5) {

            System.out.println("x = " + x + " : y = " +  (a*(x*x)+b));
        }

    }
    //Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем
    //цифра b?
    private static void task5() {
        int a;
        int b;
        double с;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число....");
        с = in.nextDouble();
        System.out.println("Введите цифру : а");
        a = in.nextInt();
        System.out.println("Введите цифру : b");
        b = in.nextInt();
        String StringC =  String.valueOf(с);
        int CountA = StringC.length() - StringC.replace(String.valueOf(a),"").length();
        int CountB = StringC.length() - StringC.replace(String.valueOf(b),"").length();
        if (CountA > CountB) {
            System.out.println("Да число а ("+CountA+"), чаще встречается чем б ("+CountB+")");
        }
        else if (CountB > CountA){
            System.out.println("НЕТ число а("+CountA+"), реже встречается чем б ("+CountB+")");
        }
        else if (CountB == CountA){
            System.out.println("число а("+CountA+"), встречается чтолько же сколько и б ("+CountB+")");
        }
}
    //Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100.
    private static void task6() {
        int b=0;
        int c;
        c = 19;
        for (double a = 1; a<=(((100/c)+c)*c); a++) {
            if (b > 15) {
                break;
            }
            if ((a%19== 0) && (a>100)){
            System.out.println("№:"+(b)+" Число - "+a+" делится на 19 и равно " + a/c);
            b++;
            }

        }
    }
    private static void task7() {
     int count = 20;
            for(int i=0;i<(count/4);++i)
            {
                for(int j=0;j<count;++j)
                System.out.print("*");
                System.out.println();
            }
    }
    private static void task8() {
        int count = 10;
        for(int i=0;i<(count);++i)
        {
            for(int j=0;j<i;++j)
                System.out.print("*");
            System.out.println();
        }
    }
    private static void task9() {
        int i = 0;
        int count = 10; //к-во строк

        while (i < count) {
            String space = "";
            String star = "";
            for (int j = 0; j < count - i; j++) space += " ";
            for (int j = 0; j < 2 * i + 1; j++) star += "*";
            System.out.println(space + star);
            i++;
        }
        while (count < i) {
            String space = "";
            String star = "";
            for (int j = 0; j < count - i; j++) space += " ";
            for (int j = 0; j < 2 * i + 1; j++) star += "*";
            System.out.println(space + star);
            i++;
        }
    }

    private static void task10() {

    }
}
