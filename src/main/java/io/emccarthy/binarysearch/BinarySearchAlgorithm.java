package io.emccarthy.binarysearch;

public class BinarySearchAlgorithm {

    public int find(int item, int[] sortedArray) {
        int left = 0;
        int right = sortedArray.length - 1;
        while(left < right) {
            int midpoint = (left + right)/2;
            if(sortedArray[midpoint] == item){
                return midpoint;
            } else if (sortedArray[midpoint] > item) {
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
        }
        return -1;
    }

}
