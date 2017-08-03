package io.emccarthy.binarysearch;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class BinarySearchAlgorithmTest {

    @Test
    public void testFound() {
        int[] testArray = new int[]{1,2,4,5,6,8,9,11,15};
        assertThat(new BinarySearchAlgorithm().find(11, testArray), is(testArray.length-2));
    }

    @Test
    public void testNotFound() {
        int[] testArray = new int[]{1,2,4,5,6,8,9,11,15};
        assertThat(new BinarySearchAlgorithm().find(12, testArray), is(-1));
    }

}