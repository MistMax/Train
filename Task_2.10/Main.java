/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 4};
        int arr2 = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr2 == arr[i]) {
                System.out.println("ДА");
            } else {
                System.out.println("НЕТ");
                arr2 = arr[i];
            }
            }
    }
}
