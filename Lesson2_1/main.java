/*
Напишите метод, который принимает на вход строку (String) и определяет
является ли строка палиндромом (возвращает boolean значение).
 */
package Lesson2_1;

public class main {
    public static boolean palindrome(String text) {
        System.out.println(text);
        text = text.replaceAll("\\pP","");
        text = text.replace(" ","");
        StringBuilder str = new StringBuilder(text);
        str.reverse();
        String inverted = str.toString();
        return text.equalsIgnoreCase(inverted) ;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("а роза, упала на лапу Азора"));

    }
}
