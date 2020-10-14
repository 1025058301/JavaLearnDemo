public class Bike extends Transportation implements Run {
    public Bike(int v,int h,int w){
        super(v,h,w);
    }
    public void runwithwhat(){
        System.out.println("this is bike");
    }
    public static void main(String[] args){
        Bike bike=new Bike(10,10,10);
        System.out.println("sahiaf");
        String str="";
        str=str+2;
        str=str+1;
        String str2="";
        str2+=10;
        str2+=20;
        int num=50;
        num=num++*2;
        boolean flag = 10%2 == 1 && 10 / 3 == 0 && 1 / 0 == 0 ;
        System.out.println(bike.toString());
        String s="自豪哥使用%s击败了%d个敌人，拿到了s8%s的冠军";
        System.out.printf(s,"薇恩",8,"总决赛");
    }
}