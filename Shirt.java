package FashionStore;

public class Shirt extends Product {

    public int shirtSize;
    public String sleevesLength;


    public Shirt(String manufacturer, String model, Double price,
                 FashionColor color, int shirtSize, String sleevesLength) {

        super(manufacturer, model, price, color);
        this.shirtSize = shirtSize;
        this.sleevesLength = sleevesLength;
    }

    @Override
    public void printProduct() {
        super.printProduct();
        System.out.println(
                "Shirt Size:" + shirtSize + "\n"+
                "Sleeves Length:" + shirtSize + "\n"
        );
    }

}
