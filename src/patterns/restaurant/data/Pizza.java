package patterns.restaurant.data;

public class Pizza extends Product {

    public static class Builder {

        private final String forWhom;
        private boolean sizePizza = true;
        private boolean weightPizza = false;

        public Builder(String clientName) {
            this.forWhom = clientName;
        }

        public Builder sizePizza(boolean sizePizza) {
            this.sizePizza = sizePizza;
            return this;
        }

        public Builder weightPizza(boolean weightPizza) {
            this.weightPizza = weightPizza;
            return this;
        }

        public Pizza build() {
            return new Pizza(forWhom, sizePizza, weightPizza);
        }
    }

    private final String forWhom;
    private final boolean sizePizza;
    private final boolean weightPizza;

    private Pizza(String forWhom, boolean sizePizza, boolean weightPizza) {
        this.forWhom = forWhom;
        this.sizePizza = sizePizza;
        this.weightPizza = weightPizza;
    }

    @Override
    public String toString() {
        return "Пицца{" + "для = " + forWhom + ", 30 см = " + sizePizza + ", 600 грамм = " + weightPizza + '}';
    }
}
