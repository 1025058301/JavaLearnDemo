package aliyunlearn;

public class Emp {
    private long empnumber;
    private String ename;
    private int salary;
    private int age;
    public Emp(){

    }
    public Emp(long empnumber){
        this.empnumber=empnumber;
    }
    public Emp(long empnumber,String ename){
        this.empnumber=empnumber;
        this.ename=ename;
    }
}
