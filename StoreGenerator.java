package FashionStore;

public class StoreGenerator {

    public int randomItem = (int)(Math.random()* 3);
    public int randomNumber = (int)(Math.random()*20);
    public double randomPrice = (double)(Math.random()*100);



    public void getRandomItem() {
        switch (randomItem) {

            case 1:
                Shoes shoe = new Shoes(this.getManufecturer(), getModel(), getPriceWithOutvat()
                        , getRandomColor(), getRandomSize());
                break;

            case 2:
                Pants pant = new Pants(this.getManufecturer(), getModel(), getPriceWithOutvat()
                        , getRandomColor(), getRandomSize(),this.getGizra());
                break;
            case 3:
                Shirt shirt = new Shirt(this.getManufecturer(), this.getModel(), this.getPriceWithOutvat()
                        , this.getRandomColor(), this.getShirtSize(),this.getSleevesLength());
                break;
        }

        }
        public String getModel (){
        return "SN" + (int)(Math.random()*1000);
        }

        public double getPriceWithOutvat () {
         return this.randomPrice = ((double) (Math.random()) * 20);
        }
        public String getSleevesLength (){
        if (randomNumber < 10){
            return "Short";
        }else{
            return "Long";
        }
        }
        public int getShirtSize (){

        if (randomNumber<5) {
            return 12;
        }else if(randomNumber>6 && randomNumber < 10) {
            return 14;
        }else if (randomNumber>11 && randomNumber < 15){
            return 16;
        }else if (randomNumber>15 && randomNumber < 18){
            return 18;

        }else {
            return 20;
        }

        }
        public String getGizra(){

        if (randomNumber<5){
            return "Slim";
        }else if (randomNumber>5 && randomNumber < 10){
            return "Skiny";
        }else if (randomNumber>10 && randomNumber < 15){
            return "Super Skiny";
        }else {
            return "Retro";
        }
        }

        private FashionColor getRandomColor() {

            if (randomNumber < 5) {
                return FashionColor.BLUE;
            } else if (randomNumber >= 5 && randomNumber < 9) {
                return FashionColor.GREEN;
            } else if (randomNumber >= 9 && randomNumber < 13) {
                return FashionColor.ORANGE;
            } else if (randomNumber >= 13 && randomNumber < 17) {
                return FashionColor.RED;
            } else if (randomNumber >= 17 && randomNumber < 20) {
                return FashionColor.PURPLE;
            }
        return FashionColor.BLACK;
            }

        private  int getRandomSize(){
        return ((int) (Math.random()*35 + 9));
            }


        private String getManufecturer() {

            if (randomNumber < 5) {
                return "Nike";
            } else if (randomNumber >= 5 && randomNumber < 9) {
                return "Adidas";
            } else if (randomNumber >= 9 && randomNumber < 13) {
                return "Fila";
            } else if (randomNumber >= 13 && randomNumber < 17) {
                return "New Balance";
            } else if (randomNumber >= 17 && randomNumber < 20) {
                return "Reebook";
            } else {
            return "Castro";
            }


            }}