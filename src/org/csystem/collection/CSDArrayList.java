package org.csystem.collection;

public class CSDArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] m_elems;
    private int m_index;

    private void allocateCapacity(int capacity)
    {
        Object [] temp = new Object[capacity];

        for (int i = 0; i < m_index; ++i)
            temp[i] = m_elems[i];

        m_elems = temp;
    }

    public CSDArrayList()
    {
        this(DEFAULT_CAPACITY);
    }

    public CSDArrayList(int initialCapacity)
    {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Invalid capacity");

        m_elems = new Object[initialCapacity == 0 ? DEFAULT_CAPACITY : initialCapacity];
    }

    public int capacity() {return m_elems.length;}
    public int size() {return m_index;}

    public void add(Object elem)
    {
        if (m_index == m_elems.length)
            this.allocateCapacity(m_elems.length * 2);

        m_elems[m_index++] = elem;
    }

    public void add(int index, Object elem)
    {
        //TODO:Ellerinizden öper
    }

    public void clear()
    {
        for (int i = 0; i < m_index; ++i)
            m_elems[i] = null;

        m_index = 0;
    }

    public Object get(int index)
    {
        if (index < 0 || index >= m_index)
            throw new IndexOutOfBoundsException("index < 0 || index >= size()");

        return m_elems[index];
    }

    public Object remove(int index)
    {
        //TODO:Ellerinizden öper

        return null;
    }

    public Object set(int index, Object elem)
    {
        if (index < 0 || index >= m_index)
            throw new IndexOutOfBoundsException("index < 0 || index >= size()");

        Object oldElem = m_elems[index];

        m_elems[index] = elem;

        return oldElem;
    }

    public void trimToSize()
    {
        this.allocateCapacity(m_index == 0 ? DEFAULT_CAPACITY : m_index);
    }
}
