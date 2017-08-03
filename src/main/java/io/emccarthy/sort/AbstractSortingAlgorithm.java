package io.emccarthy.sort;

public abstract class AbstractSortingAlgorithm implements SortingAlgorithm {

    void swap(int[] unsorted, int index, int otherIndex) {
        int temp = unsorted[index];
        unsorted[index] = unsorted[otherIndex];
        unsorted[otherIndex] = temp;
    }

}
