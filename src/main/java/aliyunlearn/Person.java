package aliyunlearn;

public class Person{
    private String name;
    private int age;
    private int height;
    public Person(){}
    public Person(String name,int age,int height){
        this.name=name;
        this.age=age;
        this.height=height;

    }
    public void getInfo(){
        System.out.printf("这个人的名字是%s,%d岁，身高%d",this.name,this.age,this.height);}
    public static void main(String [] args){
        Person p=new Person("赵三",20,160);
        p.getInfo();

    }
}