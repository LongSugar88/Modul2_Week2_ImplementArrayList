public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> mylist = new MyArrayList<>();
        mylist.addFirst(1);
        mylist.addFirst(0);
        mylist.add(2);
        mylist.add(3);
//        mylist.set(2,3);
//        mylist.remote(2);
//        mylist.print();
        MyArrayList clone = mylist.clone();
        clone.print();
    }
}
