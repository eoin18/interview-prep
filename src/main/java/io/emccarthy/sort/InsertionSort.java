package io.emccarthy.sort;

public class InsertionSort extends AbstractSortingAlgorithm {

    @Override
    public void sort(int[] unsorted) {
        for (int i = 1 ; i < unsorted.length ; i++) {
            int j = i;
            while(j > 0 && unsorted[j-1] > unsorted[j]){
                swap(unsorted, j, j-1);
                j = j -1;
            }
        }
    }

}
