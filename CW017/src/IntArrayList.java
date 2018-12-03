import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private static final double EXTENSION_COEF = 1.5;
    private int count = 0;

    public IntArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    @Override
    public void add(int element) {
        if (count >= elements.length) {
            grow();
        }
        elements[count++] = element;
    }

    @Override
    public void add(int element, int position) {
        int from = position;
        if (position >= count) {
            from = size();
        }
        int[] lastElements = Arrays.copyOfRange(elements, from, count);
        while (position > elements.length) {
            grow();
        }
        count = position;
        add(element);
        for (int i = 0; i < lastElements.length; i++) {
            add(lastElements[i]);
        }
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF);
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public int get(int index) {
        if (index >= count || index < 0) {
            throw new IllegalArgumentException("Index invalid");
        }
        return elements[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int value) {
        boolean isFind = false;
        for (int i = 0; i < count; i++) {
            if (get(i) == value) {
                isFind = true;
            }
        }
        return isFind;
    }

    @Override
    public void remove(int index) {
        int[] lastElements = Arrays.copyOfRange(elements, index + 1, count);
        elements = Arrays.copyOfRange(elements, 0, size() - 1);
        count = index;

        for (int i = 0; i < lastElements.length; i++) {
            add(lastElements[i]);
        }
    }

    @Override
    public void sort() {
        for (int i = 0; i < size(); i++) {
            int min = elements[i];
            for (int j = 0; j < size(); j++) {
                if (min > elements[j]) {
                    int a = elements[i];
                    elements[i] = elements[j];
                    elements[j] = a;
                    min = a;
                }
            }
        }
    }

    @Override
    public int[] toArray() {
        return Arrays.copyOf(elements, size());
    }

    @Override
    public void addAll(IntList list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public void addAll(IntList list, int index) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i), index + i);
        }
    }
}
