package aliyunlearn;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Setusereflect {
    public static void main(String[] args)throws Exception{
        Duck duck=ClassInstacnFactory.getInstance(Duck.class,"name:丑小鸭|age:18|color:yellow");


    }
}
class ClassInstacnFactory{
    public static <T> T getInstance(Class<T> clazz,String value)throws Exception{

        T instance=clazz.getDeclaredConstructor().newInstance();

        String[] strings=value.split("\\|");
        for(String s:strings){
            String[] keyvalue=s.split(":");
            String methodname="set"+keyvalue[0].substring(0,1).toUpperCase()+keyvalue[0].substring(1,keyvalue[0].length());
            try{
            Field field=clazz.getDeclaredField(keyvalue[0]);
            Method method=clazz.getMethod(methodname,field.getType());
            method.invoke(instance,keyvalue[1]);}
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return instance;
    }
}
class Duck{
    private String name;
    private String age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}