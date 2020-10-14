import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Node{
    public int val;
    public Node next;
}
public class UsePriorityQueue {
    public static void main(String [] args){
        PriorityQueue<Integer> heap=new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        TreeSet<Node> set=new TreeSet<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return 0;
            }
        });
        heap.add(1);
        heap.add(5);
        heap.add(9);
        int a=heap.peek();
        ArrayList<Integer> list=new ArrayList<>(heap);

    }
    //public void topK(int[])
}
