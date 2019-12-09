package Builder;

public class main {
    public static void main(String[] args) {
        Burger a = (new BurgerBuilder(14))
                .addPepperoni()
                .addLettuce()
                .addTomato()
                .build();
    }
}
