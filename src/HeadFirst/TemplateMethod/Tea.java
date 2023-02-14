package HeadFirst.TemplateMethod;


public class Tea extends CaffeineBeverage{

    void brew() {
        System.out.println("Stepping the tea");
    }

    void addCondiments() {
        System.out.println("Add Lemon");
    }
}