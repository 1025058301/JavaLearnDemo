import java.util.Scanner;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Val {

    public static int [] selectsoft(int []a){//选择排序
        int b=a.length;
        int temp=0;
        for(int i=0;i<b-1;i++){
            for(int j=i+1;j<b;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static void xianxv(TreeNode root){
        TreeNode p=root;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                System.out.println(p.val);
                stack.push(p);
                p=p.left;
            }
            if(stack!=null){
                p=stack.pop();
                //System.out.println(p.data);中序遍历
                p=p.right;
            }
        }

    }
    public static int[] bubblesoft(int []a){
        int l=a.length;
        int temp =0;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static int[] insertsoft(int [] a){
        int length=a.length;
        int tmp=0;
        int j=0;
        for(int i=0;i<length-1;i++){
            if(a[i]<a[i+1]){
                tmp=a[i+1];
                j=i;
                do{
                    a[j+1]=a[j];
                    j--;
                }while(j>=0&&a[j]<tmp);
                a[j+1]=tmp;
            }
        }

        return a;
    }
    public static int[] binaryinsertsort(int []a){
        int length=a.length;
        int high,low,mid=0;
        int tmp=0;
        for(int i=1;i<length;i++){
            if(a[i-1]<a[i]){
                tmp=a[i];
                low=0;
                high=i-1;
                while(low<=high){
                    mid=(low+high)/2;
                    if(a[mid]<tmp){high=mid-1;}
                    if(a[mid]>=tmp){low=mid+1;}
                }
                for(int j=i-1;j>=low;j--){
                    a[j+1]=a[j];
                }
                a[low]=tmp;
            }
        }
        return a;
    }
    public static int[] shellsoft(int [] a){
        int length=a.length;
        int tmp=0;
        int d=length/2;
        int j=0;
        while(d>0){
            for(int i=d;i<length;i++){
                tmp=a[i];
                j=i-d;
                while (j>=0&&tmp<a[j]){
                    a[j+d]=a[j];
                    j=j-d;
                }
                a[j+d]=tmp;
            }
            d=d/2;

        }

    return a;

    }
    public static int partition(int []a,int s,int h){
        int temp=a[s];
        int i=s,j=h;
        while(i<j){
            while(j>i&&a[j]<=temp){
                j--;
            }
            a[i]=a[j];
            while(j>i&&a[i]>temp){
                i++;
            }
            a[j]=a[i];

        }
        a[i]=temp;
        return i;

    }

    /**
     * 左程云算法课程使用的方法
     * @return
     */
    public static int partition_2(int [] a,int s,int h){
        int temp =a[h];
        //less的意思是小于等于区域的右边界
        int less=s-1;
        for(int i=s;i<=h;i++){
            if(a[i]<=temp){
                swap(a,++less,i);
            }
        }
        return less;
    }

    public static void quicksort(int []a,int s,int h){
        int i=0;
        if(s<h){
            i=partition_2(a,s,h);
            quicksort(a,i+1,h);
            quicksort(a,s,i-1);
        }
    }
    public static int getN(int[]a,int low,int height,int n){
        int i=low;
        int j=height;
        int temp=a[i];
        while (i<j){
            while (i<j&&a[j]>=temp){
                j--;
            }
            a[i]=a[j];
            while ((i<j&&a[i]<temp)){
                i++;
            }
            a[j]=a[i];
        }
        a[i]=temp;
        if(i==n-1){
            return a[i];
        }else if(i<n-1){
            return getN(a,i+1,height,n);
        }else {
            return getN(a,low,i-1,n);
        }
    }
    public static void sift(int []a,int low,int heght){
        int i=low;int k=2*i+1;
        int tmp=a[i];
        while(k<heght){
            if(k+1<heght&&a[k+1]>a[k]){
                k++;
            }
            if(tmp<a[k]){
                a[i]=a[k];
                i=k;
                k=k*2+1;
            }else {
                break;
            }
        }
        a[i]=tmp;
    }
    public static void heapsort(int [] a){
        for(int i=a.length/2-1;i>=0;i--){
            sift(a,i,a.length);
        }
        for (int j=a.length-1;j>0;j--){
            int tmp=a[j];
            a[j]=a[0];
            a[0]=tmp;
            sift(a,0,j);
        }
    }
    public static void mergesort(int[] a,int low,int high){//归并排序
        if(low<high){
            int mid=(low+high)>>1;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int[] a,int low,int mid,int high){
        int[] tmp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=high){
            if(a[i]<=a[j]){
                tmp[k++]=a[i++];
            }else {
                tmp[k++]=a[j++];
            }
        }
        while (i<=mid){
            tmp[k++]=a[i++];
        }
        while (j<=high){
            tmp[k++]=a[j++];
        }
        for (int value : tmp) {
            a[low++] = value;
        }
    }
    public static void swap(int[] arr,int val1,int val2){
        int temp=arr[val1];
        arr[val1]=arr[val2];
        arr[val2]=temp;
    }
    public static void main(String[] args){

       int [] a={3,5,1,4,2,7,5,12,36,6,4,85,4};
       quicksort(a,0,a.length-1);
    }
}
