public class Homework16 {
    public static void main(String[] args) {

        Perfume perfume=new Perfume("diptyque","PHILOSYKOS", "figs",50,120 );
        perfume.chtoEto();
        System.out.println("Brand: "+perfume.brand);
        System.out.println("Name: "+perfume.name);
        System.out.println("Smell:"+perfume.smell);
        System.out.println("Milliliter: "+perfume.ml);
        System.out.println("Price: "+perfume.price);

    }
}
