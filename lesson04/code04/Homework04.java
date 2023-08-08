public class Homework04 {
    public static void main(String[] args) {
        String name= "Sabina";
        System.out.println("Moe imya: "+name);
        int length= name.length();
        System.out.println("Skolko bukv: " +length);

        char firstChar= 'S';
        char lastChar= 'A';
        System.out.println("firstChar: "+ firstChar+ "," + "lastChar: "+ lastChar);

        String str1= "Java";
        String str2= "is";
        String str3= "a";
        String str4= "powerful";
        String str5= "language";
        String sposob1= "Java is a powerful language";
        System.out.println(sposob1);
        String sposob2= new String("Java is a powerful language");
        String sposob2a=new String();
        System.out.println(sposob2);

        System.out.println(sposob1.replace("powerful", "super"));
        String subSposob1ToFind= "age";
        boolean containsSubsposob1= sposob1.contains(subSposob1ToFind);
        if (containsSubsposob1) {
            System.out.println("Stroka soderzhit slovo age");
        } else {
            System.out.println("Stroka ne soderzhit slovo age");
        }
        System.out.println(containsSubsposob1);
    }
}
