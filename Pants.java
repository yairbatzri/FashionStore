package FashionStore;

public class Pants extends Product{

    public double pantsSize;
    public String gizra;

    public Pants(String manufacturer, String model, Double price,
                 FashionColor color,double pantsSize,String gizra) {

        super(manufacturer, model, price, color);
        this.pantsSize = pantsSize;
        this.gizra = gizra;
    }


    @Override
    public void printProduct() {
        super.printProduct();
        System.out.println(
                "Pants Size:" + pantsSize + "\n"+
                "Gizra:" + gizra + "\n"
        );
    }
}
