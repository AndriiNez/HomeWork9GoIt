import java.util.Arrays;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    transient Object[] elementData;
    private int size;

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public void add(E value){
        sizeCapacity();
        elementData[size++] = value;
    }
    public void remove(int index){
        if(index < 0 || index >= size ){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1 ; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[size - 1] = null;
        size--;
    }
    public void clear(){
        elementData = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public int size(){
        return size;
    }
    public E get(int index) {
        if(index < 0 || index >= size ){
            throw new IndexOutOfBoundsException();
        }
        return (E) elementData[index];
    }
    private void sizeCapacity(){
        if(size == elementData.length){
            int newCapacity = elementData.length * 2;
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

}
