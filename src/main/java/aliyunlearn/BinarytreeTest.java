package aliyunlearn;

class Member implements Comparable<Member>{
    private  String name;
    private  int age;
    public Member(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int compareTo(Member member){
        return this.age-member.age;
    }
}
class Binarytree<T extends Comparable<T>>{
    private class Node{
        private Comparable<T> data;
        private Node parent;
        private Node left;
        private Node right;
        public Node(Comparable<T> data){
            this.data=data;
        }
        public void AddNode(Node newnode){
            if(this.data.compareTo((T)newnode.data)<0){
                if(this.left==null){this.left=newnode;newnode.parent=this;}
                else {this.left.AddNode(newnode);}
            }
            if(this.data.compareTo((T)newnode.data)>0){
                if(this.right==null){this.right=newnode;newnode.parent=this;}
                else {this.right.AddNode(newnode);}
            }
        }
    }
    private Node root;
    private int count=0;
    public void addNode(Comparable<T> data){
        if(data==null)throw new NullPointerException("保存数据不能为空");
        Node newnode=new Node(data);
        if(root==null)root=newnode;
        else {this.root.AddNode(newnode);}
        count++;
    }
}
public class BinarytreeTest {
}
