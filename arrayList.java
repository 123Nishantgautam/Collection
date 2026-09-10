//package Colletion;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.List;


public class arrayList {
    
    public static void main(String[] args){

List<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Mango");
list.add("Cherry");
list.add("Date");
list.add("Papaya");
list.add("Papaya");


System.out.println("Array list is: "+ list);

list.remove("Banana");
System.out.println("Array after deletiong element: "+ list);

System.out.println("First element is: "+ list.getFirst());

System.out.println("Print 2nd index element: "+ list.get(2));

System.out.println("Remove last element: "+list.removeLast());

System.out.println("List is empty or not: "+list.isEmpty());

System.out.println("Remove 2nd index: "+ list.remove(2));

list.sort(null);

System.out.println("After sort list: "+list);

ArrayList<String> list2 = new ArrayList<>(list);

list2.add("Lichi");

System.out.println("Clounned list: "+list2);
    }
}
