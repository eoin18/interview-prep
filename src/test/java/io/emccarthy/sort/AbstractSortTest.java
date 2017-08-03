package io.emccarthy.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public abstract class AbstractSortTest {

    @Test
    public void testSort() throws Exception {
        int[] unsorted = new int[]{4,3,2,5,11,1};
        int[] sorted = new int[] {1,2,3,4,5,11};
        newInstance().sort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }

    protected abstract SortingAlgorithm newInstance() ;
}
