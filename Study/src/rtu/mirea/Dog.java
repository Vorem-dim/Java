package rtu.mirea;

public class Dog {
    private int age;
    private String name;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog(String name) {
        this.name = name;
        this.age = 5;
    }
    public Dog(int age) {
        this.name = "Roger";
        this.age = age;
    }
    public Dog() {
        this.name = "Roger";
        this.age = 5;
    }
    public String toString() {
        return name + " is " + age + " years old";
    }
}
