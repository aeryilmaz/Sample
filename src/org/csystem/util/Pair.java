package org.csystem.util;

public class Pair<F, S> {
    public F first;
    public S second;

    public Pair(F first, S second)
    {
        this.first = first;
        this.second = second;
    }

    public static <T1, T2> Pair<T1, T2> makePair(T1 f, T2 s)
    {
        return new Pair<>(f, s);
    }

    public String toString()
    {
        return String.format("(%s, %s)", first, second);
    }
}
