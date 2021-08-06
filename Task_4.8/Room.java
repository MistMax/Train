/*
 * 2) Номера (кол-во мест(1-3), сан.узел(есть/нет), питаение(есть/нет), wifi(есть/нет), свободен/занят)
 */
public class Room {
    private int quantity;
    private boolean wc;
    private boolean eat;
    private boolean wifi;
    private boolean isFree;
    private int roomNumber;


    public Room(int quantity, boolean wc, boolean eat, boolean wifi, int roomNumber) {
        this.quantity = quantity;
        this.wc = wc;
        this.eat = eat;
        this.wifi = wifi;
        this.isFree = false;
        this.roomNumber = roomNumber;

    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isWc() {
        return wc;
    }

    public boolean isEat() {
        return eat;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

}
