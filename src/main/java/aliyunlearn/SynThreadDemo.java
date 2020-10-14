package aliyunlearn;

class Tiket implements Runnable{
    private  int tikets=10;
    public void   run(){
        synchronized (this){
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(tikets>0) System.out.println(Thread.currentThread().getName()+"剩余票数"+tikets--);
               else break;
            }

    }}
}
public class SynThreadDemo {
    public static void main(String [] args){
        Tiket tiket=new Tiket();
        new Thread(tiket,"票贩子A").start();
        new Thread(tiket,"票贩子B").start();
        new Thread(tiket,"票贩子C").start();
    }
}
