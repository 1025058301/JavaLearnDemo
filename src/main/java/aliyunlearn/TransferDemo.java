package aliyunlearn;

public class TransferDemo {
    public static void main(String [] args){
        String str="asbdkv123";
        char[] c=str.toCharArray();
        char c2=str.charAt(0);
        String str2="1234655";
        int i=Integer.valueOf(str2);
        int j=Integer.parseInt(str2);
        int a=Integer.valueOf(c2);
        char c3=(char)a;
        double d=32;
        String d1=String.valueOf(d);
        Runtime run=Runtime.getRuntime();
        System.out.print(run.availableProcessors());
        run.gc();
        int[] arr=new int[]{1,3,6,5,5,6,8};
        String v=arr.toString();
    }

}
