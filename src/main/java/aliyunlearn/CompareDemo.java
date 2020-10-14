package aliyunlearn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class Phone implements Comparable<Phone>{
    private String name;
    private int money;
    public Phone(String name,int money){
        this.name=name;
        this.money=money;
    }
    public String getInfo(){
        return "手机名"+this.name+"，手机的价格"+this.money;
    }
    public int compareTo(Phone phone){
        return this.money-phone.money;
    }
}
class Fish{
    private String name;
    private int price;
    public Fish(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getInfo(){
        return "鱼的种类："+this.name+"，鱼的价格："+this.price;
    }
    public int getPrice(){
        return  this.price;
    }
}
class FishCompare implements Comparator<Fish>{
    public int compare(Fish A,Fish B){
        return A.getPrice()-B.getPrice();
    }
}
public class CompareDemo {
    public static void main(String [] args){
        Phone[] phones={new Phone("华为",5000),new Phone("苹果",8000),new Phone("小米",3000)};
        Arrays.sort(phones);
        for(Phone p:phones){
            System.out.println(p.getInfo());
        }
        Fish [] fishs={new Fish("太阳鱼",50),new Fish("鲸鱼",2000),new Fish("乌贼",60)};
        Arrays.sort(fishs,new FishCompare());
        for(Fish f:fishs){
            System.out.println(f.getInfo());
        }
        String str="abc";

    }

}
