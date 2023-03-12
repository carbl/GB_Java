/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
(в языке уже есть что-то готовое для этого)
 */
package Lesson3_1;
import java.util.ArrayList;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> listIn = new ArrayList<Integer>();
        for (int inxex = 0; inxex < 10; inxex++) {
            int number = rand.nextInt(-100, 100);
            listIn.add(number);
        }
        System.out.printf("Исходный список %s\n", listIn);
        int index = 0;
        while (index < listIn.size()) {
            if (listIn.get(index) % 2 == 0) {
                listIn.remove(index);
            }
            else {
                index++;
            }
        }
        System.out.printf("Список измененный %s", listIn);
    }
}
