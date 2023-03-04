/*
Написать метод, который определяет, является ли год високосным,
и возвращает boolean (високосный - true, не високосный - false).
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
package lesson1_2;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();
        in.close();
        System.out.println(isLeapYear(year));
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
