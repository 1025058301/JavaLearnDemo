package aliyunlearn;

class Message{
    private String info;
    public Message(String info){
        this.info=info;
    }
    public String getInfo(){
        return this.info;
    }
}
class Transfer{
    private static final ThreadLocal<Message> threadLocal=new ThreadLocal<Message>();
    public static void setMessage(Message m){
        threadLocal.set(m);
    }
    public static void sendMessge(){
        System.out.println(Thread.currentThread().getName()+":"+threadLocal.get().getInfo());
    }

}
public class ThreadLocalDemo {
    public static void main(String[] args){
        new Thread(()->{
            Message A=new Message("消息A");
            Transfer.setMessage(A);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Transfer.sendMessge();
            },"线程A").start();
        new Thread(()->{
            Message A=new Message("消息B");
            Transfer.setMessage(A);
            Transfer.sendMessge();
        },"线程B").start();
        new Thread(()->{
            Message A=new Message("消息C");
            Transfer.setMessage(A);
            Transfer.sendMessge();
        },"线程C").start();
    }
}
