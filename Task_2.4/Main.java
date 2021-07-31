/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit = scan.nextInt();
        double percent = scan.nextInt();
        double result = ((deposit/100*percent)+deposit);
        System.out.println(result);
            for (int i = 0; i < 4; i++) {
                result = ((result/100*percent)+result);
                System.out.println(result);
        }   

        }

    }
