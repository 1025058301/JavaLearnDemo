package aliyunlearn;

public class TestExtends {
    public static void main(String[] args){
        TestExtends testExtends=new TestExtends();
        testExtends.go();
    }
    private void go(){

    }
}
class A{
    public void doSomeThing(){
        System.out.println("FARTHER CLASS DO THIS");
    }
}
class B extends A{
    public void doSomeThing(){
        System.out.println("CHILD CLASS DO THIS");
    }
    public void doOtherThing(){

    }
}
