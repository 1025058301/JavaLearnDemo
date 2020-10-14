package example2;

public class Fish extends Animal implements Pet {
    private String name;
    public Fish(){
        super(0);
    }
    public void setName(String name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void eat(){
        System.out.println("鱼儿吃食");
    }
    public void play(){
        System.out.println("鱼儿嬉闹");
    }
    public void walk(){
        System.out.println("鱼儿无腿，不能行走");
    }

}
