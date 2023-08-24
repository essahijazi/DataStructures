import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayList<T> implements Iterable<T>{
    private T [] arr;
    private int length = 0;
    private int capacity = 0;

    public ArrayList() {
        this.capacity = 10;
        arr = (T[]) new Object[capacity];
    }
    public ArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal capacity: " + capacity);
        }
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return this.length;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
