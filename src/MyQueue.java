public class MyQueue<E> {
    private Object[] elementData;
    private int size;
    private int front;
    private int last;

    public MyQueue() {
        this.elementData = new Object[10];
        this.front = 0;
        this.last = -1;
        this.size = 0;
    }

    public void add(E value) {
        if (size == elementData.length) {
            resize();
        }
        last = (last + 1) % elementData.length;
        elementData[last] = value;
        size++;
    }

    public void clear() {
        elementData = new Object[10];
        front = 0;
        last = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E peek() {
        if (size == 0) {
            return (E) "Не Вірно Вказаний Елемент";
        }
        return (E) elementData[front];
    }

    public E poll() {
        if (size == 0) {
            return (E) "Не Вірно Вказаний Елемент";
        }
        E element = (E) elementData[front];
        elementData[front] = null;
        front = (front + 1) % elementData.length;
        size--;
        return element;
    }

    private void resize() {
        Object[] newElementData = new Object[elementData.length * 2];
        for (int i = 0; i < size; i++) {
            newElementData[i] = elementData[(front + i) % elementData.length];
        }
        elementData = newElementData;
        front = 0;
        last = size - 1;
    }

}
