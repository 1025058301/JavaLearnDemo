package aliyunlearn;

public class Learnstatic{
    private static int count;
    public Learnstatic(){

        System.out.println("构造方法被调用了"+count+"次");
    }
    {count++;
        System.out.println("构造块被调用了"+count+"次");
    }
    public static void main(String [] args){
        Learnstatic learn=new Learnstatic();
        new Learnstatic();
        learn.count=0;
        new Learnstatic();
    }


}