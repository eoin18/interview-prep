package io.emccarthy.sort;

public class BubbleSort extends AbstractSortingAlgorithm {

    @Override
    public void sort(int[] unsorted) {
        boolean swap = true;
        while(swap) {
            swap = false;
            for (int i = 0; i < unsorted.length - 1; i++) {
                if (unsorted[i + 1] < unsorted[i]) {
                    swap(unsorted, i, i+1);
                    swap = true;
                }
            }
        }
    }

}
