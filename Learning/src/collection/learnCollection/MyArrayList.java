package collection.learnCollection;

import com.sun.nio.sctp.IllegalReceiveException;

import java.util.*;

public class MyArrayList<E> extends AbstractList<E> implements List<E>{

    private static final int DEFAULT_CAPACITY = 10;

    //if init capacity is 0
    private static final Object[] EMPTY_ELEMENTDATA = {};

    //if there is no init capacity
    private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENTDATA = {};

    private int size;

    //size will return the size of this array
    transient Object[] data;

    public MyArrayList() {
        this.data = DEFAULT_CAPACITY_EMPTY_ELEMENTDATA;
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.data = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.data = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalReceiveException("Bad init capacity");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    public class Itr implements Iterator<E>{

        int current;
        int lastIndex = -1;
        int expectedModCount = modCount;

        public Itr() { }

        @Override
        public boolean hasNext() {
            return current != size;
        }

        @Override
        public E next() {
        checkModCount();
            //size, data.length
            int i = current;
            if (i > size)
                throw new NoSuchElementException();
            Object[] data = MyArrayList.this.data;
            if (i> data.length)
                throw new ConcurrentModificationException();
            current = i + 1;
            return (E) data[lastIndex = i];
        }

        @Override
        public void remove() {
            if (lastIndex < 0)
                throw new IllegalStateException();
            checkModCount();

            try {
                MyArrayList.this.remove(lastIndex);
                current = lastIndex;
                lastIndex = -1;
            } catch (IndexOutOfBoundsException exception) {
                throw new ConcurrentModificationException();
            }
        }

        final void checkModCount() {
            if (expectedModCount != modCount) {
                throw new ConcurrentModificationException("The list has been changed.");
            }
        }
    }



    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        ensureCapacity(size+1);
        data[size++] = e;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(data, minCapacity));
    }

    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;

        if (minCapacity - data.length > 0) {
            grow(minCapacity);
        }
    }

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private void grow(int minCapacity) {
        int oldCapacity = data.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if(newCapacity - minCapacity < 0)
            newCapacity = minCapacity;

        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hudgeCapacity(minCapacity);

//        change the size of data array (bigger copy)
        data = Arrays.copyOf(data, newCapacity);
    }

    private int hudgeCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE)
                ? Integer.MAX_VALUE
                : MAX_ARRAY_SIZE;
    }

    private static int calculateCapacity(Object[] data, int minCapacity) {
        if (data == DEFAULT_CAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        modCount++;
        final Object[] array = data;
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return (E) data[index];
    }

    private void rangeCheck(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        checkIndexBeforeAdd(index);
        ensureCapacity(size + 1);

        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = element;
        size++;
    }


    @Override
    public E remove(int index) {
        checkSize(index);

        modCount++; // new modification
        E oldElement = elementData(index);
        int numMoved = size - index - 1;

        if (numMoved > 0)
            System.arraycopy(data, index + 1, data, index, numMoved);
        data[--size] = null; //let GC clear memory

        return oldElement;
    }

    private E elementData(int index) {
        return (E) data[index];
    }

    private void checkSize(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + "is out of bounds.");
        }
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null)
                    return i;
            }
        }else {
            for (int i = 0; i < data.length; i++) {
                if (o.equals(data[i]))
                    return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size-1 ; i >= 0; i--) {
                if (data[i] == null)
                    return i;
            }
        }else {
            for (int i = size-1 ; i >= 0; i--) {
                if (o.equals(data[i]))
                    return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        checkIndexBeforeAdd(index);
        return new ListIter(index);
    }

    private void checkIndexBeforeAdd(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public class ListIter extends Itr implements ListIterator<E>{

        public ListIter(int index) {
            super();
            current = index;
        }

        @Override
        public boolean hasPrevious() {
            return current != 0;
        }

        @Override
        public int nextIndex() {
            return current;
        }

        @Override
        public int previousIndex() {
            return current - 1;
        }

        @Override
        public E previous() {
            checkModCount();
            int i = current - 1;
            if (i < 0)
                throw new NoSuchElementException();
            Object[] data = MyArrayList.this.data;
            if (i > data.length) {
                throw new ConcurrentModificationException();
            }
            current = i;
            return (E) data[lastIndex = i];
        }

        @Override
        public void set(E e) {
            if (lastIndex < 0)
                throw new IllegalStateException();
            checkModCount();

            try {
                MyArrayList.this.set(lastIndex, e);
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public void add(E e) {
            checkModCount();

            try {
                int i = current;
                MyArrayList.this.add(i, e);
                current = i + 1;
                lastIndex = -1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException exception) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {

        return null;
    }
}
