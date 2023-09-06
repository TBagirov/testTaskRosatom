
package org.rosatom.testTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //      ---------------- Задача 2 ----------------
        int a = 3, b = 8;

        System.out.println("\n\n\t\t\033[36;1mЗадача 2:\033[0m");
        System.out.println("\033[36;3m\tПоменять местами значения переменных a и b,\n\tне используя 3-ю переменную\033[0m\n");

        System.out.println("  Исходные данные:");
        System.out.printf("  Переменная a = %d, переменная b = %d\n\n", a , b);

        // смена значений у переменных, без использования 3,
        // но в задании написано написать метод, его реализация ниже
        // a ^= b;
        // b ^= a;
        // a ^= b;
        // System.out.println("  Данные после обработки:");
        // System.out.printf("  Переменная a = %d, переменная b = %d", a , b);

        int[] arr = {a, b};
        valueChange(arr);

        System.out.println("  Данные после обработки:");
        System.out.printf("  Переменная a = %d, переменная b = %d\n\n", arr[0] , arr[1]);



        //      ---------------- Задача 3 ----------------
        System.out.println("\n\t\t\033[36;1mЗадача 3:\033[0m");
        System.out.println("\033[36;3m\tИнвертировать односвязный список\033[0m\n");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 11; i++)
            list.add(i);

        System.out.println("  Исходные данные:");
        System.out.println("  " + Arrays.toString(list.toArray()) + "\n");

        reverseList(list);

        System.out.println("  Данные после обработки:");
        System.out.println("  " + Arrays.toString(list.toArray()));
    } // main


    // Задача 2
    // поменять местами значения переменных a и b,
    // не используя 3-ю переменную
    public static void valueChange(int[] arr){
        arr[0] ^= arr[1];
        arr[1] ^= arr[0];
        arr[0] ^= arr[1];
    } // valueChange

    // Задача 3
    // инверсия списка
    public static void reverseList(List<Integer> list ) {
        for (int i = 0; i <= list.size() / 2 - 1; i++){
            int bIndex = list.size() - i - 1;
            int a = list.get(i);
            int b = list.get(bIndex);
            list.set(i, b);
            list.set(bIndex, a);
        } // for i
    } // reverseList

} // Main
