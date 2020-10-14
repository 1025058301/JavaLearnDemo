import java.util.Random;
import java.util.Scanner;

public class Format {
    public String getrandomString(){
        String a="";
        Random random=new Random();
        int limit=0;
        while(limit<5){
            int i2=random.nextInt(75)+48;
            char c=(char)i2;
            if(Character.isDigit(c)||Character.isLetter(c)){
                a=a+c;
                limit++;
            }


        }
        return a;

    }//创建长度为5的随机字符串
    public String[] getStringarray(){
        String [] s=new String[8];
        for(int i=0;i<8;i++){
            s[i]=getrandomString();
        }
        return s;
    }//创建长度为8的字符串数组，以长度为5的随机字符串填充
    public String[] compareandExchange(String[] s){
        int length=s.length;
        String temp;
        for(int i=0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                if(s[i].compareToIgnoreCase(s[j])>0){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        return s;
    }//比较传入字符串数组中值的首字符大小，按从小到大重新进行排列
    public static void main(String[] args){
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("请依次输入地名，公司类型，公司名，老板名，金额，产品，价格计量单位，以;或空格分隔");
        String s = scanner.next();
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        String s4 = scanner.next();
        String s5 = scanner.next();
        String s6 = scanner.next();
        System.out.printf("%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一百多、两百多、三百多的钱包，现在全部只卖二十块，统统只要二十块!黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!",s,s1,s2,s3,s4,s5);
        char[] c={'a','v','c','d'};
        for(char each:c){
        Character c2=each;
        if(Character.isLowerCase(c2)){
            System.out.print(each);
        }
        }*/
        Format f=new Format();
        String [] s=f.getStringarray();
        String [] s2=f.compareandExchange(s);

    }
}
