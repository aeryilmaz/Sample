package org.csystem.util.function;

public interface IBiFunction<T, U, R> {
    R apply(T t, U u);
}
