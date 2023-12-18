package pizza_project;

public class PizzaChoice {
    public Pizza choosePizza (String type){
        switch (type){
            case "1": return new Margarita();
            case "2": return new Hawaii();
            case "3":return new Salami();

            default: return null;
        }
    }
}
