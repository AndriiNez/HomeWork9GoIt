public class TestCollection {
    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
//        for (int i = 1; i <= 200000; i++) {
//            list.add(i);
//
//        }
//
//        for (int j = 0; j < list.size() ;j++ ){
//            System.out.println("list "+ list.get(j) + " = " + list.get(j));
//
//        }
//        System.out.println("-----------");
//        System.out.println("list size  = " + list.size());
//        System.out.println("-----------");
//
//        System.out.println("list get 2 = " + list.get(1));
//        System.out.println("-----------");
//        list.remove(2);
//        System.out.println("list after remove = " + list.get(1));
//        System.out.println("-----------");
//        list.clear();
//        System.out.println("list after clear = " + list.size());
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i < 200000; i++) {
            linkedList.add(i);
        }

            System.out.println("linkedList"+ " = " + linkedList.toString());


        }
    }


