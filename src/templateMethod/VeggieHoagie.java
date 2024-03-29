package templateMethod;

public class VeggieHoagie extends Hoagie {

    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    boolean customerWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    public void addVegetables() {
        System.out.print("Adding the Vegetables: ");

        for (String vegetable : veggiesUsed) 
            System.out.print(vegetable + " ");
    }

    @Override
    public void addCondiments() {
        System.out.print("Adding the Condiments: ");

        for (String condiment : condimentsUsed) 
            System.out.print(condiment + " ");
    }

    @Override
    void addMeat() {
    }

    @Override
    void addCheese() {
    }
}
