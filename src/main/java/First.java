import java.util.ArrayList;
import java.util.LinkedList;

public class First {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        int x = 2;
        boolean isFind = false;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == x) {
                System.out.println(i);
                isFind = true;
                break;
            }
        }
    if (isFind == false)
        System.out.println("нет такого числа");

    arrayList.remove(0);

    // а теперь ЛинкедЛист

        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('$');
        linkedList.add('%');
        linkedList.add('#');

        int y = '%';
        boolean isFind2 = false;

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == y) {
                System.out.println(i);
                isFind2 = true;
                break;
            }
        }
    if (isFind2 == false)
        System.out.println("нет такого символа");

    linkedList.remove(2);


    }
}
