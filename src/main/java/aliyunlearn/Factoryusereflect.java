package aliyunlearn;
class Factoryy{
    public static <T> T getInstance(String classname,Class<T> clazz){//使用泛型使得工厂类可以返回任何类型接口的对象
        T instance=null;
        try {
            instance=(T)Class.forName(classname).newInstance();//使用反射使得接口子类增加时工厂类无需变化
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return instance;
    }

}
public class Factoryusereflect {
}
