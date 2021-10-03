import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Integer a = 3;
        Integer b = 4;
        Integer c = 5;

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);


//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        linkedList.remove(1);
        arrayList.remove(0);

        System.out.println(linkedList.indexOf(c));
        System.out.println(arrayList.indexOf(b));



    }
}
