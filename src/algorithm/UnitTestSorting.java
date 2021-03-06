package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
            Assert.assertEquals(sortedArray, sort.insertionSort(unSortedArray), "Array is not Sorted using insertionSort()");
            Assert.assertEquals(sortedArray, sort.bubbleSort(unSortedArray), "Array is not Sorted using bubbleSort()");
        }catch(Exception ex){
            ex.getMessage();
        }
        String value = "i am waiting";

        // Assert.assertEquals("i am waiting...",value);
        //Now implement Unit test for rest of the soring algorithm...................below

    }
}
