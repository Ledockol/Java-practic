package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Main {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//      ex3();
//        ex4();
        ex5();

    }
    private static void ex1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!%n", name);
        iScanner.close();

    }
    private static void ex2() {
        int[] binaryArray = new int [1000];
        int counter = 0;
        int maxLength = 0;
        Random random = new Random();
//        double randomFromMath  = Math.random();
//        System.out.println(randomFromMath);
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(2);
        }
//        System.out.println(Arrays.toString(binaryArray));
        for (int num : binaryArray) {
            if (num == 1){
                counter++;
            }else{
//              maxLength = (counter > maxLength) ? counter : maxLength
              maxLength = Math.max(counter, maxLength);
              counter = 0;
            }
        }
        System.out.println("max.Length: " + Math.max(counter, maxLength));
    }
    private static void ex3() {
//        Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] binaryArray = new int [10];

        Random random = new Random();
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(1000);
        }
        System.out.println("Массив : " + Arrays.toString(binaryArray));
        int minElements = binaryArray[0];
        int maxElements = binaryArray[0];
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] < minElements) {
                minElements = binaryArray[i];
            } else if (binaryArray[i] > maxElements) {
                maxElements = binaryArray[i];
            }
        }
        System.out.println("Минимальный элемент " + minElements);
        System.out.println("Максимальный элемент " + maxElements);
    }

    private static void ex4() {
//         Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
//         не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        Scanner iScanner = new Scanner(System.in);
        int year;
        System.out.print("Введите Год: ");
        year = iScanner.nextInt();
        iScanner.close();
        int array = year;
        boolean result = ((array % 4 == 0) & (array % 100 != 0)) | (array % 400 == 0);
        System.out.println(result);
       }

    private static void ex5() {
//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        int[] binaryArray = new int [20];
        Random random = new Random();
        for (int i = 0; i < binaryArray.length; i++) {
            binaryArray[i] = random.nextInt(5);
        }
        System.out.println("Массив : " + Arrays.toString(binaryArray));
        int left = 0;
        int right = binaryArray.length - 1;
        int val = 3;
        System.out.println(left);
        System.out.println(right);
        for (int i = 0; i < binaryArray.length; i++) {
            if (right > left; left = val; right != val) {
                binaryArray[right] = binaryArray[left];
                binaryArray[left] = binaryArray[right];
                left++;
                right--;
            }else if{
                (right > left; left != val)
                left++;
            }else if{
                (right > left; right = val)
                right--;
            }
        }
        System.out.println("Массив новый : " + Arrays.toString(binaryArray));
    }
}


