/*
Задание: Дано число, например 31. Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы.
То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30. Если число не делится - выведите 'false',
а если делится - выведите 'true'.
*/

public class Main {
    public static void main(String[] args) {
        int a = 31;
        int[] b = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
            for (int i = 0; i < 29 ; i++) {
                if (a % b[i] == 0) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
    }
}
