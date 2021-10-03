public class MyLinkedList<T> {

    Node<T> first;
    Node<T> last;
    private int size = 0;

    void add(T element) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, element, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public T get(int index) {
        return node(index).item;
    }

    public boolean remove(int index) {
        if (index < size) {
            Node<T> x = node(index);
            final T element = x.item;
            final Node<T> next = x.next;
            final Node<T> previous = x.previous;

            if (previous == null) {
                first = next;
            } else {
                previous.next = next;
                x.previous = null;
            }

            if (next == null) {
                last = previous;
            } else {
                next.previous = previous;
                x.next = null;
            }

            x.item = null;
            size--;
            return true;
        }
        return false;
    }

    private Node<T> node(int index) {
        if (index < size) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        }
        return null;
    }

    public T set(int index, T element) {
        if (index < size) {
            Node<T> x = node(index);
            T old = x.item;
            x.item = element;
            return old;
        }
        return null;
    }


    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> previous;

        Node(Node<T> previous, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.previous = previous;
        }
    }
}
