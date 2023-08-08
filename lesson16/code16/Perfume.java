public class Perfume {
    String brand;
    String name;
    String smell;

    int ml;
    int price;



    public Perfume(String brand, String name, String smell, int ml, int price){
        this.brand=brand;
        this.name=name;
        this.smell=smell;
        this.ml=ml;
        this.price=price;

    }
    void chtoEto(){
        System.out.println("Eto perfume");
    }

}
