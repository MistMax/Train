/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/


public class Main {
    public static void main(String[] args) {
        System.out.println(equally(4,5));

    }
    static boolean equally(int a, int b) {
        if (a == b) return true;
        else return false;
    }
}
