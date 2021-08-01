/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        int sum = 0;
        int current = 0;
        for (int i = 0; i <a.length; i++) {
            sum = sum + a[i];
            if (sum<10){
                current++;
            }
            if (sum>10){
                System.out.println(current+1);
                break;
            }

        }

    }
}
