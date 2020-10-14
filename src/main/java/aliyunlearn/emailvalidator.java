package aliyunlearn;

public class emailvalidator {
    public static boolean isemail(String email){
        String regex="\\w+@\\w+\\.\\w+";
        return email.matches(regex);
    }


}
