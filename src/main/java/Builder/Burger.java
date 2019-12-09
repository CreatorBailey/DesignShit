package Builder;

public class Burger {
    protected int size;
    protected boolean cheese = false;
    protected boolean pepperoni = false;
    protected boolean lettuce = false;
    protected boolean tomato = false;

    public Burger(BurgerBuilder burger) {
        this.size = burger.size;
        this.cheese = burger.cheese;
        this.pepperoni = burger.pepperoni;
        this.lettuce = burger.lettuce;
        this.tomato = burger.tomato;
    }
}
