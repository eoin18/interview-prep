package io.emccarthy.sort;

public class BubbleSortTest extends AbstractSortTest {

    @Override
    protected SortingAlgorithm newInstance() {
        return new BubbleSort();
    }
}