package aliyunlearn;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Unsafeuse {
    public static void main(String [] args)throws Exception{
        Field field= Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe=(Unsafe) field.get(null);


    }

}
