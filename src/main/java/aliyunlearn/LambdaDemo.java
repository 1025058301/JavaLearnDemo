package aliyunlearn;

interface IMath<T>{
    public abstract int add(T a,T b);
}
interface IString<P,R>{
    public abstract R getValue(P p);
}
interface IConstruct<P1,P2>{
    public abstract Basketball newBasketball(P1 p1,P2 p2);
}
class Basketball{
    private double r;
    private String pingpai;
    public Basketball(double r,String pingpai){
        this.r=r;
        this.pingpai=pingpai;
    }
    public String getInfo(){
        return "球的半径是"+r+"球的品牌是"+pingpai;
    }
}
public class LambdaDemo{
    public static void main(String [] args){
        IMath<Integer> math=(a,b)->a+b;//Lambda表达式初试牛刀
        System.out.println(math.add(10,20));
        IString<Integer,String> s=String::valueOf;//引用静态方法
        String str=s.getValue(100);
        System.out.println(str);
        IConstruct<Double,String> con=Basketball::new;//引用构造方法
        Basketball myball=con.newBasketball(10.0,"斯伯丁");
        System.out.println(myball.getInfo());
    }
}