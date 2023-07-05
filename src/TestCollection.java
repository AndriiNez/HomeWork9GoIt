public class TestCollection {
    public static void main(String[] args) {
        System.out.println(" Створюємо MyArrayList ");

        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 1; i <= 200000; i++) {
            list.add(i);
        }
        System.out.println("list2  = " + list.get(2));


        System.out.println("list size  = " + list.size());


        System.out.println("list get 2 = " + list.get(1));

        list.remove(2);
        System.out.println("list after remove = " + list.get(1));

        list.clear();
        System.out.println("list after clear = " + list.size());

        System.out.println(" Створюємо MyLinkedList ");

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i <= 200000; i++) {
            linkedList.add(i);
        }
        System.out.println("list 2 = " + linkedList.get(2));
        System.out.println("list size  = " + linkedList.size());
        System.out.println("list get 4 = " + linkedList.get(4));

        linkedList.remove(4);
        System.out.println("list after remove = " + linkedList.get(4));

        linkedList.clear();
        System.out.println("list after clear = " + linkedList.size());

        System.out.println(" Створюємо MyQueue ");
        MyQueue<Integer> queue = new MyQueue<>();
        for (int i = 1; i <= 200000; i++) {
            queue.add(i);
        }

        System.out.println("Size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek after Poll: " + queue.peek());
        queue.clear();
        System.out.println("size after clear = " + queue.size());

        System.out.println(" Створюємо MyStack ");

        MyStack<Integer> myStack = new MyStack<>();
        for (int i = 1; i <= 200000; i++) {
            myStack.push(i);
        }
        System.out.println("Size: " + myStack.size());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Pop: " + myStack.pop());
        System.out.println("Pop: " + myStack.pop());

        myStack.clear();
        System.out.println("Size after clear " + myStack.size());
        System.out.println(" Створюємо MyHashMap ");
        MyHashMap<Integer, Integer> myHashMap = new MyHashMap<>();
        for (int i = 1; i <= 200000; i++) {
            myHashMap.put(i, i);

        }
        System.out.println("get element 99 = " + myHashMap.get(99));
        myHashMap.remove(6);
        System.out.println("get element 6 after remove = " + myHashMap.get(6));
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.clear();
        System.out.println("size after clear = " + myHashMap.size());
    }

}



