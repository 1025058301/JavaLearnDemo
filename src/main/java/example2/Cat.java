package example2;

public class Cat extends Animal implements Pet {
    String name;

    public  Cat(String name){
        super(4);
        this.name=name;

    }
    public Cat(){
        this("");
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void play(){
        System.out.println("猫咪在玩耍");
    }
    public void eat(){
        System.out.println("恶猫扑食");
    }
}
