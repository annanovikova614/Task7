package com.company.console;


import java.util.Scanner;

import static com.company.common.Tests.printResultTests;
import static com.company.common.Solution.solution;

public class Main {
    public static void main(String[] args) {
        printResultTests();
        System.out.println("Введите ваш собственный тест");
        int arraySize = readVariable("размер массива:");

        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = readVariable("элементы массива:");
        }

        int result = solution(array);
        printResult(result);
    }

    public static int readVariable(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите %s", string);
        return scanner.nextInt();
    }

    public static void printResult(int result) {
        System.out.printf("масимальный элемент: %d",result);
    }


}
