package Chapter6.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {

    Object[] data = null;
    int capacity = 0;
    int size = 0;

    public MyVector(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("유효하지 않은 값입니다. :" + capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector() {
        this(10);
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }

    public boolean add(Object obj) {
        // 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        return data[index];
    }

    public Object remove(int index) {
//        Object oldObj = null;
//
//        if (index < 0 || index >= size)
//            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
//        oldObj = data[index];
//
//        // 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열 복사를 통해 빈자리를 채워줘야 한다.
//        if (index != size - 1) {
//            System.arraycopy(data, index + 1, data, index, size - index - 1);
//        }
//        // 마지막 데이터를 null로 한다. 배열은 0 부터 시작하므로 마지막 요소는 index가 size-1이다.
//        data[size-1] = null;
//        size--;
//        return oldObj;

        Object oldObj = null;
        if (index < 0 || index > size -1)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        oldObj = data[index];

        // 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열 복사를 통해 빈자리를 채워줘야 한다.
        if (index != size - 1) {
            System.arraycopy(data, index + 1, data, index, size - 1 - index);
        }
        // 마지막 데이터를 null로 한다. 배열은 0 부터 시작하므로 마지막 요소는 index가 size-1이다.
        data[size - 1] = null;
        size--;
        return oldObj;
    }

    public boolean remove(Object obj) {
//        for (int i = 0; i < size; i++) {
//            if (obj.equals(data[i])) {
//                remove(i);
//                return true;
//            }
//        }
//        return false;
        for (int i = 0; i < size; i++) {
            if (obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimTosize() {
        setCapacity(size);
    }

    private void setCapacity(int capacity) {
        if (this.capacity == capacity)
            return ;
        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            data[i] = null;
        size = 0;
    }


    @Override
    public int size() {
        return 0;
    }

//    @Override
//    public boolean isEmpty() {
//        return false;
//    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

//    @Override
//    public boolean add(Object o) {
//        return false;
//    }

//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

//    @Override
//    public void clear() {
//
//    }

//    @Override
//    public Object get(int index) {
//        return null;
//    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

//    @Override
//    public Object remove(int index) {
//        return null;
//    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }
}
