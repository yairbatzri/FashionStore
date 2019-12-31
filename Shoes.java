package FashionStore;

public class Shoes extends Product {

    public double shoeSize;

    public Shoes(String manufacturer, String model, Double price, FashionColor color,double shoeSize) {
        super(manufacturer, model, price, color);
        this.shoeSize = shoeSize;


    }



    @Override
    public void printProduct() {
        super.printProduct();
        System.out.println(
                "Shoe Size:" + shoeSize + "\n"
        );
    }
}
