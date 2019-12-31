package FashionStore;

public abstract class Product {

    public String manufacturer;
    public String model;
    public Double price;

    public Product(String manufacturer, String model, Double price, FashionColor color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public FashionColor color;

    public void printProduct(){
        System.out.println(
                "Manufacturer: "+ manufacturer + "\n"+
                "Model: "+ model + "\n"+
                "Price: "+ price + "\n"+
                "Color: "+ color + "\n"
        );
    }



}
