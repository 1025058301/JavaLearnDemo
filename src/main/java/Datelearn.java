import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Datelearn {
    public static void main(String [] args){
        Date now=new Date();//无参数时取当前时间
        String s=now.toString();
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s2=sim.format(now);
        SimpleDateFormat sim2=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s3="2017/08/23 18:20:36";
        try{Date then=sim2.parse(s3);
        String s4=then.toString();
        System.out.print(s4);
        }
        catch (ParseException E){

        }
    }
}
