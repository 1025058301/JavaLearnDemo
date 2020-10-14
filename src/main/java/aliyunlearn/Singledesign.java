package aliyunlearn;
class singelclass{
    private static singelclass instance=null;
    private  singelclass(){
        System.out.println("构造方法被调用");
    }
    public static singelclass getinstance(){
        if(instance==null){
            synchronized (singelclass.class){
                if(instance==null){
            instance=new singelclass();}
            }
        }
        System.out.println(Thread.currentThread().getName());
        return instance;
    }
}
public class Singledesign {
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            new Thread(()->{singelclass.getinstance();},i+"个线程").start();
        }
    }
}
