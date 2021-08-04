import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ксения","Иванова", 68, null, null);
        Person p2 = new Person("Ольга", "Иванова", 67, null, null);
        Person p3 = new Person("Алексей","Иванов", 63, null, null);
        Person p4 = new Person("Александр","Иванов", 65, null, null);
        Person p5 = new Person("Анастасия","Иванова", 40, p1, p3);
        Person p6 = new Person("Сергей","Иванов", 40, p2, p4);
        Person p7 = new Person("Николай","Иванов", 20, p5, p6);
        p1.info();
    }
}

class Person{ // Описание того, как должен выглядить человек
    String name;
    String lastname;
    int age;
    Person mother;
    Person father;
    Person(String name, String lastname, int age, Person mother, Person father){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }
    void info(){
        String info = "Привет меня зовут "+this.name+" "+this.lastname+"\n" +
                      "Мне "+this.age+" лет \n";

        if(this.mother != null) {
            info += "Мою маму зовут " + this.mother.name + "\n";
            if (this.mother.father != null) {
                info += "Дедушку по маминой линии зовут " + this.mother.father.name + "\n";
                if (this.mother.mother != null) {
                    info += "Бабушку по маминой линии зовут " + this.mother.mother.name + "\n";
                }
            }
        }
        if(this.father != null){
            info += "Моего папу зовут "+this.father.name+"\n";
            if(this.father.father != null) {
                info += "Дедушку по папиной линии зовут "+this.father.father.name+"\n";
                if(this.father.mother != null){
                    info += "Бабушку по папиной линии зовут "+this.father.mother.name+"\n";
                }
            }
        }
        System.out.println(info);
    }
}
