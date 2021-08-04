public class Horse extends Animal {
    public Horse(boolean veg, String speak, byte paws) {
        super(veg, speak, paws);
    }
    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }
}
