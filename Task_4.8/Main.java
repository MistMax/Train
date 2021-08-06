import java.util.Scanner;

/*
 *  ***Гостиница***
 *  1) Гостиница
 *  2) Номера (кол-во мест(1-3), сан.узел(есть/нет), питаение(есть/нет), wifi(есть/нет), свободен/занят)
 *
 *   *Задание для лабораторной работы №4*
 *   Освободить комнату
 *   Вывести свойства комнаты
 *   Показать комнаты с WiFi
 *   Показать комнаты с WC
 *   Показать комнаты с Eat
 *   Показать комнаты по кол-ву спальных мест
 *   Отобразить список команд
 * */
public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room((byte) 1,false,false,true,(byte) 11),
                new Room((byte) 2,true,true,false,(byte) 12),
                new Room((byte) 1,false,true,true,(byte) 13),
                new Room((byte) 3,true,false,false,(byte) 21),
                new Room((byte) 2,false,false,false,(byte) 22),
                new Room((byte) 1,true,true,true,(byte) 23),
                new Room((byte) 3,false,true,false,(byte) 31),
                new Room((byte) 3,true,true,false,(byte) 32),
                new Room((byte) 1,false,false,true,(byte) 33),
        };
        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command = "*----*\n" +
                "getFreeRooms (quantity:[кол-во мес]) (wc:[true|false]) (eat:[true|false]) (wifi:[true|false]))- показать все свободные комнтаы\n" +
                "reserveRoom [номер комнаты] забронировать номер\n" +
                "getReservedRooms - показать зарезервированные номера\n" +
                "*----*";
        System.out.println(command);
        System.out.println("Введите команду");
        command = scanner.nextLine();
        while (!command.equals("exit")){
            if(command.indexOf("getFreeRooms") == 0){
                String[] splitted = command.split(" ");
                if(splitted.length == 1) hotel.getFreeRooms();
                else {
                    byte quantity = 0;
                    boolean wc = false;
                    boolean eat = false;
                    boolean wifi = false;
                    for (int i = 1; i < splitted.length; i++) {
                        String[] service = splitted[i].split(":");
                        if(service[0].equals("quantity")) quantity = Byte.parseByte(service[1]);
                        else if (service[0].equals("wc")) wc = service[1].equals("true");
                        else if (service[0].equals("eat")) eat = service[1].equals("true");
                        else if (service[0].equals("wifi")) wifi = service[1].equals("true");
                    }
                    hotel.getFreeRooms(quantity, wc, eat, wifi, splitted.length - 1);
                }
            }else if (command.indexOf("reserveRoom") == 0) {
                String[] spltted = command.split(", ");
                byte roomNumber = Byte.parseByte(spltted[1]);
                hotel.reserveRoom(roomNumber);
            }else if(command.equals("getReservedRooms")){
                hotel.getReserveRoom();
            }
            else{
                System.out.println("Ошибка: неизавестаная команда.\nСписок доступных команд:\n"+command);
            }
            command = scanner.nextLine();
        }
    }
}
