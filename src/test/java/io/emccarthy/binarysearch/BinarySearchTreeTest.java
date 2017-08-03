package io.emccarthy.binarysearch;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void testAddAndContains() {
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();
        searchTree.add(123);
        searchTree.add(321);

        assertTrue(searchTree.contains(123));
        assertTrue(searchTree.contains(321));
        assertFalse(searchTree.contains(890));
    }

    @Test
    public void testRemoveWithNoChildNodes() {
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();
        searchTree.add(123);
        searchTree.add(321);

        searchTree.remove(321);

        assertTrue(searchTree.contains(123));
        assertFalse(searchTree.contains(321));
    }

    @Test
    public void testRemoveWithOneChildNode() {
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();
        searchTree.add(123);
        searchTree.add(321);

        searchTree.remove(123);

        assertTrue(searchTree.contains(321));
        assertFalse(searchTree.contains(123));
    }

    @Test
    public void testRemoveWithTwoChildNodes() {
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();
        searchTree.add(20);
        searchTree.add(25);
        searchTree.add(15);
        searchTree.add(10);
        searchTree.add(12);
        searchTree.add(18);
        searchTree.add(17);
        searchTree.add(19);
        searchTree.add(16);

        searchTree.remove(18);

        assertTrue(searchTree.contains(16));
        assertTrue(searchTree.contains(20));
        assertFalse(searchTree.contains(18));
    }

}