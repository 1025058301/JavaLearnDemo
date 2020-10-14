package aliyunlearn;
/*1) 洗牌算法：对52张牌洗牌，要求尽量洗乱，而且原牌不能在原位置上重复
        void ShuffleArray(int array[], int len)

        2) 现在有n个微信群，每个群里面有2到m个人，设计一个数据结构存储这些信息，要求该结构能快速找出每一个人所在的所有的群Id。

        3) 数组a[N]，存放了数字1至N-1，其中某个数字重复一次。写一个函数，找出被重复的数字。时间复杂度必须为O(N), 空间复杂度不能是O[N]。 函数原型：
        int find(int a[], int N)

        4) 现在有一个微信群，里面有n个人，每个人的id用整数int标示，现在要求找出id是对称数字的人出来，如3， 121， 12321。 请实现改查找函数，不能把整数转为字符串来判断。
        //返回 1：对称； 0： 不对称
        int ismirror(int value)

        5) 给定一个字符串，如“1234”，请实现一个函数，把这个字符串转成10进制整型，不能用系统函数
        int atoi(char *str)

        6) 有一个二叉树，每个节点的值是一个整数。写一个函数，判断这棵树中是否存在从根到叶子节点的一个路径，这个路径上所有节点之和为某一个值。存在返回1， 否则返回0。
        struct TreeNode
        {
        int value;
        struct TreeNode *left, *right;
        };
        int haspath(struct TreeNode *root, int value)*/
class TreeNode1{
    int value;
    TreeNode left;
    TreeNode right;
}

public class TESTGO {
    public static int sum=0;
    public static boolean have=false;
    public static int haspath(TreeNode root,int value){
        findleave(root,value);
        if(have)return 1;
        else return 0;

    }
    public static void findleave(TreeNode  node,int value){
        if(node!=null)sum+=node.val;
        findleave(node.left,value);
        findleave(node.right,value);
        if(node.left==null||node.right==null){have=true;}
        sum-=node.val;
    }
    public static int atoi(String str){
        char[] chars=str.toCharArray();
        int sum=0;
        for(int i=0;i<chars.length;i++){
            sum+=Integer.parseInt(String.valueOf(chars[chars.length-i-1]))*(int)Math.pow(10,chars.length-i-1);
        }
        return sum;//
    }
    public static void ShuffleArray(int array[], int len){


    }
}
