public class Main {

    public static void main(String[] args) {
        IntArrayList intList = new IntArrayList();
        intList.add(1);
        intList.add(4);
        intList.add(5);
        intList.add(3);
        intList.add(2);

        IntArrayList test = new IntArrayList();
        test.add(7);
        test.add(8);
        test.add(9);

        intList.add(-1, 0);
        intList.remove(3);
        intList.addAll(test, 2);
        System.out.println(intList.get(5));
        System.out.println(intList.contains(-1));
        System.out.println();

        intList.sort();

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
    }
}
