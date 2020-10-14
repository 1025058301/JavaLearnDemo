import java.util.*;

public class Shopee {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        Set<Map.Entry<Integer,Integer>> set=hashMap.entrySet();
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int before=0;
        int count=0;
        int max=0;
        int[] arr=new int[m];
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<m;i++){
            arr[i]=scanner.nextInt();
            hashSet.add(arr[i]);
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int j=0;j<m;j++){
            for(int k=before+1;k<arr[j];k++){
                if(count==(n-m))break;
                if(!hashSet.contains(k)){
                    System.out.print(k+" ");
                    hashSet.add(k);
                    count++;
                }
            }
            before=arr[j];
            System.out.print(arr[j]+" ");
        }
        if(count<n-m){
            for(int i=0;i<n-m-count;i++){
                System.out.print(max+1+i);
            }
        }
    }

}
