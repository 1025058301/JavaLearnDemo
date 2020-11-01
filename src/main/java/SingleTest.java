public class SingleTest {
public static int index=0;
public static TreeNode res=null;
public static void main(String [] args){

int a=movingCount(5,10,10);
}
    public static int sum=0;
    public static int movingCount(int threshold, int rows, int cols){
        int[][] state=new int[rows][cols];
        move(threshold,rows,cols,0,0,state);
        return sum;
    }
    public static void move(int threshold,int rows,int cols,int currow,int curcol,int[][] state){
        if(currow<0||currow>=rows||curcol<0||curcol>=cols)return;
        if(state[currow][curcol]==1)return;
        int val=0;
        int i=currow;
        int j=curcol;
        while(i!=0){
            val+=i%10;
            i=i/10;
        }
        while(j!=0){
            val+=j%10;
            j=j/10;
        }
        sum++;
        state[currow][curcol]=1;
        move(threshold,rows,cols,currow+1,curcol,state);
        move(threshold,rows,cols,currow-1,curcol,state);
        move(threshold,rows,cols,currow,curcol+1,state);
        move(threshold,rows,cols,currow,curcol-1,state);
    }

}
