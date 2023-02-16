package HomeWork3;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.round;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class Ex2 {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int val = rnd.nextInt(-100, 100);
            list.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list);

        int maxItem = list.get(0);
        int minItem = list.get(0);
        int sumItems = 0;
        for (int item : list) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/list.size();
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}

