/*----------------------------------------------------------------------------------------------------------------------
    IntRange metodu ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.collection.IntRange;
import org.csystem.collection.RandomIntGenerator;

import java.util.Iterator;

class App {
    public static void main(String [] args)
    {
        RandomIntGenerator intGenerator = new RandomIntGenerator(5, 1, 101);

        for (int val : intGenerator)
            System.out.printf("%d ", val);

        System.out.println();
}
}