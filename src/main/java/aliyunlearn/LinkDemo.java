package aliyunlearn;

interface ILink<T>{
    public void add (T t);
    public int size();
    public boolean isNull();
    public Object[] toArray();
    public T getValue(int index);
    public boolean contain(T data);
    public boolean changeValue(int index,T newvalue);
    public boolean delete(int index);
    public boolean delete(T data);
    public void clean();
}
class ILinkImpl<T> implements ILink<T>{
    private class Node{
        private T data;
        private Node next;
        public Node(T data){
            this.data=data;
        }
        public void addNode(Node newnode){
            if(this.next==null){this.next=newnode;}
            else{this.next.addNode(newnode);}
        }
        public void toARRAY(){
            ILinkImpl.this.returnData[ILinkImpl.this.foot++]=this.data;
            if(this.next!=null){this.next.toARRAY();}
        }
        public T value(int index){
            if(ILinkImpl.this.foot++==index){return this.data;}
            return this.next.value(index);
        }
        public boolean change(int index,T newvalue){
            if(ILinkImpl.this.foot++==index){this.data=newvalue;return true;}
            return this.next.change(index,newvalue);
        }
        public boolean cotainNode(T data){
            if(data.equals(this.data)){return true;}
            else{if(this.next==null){return false;}
            else{return this.next.cotainNode(data);}
            }}
        public boolean datadelete(T data){
            if(this.next.data==null){return false;}
            if(data==this.next.data){this.next=this.next.next;ILinkImpl.this.count--;return true;}
            return this.next.datadelete(data);
        }
        public boolean indexdelete(int index){
            if(++ILinkImpl.this.foot==index){this.next=this.next.next;ILinkImpl.this.count--;return true;}
            return this.next.indexdelete(index);
        }
    }
    private int foot;
    private Object[] returnData;
    private int count;
    private Node root;
    public void add(T t){
        if(t==null){return ;}
        Node newnode=new Node(t);
        if(this.root==null){this.root=newnode;}
        else{this.root.addNode(newnode);}
        this.count++;
    }
    public int size(){
        return this.count;
    }
    public boolean isNull(){
        if(this.root==null){return true;}
        return false;
    }
    public Object[] toArray(){
        if(this.root==null){return null;}
        this.foot=0;
        this.returnData=new Object[this.count];
        this.root.toARRAY();
        return this.returnData;
    }
    public T getValue(int index){
        if(index>=this.count){return null;}
        this.foot=0;
        return this.root.value(index);
    }
    public boolean changeValue(int index,T newvalue){
        if(index>=this.count){return false;}
        this.foot=0;
        return this.root.change(index,newvalue);
    }
    public boolean contain(T data){
        if(data==null){return false;}
        return this.root.cotainNode(data);
    }
    public boolean delete(T data){
        if(!this.contain(data)){return false;}
        if(data==this.root.data&&this.root.next!=null){
            this.root=this.root.next;
            this.count--;
            return true;}
        return this.root.datadelete(data);
    }
    public boolean delete(int index){
        if(index>=count){return false;}
        if(index==0){this.root=this.root.next;
            this.count--;
            return true;}
        this.foot=0;
        return this.root.indexdelete(index);
    }
    public void clean(){
        if(this.root!=null){
            this.root=null;}
    }
}


public class LinkDemo{
    public static void main(String [] args){
        ILinkImpl<String> iLink=new ILinkImpl<String>();
        iLink.add("go");
        iLink.add("no");
        iLink.add("do");
        iLink.add("yo");
        System.out.println(iLink.getValue(3));
        System.out.println("转换的Object数组长度为"+iLink.toArray().length);
        System.out.println(iLink.size()+" "+iLink.isNull());
        System.out.println("转换之前索引为2的值"+iLink.getValue(2)+"。");
        iLink.changeValue(2,"handsomeboy");
        System.out.println("转换之后索引为2的值"+iLink.getValue(2)+"。");
        System.out.println("链表中包含值为yo的节点吗"+iLink.contain("yo"));
        iLink.delete(1);
        System.out.println(iLink.getValue(1));

    }
}