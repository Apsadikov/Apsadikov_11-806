public interface IntList {

    void add(int element);

    void add(int element, int position);

    int get(int index);

    int size();

    boolean contains(int value);

    void remove(int index);

    void sort();

    int[] toArray();

    void addAll(IntList list);

    void addAll(IntList list, int position);
}
