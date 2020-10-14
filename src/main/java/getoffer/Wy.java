package getoffer;

public class Wy {
    public static void main(String[] args){
        String s=compress("d");
            int c=Integer.MAX_VALUE;
    }
    public static String compress (String raw_str) {
        StringBuffer stringbuffer=new StringBuffer();
        int length=0;
        for(int i=0;i<raw_str.length();i++){
            if(i==0){
                length++;
            }else{
                if(raw_str.charAt(i)==raw_str.charAt(i-1)){
                    length++;
                    if(length==55){
                        stringbuffer.append("0Z"+raw_str.charAt(i));
                        length=1;
                        i++;
                    }
                }else{
                    if(length<4){
                        for(int j=0;j<length;j++){
                            stringbuffer.append(raw_str.charAt(i-1));
                        }
                        length=1;
                    }else{
                        stringbuffer.append(0);
                        char c=(char)(length-4+'a');
                        stringbuffer.append(c);
                        stringbuffer.append(raw_str.charAt(i-1));
                        length=1;
                    }
                }
            }
        }
        if(length==1){
            stringbuffer.append(raw_str.charAt(raw_str.length()-1));
        }else{
            if(length<4){
                for(int i=0;i<length;i++){
                    stringbuffer.append(raw_str.charAt(raw_str.length()-1));
                }
            }else{
                stringbuffer.append(0);
                char c=(char)(length-4+'a');
                stringbuffer.append(c);
                stringbuffer.append(raw_str.charAt(raw_str.length()-1));
            }
        }
        return new String(stringbuffer);
    }
}
