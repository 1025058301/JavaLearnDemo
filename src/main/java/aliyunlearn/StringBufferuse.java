package aliyunlearn;

public class StringBufferuse {
    public static void main(String[] args){
        StringBuffer stringBuffer=new StringBuffer();
        for(int i='a';i<='z';i++){
            stringBuffer.append((char)i);
        }
        stringBuffer.reverse().delete(0,5);
    }
}
