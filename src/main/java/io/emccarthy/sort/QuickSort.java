package io.emccarthy.sort;

public class QuickSort extends AbstractSortingAlgorithm {

    @Override
    public void sort(int[] unsorted) {
        quickSort(unsorted, 0, unsorted.length-1);
    }

    private void quickSort(int[] unsorted, int lowIndex, int highIndex) {
        if(lowIndex < highIndex) {
            int partition = partition(unsorted, lowIndex, highIndex);
            quickSort(unsorted, lowIndex, partition - 1);
            quickSort(unsorted, partition + 1, highIndex);
        }
    }

    private int partition(int[] unsorted, int lowIndex, int highIndex) {
        int pivot = unsorted[highIndex];
        int i = lowIndex - 1;
        for (int j = lowIndex ; j < highIndex ; j++) {
            if(unsorted[j] < pivot) {
                i++;
                swap(unsorted, i, j);
            }
        }
        if(unsorted[highIndex] < unsorted[i+1]) {
            swap(unsorted, i+1, highIndex);
        }
        return i+1;
    }
}
