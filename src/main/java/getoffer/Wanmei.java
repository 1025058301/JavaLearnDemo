package getoffer;

public class Wanmei {
    //在网络游戏中，击杀BOSS会爆出大量珍贵道具，但由于玩家的背包容量有限
    // ，不能保证所有道具都可以被拾取，因此需要根据道具体积和价值进行取舍。
    // 假设背包容量固定，且BOSS被击杀后掉落的道具体积及价值随机，如何选择道具放入背包，
    // 才能保证背包内的道具总价值最大（道具重量不考虑）。

    public static int getMaxvalue(int[] weight,int[] values,int capacity){
        int[][] dp=new int[weight.length+1][capacity+1];//dp数组
        for(int i=1;i<=weight.length;i++){
            for(int j=1;j<=capacity;j++){
                if(j<weight[i-1]){
                    dp[i][j]=dp[i-1][j];
                }else {
                    int before=dp[i-1][j];
                    int now=values[i-1]+dp[i-1][j-weight[i-1]];
                    dp[i][j]= Math.max(before,now);
                }
            }
        }
        return dp[weight.length][capacity];
    }

    public static void main(String[] args){
        int [] weight={1,3,4,5,2};
        int [] values={6,5,3,4,7};
        int a=getMaxvalue(weight,values,12);
    }




    /*在游戏设计中，为了方便玩家完成任务，一般都会提供自动寻路功能。假设在某个游戏中，一共有6个区域，
    这些区域之间满足以下条件：

            1. 任意两个区域之间不一定可以直接到达

2. 路线是单向的，即如果V1可直接到V2，那么V2不可直接到V1

    请设计一个程序，能够计算出V1到其他各个区域的最短时间。*/
}
