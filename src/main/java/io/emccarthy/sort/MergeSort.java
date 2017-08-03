package io.emccarthy.sort;

public class MergeSort extends AbstractSortingAlgorithm {

    @Override
    public void sort(int[] unsorted) {
        mergeSort(unsorted, 0, unsorted.length - 1);
    }

    private void mergeSort(int[] unsorted, int leftIndex, int rightIndex) {
        if(leftIndex < rightIndex) {

            int midIndex = (leftIndex + rightIndex) / 2;

            mergeSort(unsorted, leftIndex, midIndex);
            mergeSort(unsorted, midIndex + 1, rightIndex);

            merge(unsorted, leftIndex, midIndex, rightIndex);
        }

    }

    private void merge(int[] unsorted, int leftIndex, int midIndex, int rightIndex) {
        int left[] = new int[midIndex-leftIndex + 1], right[] = new int[rightIndex-midIndex];
        //Create temp arrays to store the left and right sides of the middle index
        System.arraycopy(unsorted, leftIndex, left, 0, midIndex - leftIndex + 1);
        System.arraycopy(unsorted, midIndex + 1, right, 0, rightIndex - midIndex);

        int i=leftIndex, j=0, k=0;
        while(j < left.length && k < right.length) {
            if(left[j] < right[k]) {
                unsorted[i++] = left[j++];
            } else {
                unsorted[i++] = right[k++];
            }
        }

        while(j < left.length) {
            unsorted[i++] = left[j++];
        }

        while(k < right.length) {
            unsorted[i++] = right[k++];
        }
    }

}
