package example2;

public abstract class Animal {
    protected int legs;
    public Animal(int legs){
        this.legs=legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("该动物用"+this.legs+"条腿走路");
    }
}
