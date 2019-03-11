package org.csystem.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntRange implements Iterable<Integer> {
    private int m_min, m_max, m_inc;

    public IntRange(int min, int max,int inc)
    {
        if (min > max)
            throw new IllegalArgumentException("min must be less or equal than max");

        m_min = min;
        m_max = max;
        m_inc = inc;

    }

    public int getMin()
    {
        return m_min;
    }

    public int getMax()
    {
        return m_max;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new Iterator<Integer>() {
            private int m_index = -1;

            @Override
            public boolean hasNext()
            {
                return m_min + (m_index + 1) <= m_max;
            }

            @Override
            public Integer next()
            {
                if (!hasNext())
                    throw new NoSuchElementException("No element");

                return m_min + ++m_index;
            }
        };
    }
}
