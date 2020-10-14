package aliyunlearn;

interface Igraph{
    public void  paint();
}
class Point{
    private double x;
    private double y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return this.x;}
    public double getY(){
        return this.y;}

}
class Triangle implements Igraph{
    private Point s1;
    private Point s2;
    private Point s3;
    public Triangle(Point s1,Point s2,Point s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public void paint(){
        System.out.println("三角形第一个点的坐标为：("+this.s1.getX()+","+this.s1.getY()+")");
        System.out.println("三角形第二个点的坐标为：("+this.s2.getX()+","+this.s2.getY()+")");
        System.out.println("三角形第三个点的坐标为：("+this.s3.getX()+","+this.s3.getY()+")");
    }}
class Circle implements Igraph{
    private double r;
    private Point centre;
    public Circle(double r,Point centre){
        this.r=r;
        this.centre=centre;
    }
    public void paint(){
        System.out.println("以("+this.centre.getX()+","+this.centre.getY()+")为圆心，半径为"+this.r+"画圆");
    }
}
class Factory{
    public static Igraph getInstance(String className,double ... args){
        if("triangle".equalsIgnoreCase(className)){
            return new Triangle(new Point(args[0],args[1]),new Point(args[2],args[3]),new Point(args[4],args[5]));}
        if("circle".equalsIgnoreCase(className)){
            return new Circle(args[0],new Point(args[1],args[2]));}
        else return null;
    }
}
public class PaintDemo{
    public static void main(String args[]){
        Igraph g1=Factory.getInstance("triangle",1,1,2,2,3,3);
        Igraph g2=Factory.getInstance("circle",4,1,1);
        g1.paint();
        g2.paint();

    }
}



