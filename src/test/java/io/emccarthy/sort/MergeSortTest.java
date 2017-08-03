package io.emccarthy.sort;

public class MergeSortTest extends AbstractSortTest{

    @Override
    protected SortingAlgorithm newInstance() {
        return new MergeSort();
    }
}