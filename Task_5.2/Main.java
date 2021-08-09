/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
Модернизация ПО
*/

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<String, String>();

        while (true)
        {
            String sity1 = reader.readLine();
            if (sity1.isEmpty())
                break;
            else {
                String lastName = reader.readLine();
                map.put(sity1, lastName);
            }
        }

        String cityKeyboard = reader.readLine();

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(cityKeyboard))
                System.out.println(pair.getValue());
        }
    }
}
