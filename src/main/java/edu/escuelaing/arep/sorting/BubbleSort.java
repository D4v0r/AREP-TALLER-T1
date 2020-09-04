package edu.escuelaing.arep.sorting;

import java.util.List;

public class BubbleSort<T extends  Comparable<? super T>> {

    public void sort(List<T> unsortedArray) {
        int n = unsortedArray.size();
        while (n > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                if (unsortedArray.get(currentIndex - 1).compareTo(unsortedArray.get(currentIndex)) > 0) {
                    T temp = unsortedArray.get(currentIndex - 1);
                    unsortedArray.set(currentIndex - 1,unsortedArray.get(currentIndex))  ;
                    unsortedArray.set(currentIndex,  temp);
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
    }
}
