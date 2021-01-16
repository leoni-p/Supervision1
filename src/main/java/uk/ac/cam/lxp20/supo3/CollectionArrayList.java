package uk.ac.cam.lxp20.supo3;

import java.util.AbstractList;

public class CollectionArrayList<T> extends AbstractList<T> {
    private T[] elements;

    public CollectionArrayList(int size) {
        elements = (T[]) new Object[size];
    }

    public CollectionArrayList(T[] elements){
        this.elements = elements;
    }

    @Override
    public T get(int index) {
        if (index<0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public int size() { return elements.length; }

    @Override
    public T set (int index, T element){
        if (index<0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        elements[index] = element;
        return element;
    }

    @Override
    public T remove(int index){
        if (index<0 || index >= elements.length) {
            throw new IndexOutOfBoundsException();
        }
        T tmp = elements[index];
        elements[index] = null;
        return tmp;
    }

    public static void main(String[] args) {
        CollectionArrayList<String> s = new CollectionArrayList<String>(5);
        s.set(0,"Hello");
        s.set(1,"This");
        s.set(2,"Is");
        s.set(3,"A");
        s.set(4,"Test");
        s.remove(3);
        System.out.println(s.toString());
        try {
            s.set(10,"anything");
        } catch (Exception e){
            System.out.println("The index is out of the correct range");
        }
    }

}
