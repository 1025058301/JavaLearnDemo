package aliyunlearn;

interface Itest{

    abstract void go();
}
abstract class ActionDemo{
    public static final int eat=1;
    public static final int sleep=3;
    public static final int play=5;
    abstract public void eat();
    abstract public void sleep();
    abstract public void play();
    public void getAction(int a){
        switch(a){
            case 1: this.eat();
                break;
            case 3: this.sleep();
                break;
            case 5: this.play();
                break;
        }
    }
}
class Human extends ActionDemo implements Itest{

    public void go(){
    }
    public void eat(){
        System.out.println("人吃山珍海味");
    }
    public void sleep(){
        System.out.println("人和心爱的姑娘一起睡觉");
    }
    public void play(){
        System.out.println("人和好兄弟一起玩耍");}

}
class Dog extends ActionDemo{

    public void eat(){
        System.out.println("狗吃屎");
    }
    public void sleep(){
        System.out.println("狗独自睡觉");
    }
    public void play(){
        System.out.println("狗和主人一起玩耍");}

}
class Cat extends ActionDemo{

    public void eat(){
        System.out.println("猫吃小鱼");
    }
    public void sleep(){
        System.out.println("猫和母猫一起睡");
    }
    public void play(){
        System.out.println("猫也和人玩耍");}

}
public class AbstractDemo{
    public static void main(String []args){
        Human lee=new Human();
        Dog ahuang=new Dog();
        Cat miao=new Cat();
        lee.getAction(ActionDemo.eat);
        lee.getAction(ActionDemo.sleep);


    }}