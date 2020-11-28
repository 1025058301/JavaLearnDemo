public class Threadprint {
    public static volatile int num=0;
    public static boolean canPrint=true;
    public static Object lock=new Object();
    public static void main(String [] args){
        new Thread(()->{
            synchronized (lock){
            while (num<99){
                if(!canPrint){
                    try {
                        lock.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+" "+(++num));
                canPrint=!canPrint;
                lock.notify();
            }
        }},"线程A").start();
        new Thread(()->{
            synchronized (lock){
                while (num<99){
                    if(canPrint){
                        try {
                            lock.wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+" "+(++num));
                    canPrint=!canPrint;
                    lock.notify();
                }
            }},"线程B").start();
    }
}
