public class MyLinkedList<E> {

    private Node<E> firstElement;
    private Node<E> lostElement;
    private int size = 0;

    public void add(E value){
        Node<E> newNode = new Node<>(value);
        if(size == 0){
            firstElement = newNode;
            lostElement = newNode;
        } else {
            lostElement.nextElement = newNode;
            newNode.prevElement = lostElement;
            lostElement = newNode;
        }
        size++;
    }
    public void remove(int index){
        if(index < 0 || index >= size ){
            throw new IndexOutOfBoundsException();
        }
        Node<E> removNode = getNode(index);
        Node<E> priviousNode = removNode.prevElement;
        Node<E> nextNode = removNode.nextElement;

        if ( priviousNode == null){
            firstElement = nextNode;
        } else{
            priviousNode.nextElement = nextNode;
            removNode.prevElement = null;
        }

        if(nextNode == null){
            lostElement = priviousNode;
        }else {
            nextNode.prevElement = priviousNode;
            removNode.nextElement = null;
        }
        removNode.element = null;
        size--;
    }
    public void clear(){
        firstElement = null;
        lostElement = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public E get(int index){
        if(index < 0 || index >= size ){
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = getNode(index);
        return node.element;
    }
    private Node<E> getNode(int index){
        Node<E> currentNode = firstElement;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.nextElement;
        }
        return currentNode;
    }
    private static class Node<E>{
        private E element;

        private Node<E> nextElement;
        private Node<E> prevElement;

        private Node(E element) {
            this.element = element;

        }
    }


}
