import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {
    public static void main(String[] args ){
        Ticket ticket=new Ticket();
        new Thread(()->{
            ticket.sale();
        },"线程A").start();
        new Thread(()->{
            ticket.sale();
        },"线程B").start();
        new Thread(()->{
            ticket.sale();
        },"线程C").start();
        Random random=new Random();
    }
    public static int partition(int[] a,int s,int h){
        int temp=a[s];
        int i=s;
        int j=h;
        while (i<j){
            while (i<j&&a[j]>temp){
                j--;
            }
            a[i]=a[j];
            while (i<j&&a[i]<=temp){
                i++;
            }
            a[j]=a[i];
        }
        a[i]=temp;
        return i;
    }
    public static void quicksort(int[] a,int s,int h){
        if(s<h){
            int i=partition(a,s,h);
            quicksort(a,s,i-1);
            quicksort(a,i+1,h);
        }
    }
    public static void sift(int[] a,int low,int height){
        int temp=a[low];
        int i=low;
        int k=2*i+1;
        while (k<height){
            if(k+1<height&&a[k+1]>a[k]){
                k++;
            }
            if(a[k]>temp){
                a[i]=a[k];
                i=k;
                k=2*i+1;
            }else break;
        }
        a[i]=temp;
    }
    public static void heapsort(int[] a){
        for(int i=a.length/2-1;i>=0;i--){
            sift(a,i,a.length);
        }
        for(int i=a.length-1;i>=0;i--){
            int temp=a[i];
            a[i]=a[0];
            a[0]=temp;
            sift(a,0,i);
        }
    }
    public static void mergesoft(int[] a,int s,int h){
        if(s<h){
            int mid=s+(h-s)/2;
            mergesoft(a,s,mid);
            mergesoft(a,mid+1,h);
            merge(a,s,mid,h);
        }
    }
    public static void merge(int[] a,int s,int mid,int h){
        int[] temp=new int[h-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=h){
            if(a[i]>a[j]){
                temp[k++]=a[i++];
            }else {
                temp[k++]=a[j++];
            }
        }
        while (i<=mid){
            temp[k++]=a[i++];
        }
        while (j<=h){
            temp[k++]=a[j++];
        }
        for(int c=0;c<temp.length;c++){
            a[s++]=temp[c];
        }
    }

}
class Ticket{
    private int num=10;
    Lock lock=new ReentrantLock();
    public  void sale(){
        lock.lock();
        while (true){
            if(num<=0)break;
            System.out.println(num--+" "+Thread.currentThread().getName());
        }
        lock.unlock();
    }
}
