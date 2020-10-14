package getoffer;

public class Sina {
    public static void main(String[] args){
        new Child();
    }
    static class Father{
        static {
            System.out.println("static father");
        }
        {
            System.out.println("non static father");
        }
        public Father(){
            System.out.println("construct father");
        }
    }
    static class Child extends Father{
        static {
            System.out.println("static child");
        }
        {
            System.out.println("non static child");
        }
        public Child(){
            System.out.println("construct child");
        }
    }
}
