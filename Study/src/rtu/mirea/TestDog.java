package rtu.mirea;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Mike", 12);
        Dog dog2 = new Dog("Roger");
        Dog dog3 = new Dog(8);
        Dog dog4 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3.toString());
        System.out.println(dog4.toString());
    }
}
