package io.emccarthy.sort;

public class InsertionSortTest extends AbstractSortTest{

    @Override
    protected SortingAlgorithm newInstance() {
        return new InsertionSort();
    }
}