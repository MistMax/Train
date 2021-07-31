/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,9,1,3,5};
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == 5) {
                System.out.println("Да");
            } else {
                System.out.println("Нет");
            }
        }
    }
}
