public interface Intlist {
    void add(int var1);

    void add(int var1, int var2);

    int get(int var1);

    int size();

    boolean contains(int var1);

    void remove(int var1);

    void sort();

    int[] toArray();

    void addAll(Intlist var1);

    void addAll(Intlist var1, int var2);
}
