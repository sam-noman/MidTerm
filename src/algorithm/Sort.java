package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int n = list.length;
        for (int j = 1; j < n; j++) {
            int key = list[j];
            int i = j-1;
            while ( (i > -1) && ( list [i] > key ) ) {
                list [i+1] = list [i];
                i--;
            }
            list[i+1] = key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here
        int n = list.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list[j-1] > list[j]){
                    //swap elements
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }

            }
        }


        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
