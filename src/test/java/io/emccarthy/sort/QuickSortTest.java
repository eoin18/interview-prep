package io.emccarthy.sort;

public class QuickSortTest extends AbstractSortTest {

    @Override
    protected SortingAlgorithm newInstance() {
        return new QuickSort();
    }
}