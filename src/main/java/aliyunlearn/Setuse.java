package aliyunlearn;

import java.util.*;

public class Setuse {
    public static void main(String[] args){
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("LCY");
        treeSet.add("mvk");
        treeSet.add("abc");

        Iterator<String> iterator=treeSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
        List<String> list= new ArrayList<>();
        list.add("你好");
        list.add("wuliao");
        list.add("asas");
        ListIterator<String> listIterator=list.listIterator();
       /* while (listIterator.hasNext()){
            System.out.print(listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous());
        }*/

    }
}
