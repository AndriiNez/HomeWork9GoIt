import java.util.Objects;

public class MyHashMap<K,V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75F;


    private Node<K, V>[] element;
    private int size;

    public MyHashMap() {
        this.element = new Node[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public void put(K key, V value) {
        int index = gerIndex(key);
        Node<K, V> newNode = new Node<>(key, value);
        if (element[index] == null) {
            element[index] = newNode;
        } else {
            Node<K, V> currentNode = element[index];
            while (currentNode != null){
                if( Objects.equals(currentNode.key, key)){
                    currentNode.value = value;
                    return;
                }
                if(currentNode.next == null){
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        size++;
        resize();
    }
    public void remove(K key){
        int index = gerIndex(key);
        Node<K, V> currentNode = element[index];
        Node<K, V> privNode = null;
        while (currentNode != null) {
            if( Objects.equals(currentNode.key, key)){
                if(privNode == null){
                    element[index] = currentNode.next;
                }else {
                    privNode.next = currentNode.next;
                }
                size--;
                return;
            }
            privNode = currentNode;
            currentNode = currentNode.next;
        }
    }
    public void clear(){
        element = new Node[DEFAULT_CAPACITY];
        size = 0;
    }
    public int size() {
        return size;
    }
    public V get(K key){
        int index = gerIndex(key);
        Node<K, V> currentNode = element[index];
        while (currentNode != null) {
            if( Objects.equals(currentNode.key, key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
            return null;
    }

    private int gerIndex(K key) {
        return Objects.hashCode(key) % element.length;
    }

    private void resize() {
        if (size >= element.length * LOAD_FACTOR) {
            int newCapacity = element.length * 2;
            Node<K, V>[] newElement = new Node[newCapacity];

            for (Node<K, V> node : element) {
                while ( node != null) {
                    int newIndex = Objects.hashCode(node.key) % newCapacity;
                    if (newElement[newIndex] != null) {
                        newElement[newIndex] = new Node<>(node.key, node.value);
                    } else {
                        Node<K, V> newNode = new Node<>(node.key, node.value);
                        newNode.next = newElement[newIndex];
                        newElement[newIndex] = newNode;
                    }
                    node = node.next;
                }
            }
            element = newElement;
        }
    }

        private static class Node<K, V> {
            private final K key;
            private V value;
            private Node<K, V> next;

            private Node(K key, V value) {
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

}

