public class Main {
    public Main() {
    }

    public static void main(String[] args) {
//        IntArrayList intList = new IntArrayList();
//        intList.add(1);
//        intList.add(4);
//        intList.add(5);
//        intList.add(3);
//        intList.add(2);
//
//        IntArrayList test = new IntArrayList();
//        test.add(7);
//        test.add(8);
//        test.add(9);
//
//        intList.add(-1, 0);
//        intList.remove(3);
//        intList.addAll(test, 2);
//        System.out.println(intList.get(5));
//        System.out.println(intList.contains(-1));
//        System.out.println();
//        intList.sort();
//
//        Iterator i = intList.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }

        GenericArrayList<String> list = new GenericArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}