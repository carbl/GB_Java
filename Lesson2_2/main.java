/*
Напишите метод, который составит строку, состоящую из 100 повторений
слова TEST и метод, который запишет эту строку в простой текстовый файл,
обработайте исключения.
 */

package Lesson2_2;
import java.io.FileOutputStream;
import java.io.IOException;
public class main {

    public static String stringGenerate (String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void writerFile(String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("out_TEST_100.txt");

            fileOutputStream.write(str.getBytes());

            fileOutputStream.close();
            System.out.println("Файл создан.");
        } catch (IOException e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        writerFile(stringGenerate("TEST"));
    }
}
