/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};
        exclude(num,0);
    }
    public static void exclude (int num[],int index) {
        if (index < num.length) {
            System.out.println(num[index]);
            index++;
            exclude(num, index);
        }
    }
}
