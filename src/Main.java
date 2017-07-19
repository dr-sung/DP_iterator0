
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

// Java Library uses Iterator Design pattern to provide
// polymorphic access to the collection types.

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("fourth");
        arrayList.add("fifth");
        Iterator iter1 = arrayList.iterator();
        System.out.print("ArrayList: ");
        while (iter1.hasNext()) {
            System.out.print(iter1.next() + " ");
        }
        System.out.println();

        Stack stack = new Stack();
        stack.add("first");
        stack.add("second");
        stack.add("third");
        stack.add("fourth");
        stack.add("fifth");
        Iterator iter2 = stack.iterator();
        System.out.print("Stack: ");
        while (iter2.hasNext()) {
            System.out.print(iter2.next() + " ");
        }
        System.out.println();

        LinkedList linkedList = new LinkedList();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("fourth");
        linkedList.add("fifth");
        Iterator iter3 = linkedList.iterator();
        System.out.print("LinkedList: ");
        while (iter3.hasNext()) {
            System.out.print(iter3.next() + " ");
        }
        System.out.println();

        PriorityQueue queue = new PriorityQueue();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
        queue.add("fifth");
        Iterator iter4 = queue.iterator();
        System.out.print("Queue: ");
        while (iter4.hasNext()) {
            System.out.print(iter4.next() + " ");
        }
        System.out.println();

        HashMap<String, Object> map = new HashMap<>();
        map.put("key1", new Integer(1));
        map.put("key2", new Double(3.14));
        map.put("key3", new Boolean(true));
        map.put("key4", new Character('c'));
        map.put("key5", new Integer(100));
        map.put("key6", new Float(2.7145));
        Iterator iter5 = map.keySet().iterator();
        System.out.print("HashMap: ");
        while (iter5.hasNext()) {
            Object key = iter5.next();
            System.out.print(key + "=" + map.get(key) + " ");
        }
        System.out.println();
    }

}
