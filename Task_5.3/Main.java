/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        for (int i = 0; i < 16 ; i+=2) {
            num.add(i);
            if (i > 0 && i < 10) num1.add(i);
        }
        System.out.println(num);
        System.out.println(num1);
    }

}
