package aliyunlearn;
interface Pet{
    public String getName();
    public String getColor();
}
public class Petshop {
    static int i;
    public static void main(String[] args){
        ILinkImpl<Pet> Petshop=new ILinkImpl<Pet>();
        System.out.print(i);

    }

}
