public class Animal {
    boolean veg;
    String speak;
    byte paws;

    public Animal(boolean veg, String speak, byte paws) {
        this.veg = veg;
        this.speak = speak;
        this.paws = paws;
    }

    boolean getVeg() {
        return this.veg;
    }

    String getSpeak() {
        return this.speak;
    }

    byte getPaws() {
        return this.paws;
    }
}
