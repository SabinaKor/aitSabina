public class Cat {

        String name;
        String color;
        int age;

        public Cat(int age){
            this.age=age;
        }
        public Cat(){
        }
        public Cat(int age, String name){
            this.age=age;
            this.name=name;
        }

        public Cat(int age, String name, String color){
            this.age=age;
            this.name=name;
            this.color=color;
        }

        void sayMeow() {
            System.out.println("Meow");
        }
        void sleep(){
            System.out.println("I am sleeping");
        }

        void running(){
            System.out.println("I am running");
        }


}
