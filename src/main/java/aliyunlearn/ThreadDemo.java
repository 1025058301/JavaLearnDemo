package aliyunlearn;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class Mythread implements Runnable{
    private String title;
    public Mythread(String title){
        this.title=title;

    }
    @Override
    public void run() {
        for(int x=0;x<=10;x++){
            System.out.println(this.title+":"+x);

        }
    }
}
class Cmythread implements Callable<String>{
    private String title;
    public Cmythread(String title){
        this.title=title;
    }

    public String call(){
        for(int i=0;i<=10;i++){
            System.out.println(this.title+i);
        }
        return "线程执行结束";
    }
}
public class ThreadDemo {
    public static void main(String [] args) throws Exception{
        //new Thread(new Mythread("线程A")).start();
        //new Thread(new Mythread("线程B")).start();
        //new Thread(new Mythread("线程C")).start();//使用Runnable接口实现多线程
        //FutureTask<String> futureTask=new FutureTask<>(new Cmythread("线程A"));
        //new Thread(futureTask).start();
        Thread mainthread=Thread.currentThread();

        new Thread(()->{
            for(int i=0;i<=100;i++){
                if(i==5) {
                    try {
                        mainthread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+":"+i);
                try{Thread.sleep(100);}
                catch (InterruptedException e){e.printStackTrace();}
            }
        },"副线程").start();
        for(int x=0;x<=50;x++){
            System.out.println("主线程执行："+x);
            Thread.sleep(100);
        }
    }


}
