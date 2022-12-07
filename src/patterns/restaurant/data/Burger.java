package patterns.restaurant.data;

public class Burger extends Product {

    public static class Builder {

        private final String forWhom;
        private BurgerType burgerType;
        private boolean withHotPepper = false;
        private boolean weightBurger = false;

        public Builder(String clientName) {
            this.forWhom = clientName;
        }

        public Builder burgerType(BurgerType burgerType) {
            this.burgerType = burgerType;
            return this;
        }

        public Builder withHotPepper(boolean withHotPepper) {
            this.withHotPepper = withHotPepper;
            return this;
        }

        public Builder sizeBurger(boolean weightBurger) {
            this.weightBurger = weightBurger;
            return this;
        }

        public Burger build() {
            return new Burger(forWhom, burgerType, withHotPepper, weightBurger);
        }
    }

    private final String forWhom;
    private final BurgerType coffeeType;
    private final boolean withHotPepper;
    private final boolean weightBurger;

    private Burger(String forWhom, BurgerType burgerType, boolean withHotPepper, boolean weightBurger) {
        this.forWhom = forWhom;
        this.coffeeType = burgerType;
        this.withHotPepper = withHotPepper;
        this.weightBurger = weightBurger;
    }

    @Override
    public String toString() {
        return "Бургер{" + "для = " + forWhom + ", тип бургера = " + weightBurger + ", с острым перчиком = " + withHotPepper + ", 350 грамм = " + weightBurger + '}';
    }
}
