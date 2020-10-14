
public class Hero {
    String Name;
    int Blood =10;
    int hujia =20;
    private  Hero(){

    }
    private static Hero instance;
    public static Hero getInstance(){
     if(null==instance) {  instance=new Hero();}
     return instance;
    }
    /*private static Hero instance=new Hero();
    public static Hero getinstance(){
    return instance;
    }
     */
    public static void main(String [] args){
        Hero gailun=Hero.getInstance();
        HeroType t=HeroType.BAOLAN;
        for(HeroType type:HeroType.values()){
            System.out.println(type);
        }

    }
}//饱汉式单例模式 饿汉式单例模式
