/*
Задан целочисленный список ArrayList. Найти минимальное,
максимальное и среднее арифметическое из этого списка.
 */
package Lesson3_2;
import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Исходный список %s\n", list1);

        int max = list1.get(0);
        int min = list1.get(0);
        int sum = 0;
        for (int item : list1) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
            sum += item;
        }
        float arifMean = (float)sum/list1.size();

        System.out.printf("Максимальное %s\n", max);
        System.out.printf("Минимальное %s\n", min);
        System.out.printf("Среднее арифметическое %s\n", arifMean);
    }
}
