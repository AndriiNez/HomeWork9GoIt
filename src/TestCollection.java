public class TestCollection {
    public static void main(String[] args) {
        // Створюємо MyArrayList

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

        // Створюємо MyLinkedList
//
//        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
//        for (int i = 0; i < 200000; i++) {
//            linkedList.add(i);
//        }
//
////        for (int j = 0; j < linkedList.size() ;j++ ){
////            System.out.println("list "+ linkedList.get(j) + " = " + linkedList.get(j));
//
////        }
//        System.out.println("-----------");
//        System.out.println("list size  = " + linkedList.size());
//        System.out.println("-----------");
//
//        System.out.println("list get 4 = " + linkedList.get(4));
//        System.out.println("-----------");
//        linkedList.remove(4);
//        System.out.println("list after remove = " + linkedList.get(4));
//        System.out.println("-----------");
//        linkedList.clear();
//        System.out.println("list after clear = " + linkedList.size());

// Створюємо MyQueue
        MyQueue<String> queue = new MyQueue<>();
        queue.add("one");
        queue.add("twu");
        queue.add("tree");

        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek after Poll: " + queue.peek());
        queue.clear();
        System.out.println("size after clear = " + queue.size());
    }

}



