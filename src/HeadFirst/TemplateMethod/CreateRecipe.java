package HeadFirst.TemplateMethod;

public class CreateRecipe {

    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }
}
