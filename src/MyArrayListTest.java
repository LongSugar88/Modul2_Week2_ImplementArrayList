public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> mylist = new MyArrayList<>();

        mylist.addFirst(1);
        mylist.addFirst(0);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        mylist.add(6);
        mylist.set(2,3);
        mylist.remote(2);
        mylist.print();

        MyArrayList<Integer> clone = mylist.clone();
        clone.print();
        System.out.println(        clone.contains(5));
        System.out.println(        clone.contains(7));
        System.out.println(        clone.indexOf(5));
        System.out.println(        clone.indexOf(7));
        System.out.println(        clone.get(3));
        clone.clear();
        clone.print();

    }
}
