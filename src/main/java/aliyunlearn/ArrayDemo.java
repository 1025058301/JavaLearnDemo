package aliyunlearn;

public class ArrayDemo{
    public static void showArray(int [] array){
        System.out.print("数组内容是：");
        for(int a:array){
            System.out.print(" "+a);
        }
        System.out.println();
    }
    public static void showArray(int [] [] array){
        System.out.println("数组的内容是");
        for(int[] a:array){
            for(int b:a){
                System.out.print(" "+b);
            }
            System.out.println();
        }
    }
    public static void arraytrans(int [][] array){//二维数组转置
        int row=array.length;
        int column=array[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column/2;j++){
                int temp=array[i][j];
                array[i][j]=array[row-i-1][column-j-1];
                array[row-i-1][column-j-1]=temp;
            }
        }
    }
    public static void main(String [] args){
        int []A=new int[]{1,2,3,4,5};
        ArrayDemo.showArray(A);
        int [][] B=new int[][] {{1,2,3,4,5,6,7},{7,6,5,4,3,2,1},{1,2,3,4,5,6,7}};
        ArrayDemo.showArray(B);
        ArrayDemo.arraytrans(B);
        ArrayDemo.showArray(B);

    }

}