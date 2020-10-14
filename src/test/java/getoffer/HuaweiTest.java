package getoffer;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HuaweiTest {

    @Test
    void calculateTime() {
        Huawei huawei=new Huawei();
        String s="abcdefghijklmnopqrstuvwxyz";
        String word="cba";
        Assert.assertEquals(huawei.calculateTime(s,word),4);
    }

    @org.junit.jupiter.api.Test
    void isK() {
    }
}