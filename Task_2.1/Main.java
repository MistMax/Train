/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Main {
    public static void main(String[] args) {
        String[] words = {"Мама", "Мыла", "Раму"};
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                for (int k = 0; k < words.length; k++) {
                    if (i==j)
                        continue;
                    if (k==i)
                        continue;
                    if (k==j)
                        continue;
                    System.out.print(words[i]);
                    System.out.print(words[j]);
                    System.out.println(words[k]);


                }
                //System.out.print(words[j]);
            }
            //System.out.print(words[i]);

        }
        //System.out.print(words[i]);

    }
}
