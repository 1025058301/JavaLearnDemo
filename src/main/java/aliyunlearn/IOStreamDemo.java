package aliyunlearn;
import java.io.*;

public class IOStreamDemo {
    public static void main(String []args)throws Exception{
        File file=new File("E:"+File.separator+"ouput.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
       /* OutputStream  outputStream=new FileOutputStream(file);
        String s="i will get offer and oneday i will get the highest mountain can you believe it my bro keep going ";
        outputStream.write(s.getBytes());
        outputStream.flush();
        outputStream.close();
        InputStream inputStream=new FileInputStream(file);
        byte[] bytes=new byte[1024];
        int len=inputStream.read(bytes);
        System.out.print(new String(bytes,0,len));
        inputStream.close();*/
       Writer writer=new FileWriter(file);
       writer.write("你好中国");
       writer.close();
    }

}
