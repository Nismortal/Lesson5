public class MyArrayList<T> {
    private Object[] array = new Object[10];
    private int size = 0;

    public void add(T x) {
        if (array.length - 1 == size) {
            resize(size + size / 2);
        }
        array[size++] = x;
    }

    private void resize(int newLength) {

        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }

    public T set(int index, T element) {
        if (index < size) {
            T old = get(index);
            array[index] = element;
            return old;
        }
        return null;
    }

    public int size() {
        return size;
    }
}
