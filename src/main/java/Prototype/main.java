package Prototype;

public class main {
    public static void main(String[] args) {
        Sheep original = new Sheep("Jolly","Mountain Sheep");
        System.out.println(original.getName());
        System.out.println(original.getCategory());

        Sheep cloned = new Sheep("Dolly","Mountain Sheep");
        System.out.println(cloned.getName());
        System.out.println(cloned.getCategory());

    }
}
