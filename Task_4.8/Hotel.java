public class Hotel {
    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms(){
        String freeRoomsList = "Свободные комнаты: ";
        for (int i = 0; i < this.rooms.length; i++) {
            if (!this.rooms[i].isFree()) freeRoomsList += (this.rooms[i].getRoomNumber()+" ");
        }
        System.out.println(freeRoomsList);
    }
    public void getFreeRooms (byte quantity, boolean wc, boolean eat, boolean wifi, int serviceCount) {
        String result = "По данному запросу найдены комнаты: ";
        for (int i = 0; i < rooms.length; i++) {
            int mark = 0;
            Room room = rooms[i];
            if (quantity!=0 && room.getQuantity() == quantity ) mark++;
            if(wc && room.isWc()) mark++;
            if(eat && room.isEat()) mark++;
            if(wifi && room.isWifi()) mark++;
            if(serviceCount == mark && !room.isFree()){
                result += room.getRoomNumber()+" ";
        }

    }
        System.out.println(result);

}

    public void getReserveRoom() {
        String result = "Зарезервированные комнаты:";
        for (int i = 0; i < this.rooms.length; i++) {
            if(this.rooms[i].isFree()){
                result += (this.rooms[i].getRoomNumber()+" ");
            }
        }
        System.out.println(result);
    }

    public void reserveRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < this.rooms.length; i++) {
            if(this.rooms[i].getRoomNumber() == roomNumber && !this.rooms[i].isFree()){
                rooms[i].setFree(false);
                info = ("Комната номер "+roomNumber+" успешно забронированна");
                break;
            }else if(this.rooms[i].getRoomNumber() == roomNumber && this.rooms[i].isFree()){
                info = "Комната "+roomNumber+" занята";
                break;
            }
        }
        System.out.println(info);
    }
}
