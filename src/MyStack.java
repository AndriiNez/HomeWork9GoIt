import java.util.Stack;

public class MyStack<E> {
    private int size;
    private Object[] elementData;
    private int lElem;

    public MyStack() {
        this.elementData = new Object[10];
        this.size = 0;
        this.lElem = -1;
    }

    public void push(Object value) {
        if (size == elementData.length) {
            resize();
        }
        lElem++;
        elementData[lElem] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < lElem; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[lElem] = null;
        lElem--;
        size--;
    }

    public void clear() {
        elementData = new Object[10];
        lElem = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E peek() {
        if (size == 0) {
            return (E) "Не Вірно Вказаний Елемент";
        }
        return (E) elementData[lElem];
    }

    public E pop() {
        if (size == 0) {
            return (E) "Не Вірно Вказаний Елемент";
        }
        E element = (E) elementData[lElem];
        elementData[lElem] = null;
        lElem = (lElem + 1) % elementData.length;
        size--;
        return element;
    }

    private void resize() {
        Object[] newElementData = new Object[elementData.length * 2];
        System.arraycopy(elementData, 0, newElementData, 0, size);
        elementData = newElementData;
    }
}
