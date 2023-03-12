/*
Создать список типа ArrayList<String>. Поместить в него как строки,
так и целые числа. Пройти по списку, найти и удалить целые числа.
 */
package Lesson3_3;
import java.util.ArrayList;
import java.util.Random;
public class main {
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if (rnd.nextBoolean()) {
                int var = rnd.nextInt(65, 91);
                char ch = (char)var;
                String str = String.valueOf(ch);
                list1.add(str);
            } else if (rnd.nextBoolean()) {
                int var = rnd.nextInt(48, 58);
                char ch = (char)var;
                String str = String.valueOf(ch);
                list1.add(str);
            } else {
                int var = rnd.nextInt(97, 123);
                char ch = (char)var;
                String str = String.valueOf(ch);
                list1.add(str);
            }
        }
        System.out.printf("Исходный список %s\n", list1);
        for (int i = 0; i < list1.size(); i++) {
            if (isNumeric(list1.get(i))) {
                list1.remove(i);
            }
        }
        System.out.printf("Измененный список %s\n", list1);

    }
}
