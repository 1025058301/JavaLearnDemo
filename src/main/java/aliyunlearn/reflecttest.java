package aliyunlearn;

public class reflecttest {
    public static void main(String[] args)throws Exception{
        Person lee=new Person();
        System.out.print(lee.getClass());//1
        Class<?> p=lee.getClass();
        System.out.print(p.getName());
        Class<?> p2=Person.class;//2
        Class<?> p3=Class.forName("aliyunlearn.Person");//3
        Object yu=p.getDeclaredConstructor().newInstance();
        System.out.print(p.getSuperclass().getName());

    }
}
