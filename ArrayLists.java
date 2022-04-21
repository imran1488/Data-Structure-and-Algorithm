import java.util.ArrayList;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(4);
        list.add(3);
        System.out.println(list);
        int ele = list.get(0);
        System.out.println(ele);
        list.add(1, 1);
        System.out.println(list);
        list.set(0, 3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

}
