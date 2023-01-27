
public class Shirt {

    public int shirtID = 4; // 
    public String description = "Shirt from soft natiral cloth, that feels good on your body";
    public String colorCode = "Unset";
    public double price = 7.8;
    public int quantityInStock = 0;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
