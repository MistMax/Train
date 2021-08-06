/*
Реализуй в классе Fox интерфейс Animal.
Учти, что создавать дополнительные классы и удалять методы нельзя!
Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В интерфейсе Animal нужно объявить метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/

public class Main {
    public static void main(String[] args){
        Fox fox = new Fox ("Лис", "Красный");
        System.out.println(fox.getColor());
    }
}

interface Animal {
    String getColor();
}

class Fox implements Animal {
    private String name;
    String color;

    String getName() {
        return "Fox";
    }
    Fox (String name, String color){
        this.name = name;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
