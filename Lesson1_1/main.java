/*
Задать одномерный массив и найти в нем минимальный и максимальный элементы
 */
package Lesson1_1;
public class main {

    private static int getMax(int[] num)
    {
        int max = Integer.MIN_VALUE;
        for (int i: num) {
            max = Math.max(max, i);
        }
        return max;
    }

    private static int getMin(int[] num)
    {
        int min = Integer.MAX_VALUE;
        for (int i: num) {
            min = Math.min(min, i);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] num = { 9, 4, 3, 4, 0, 8 };

        System.out.println("Минимальный элемент " + getMin(num));
        System.out.println("Максимальный элемент " + getMax(num));

    }
}
