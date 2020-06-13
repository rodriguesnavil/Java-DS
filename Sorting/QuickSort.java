/**
 * 1. Divide and Conquer algorithm
 * 2. In this Algorithm, we choose the pivot element and we partition the array into two half
 * 3. Elements in the left sub array are less than pivot element and elements greater than pivot elements
 *    are in the right sub array
 * 4. After the above step is done the pivot element in in correct sorted position
 * 5. The process is repeated and evetually all the elements will be in corrected sorted position 
 * 6. As recursively every element will be chosen as pivot all the elements in an array will be in 
 *    corrected sorted position.
 */

class QuickSort{
    public static void main(String[] args) {
        int inputArray[] = {5, 1, 6, 0, -22, 23};
        quick(inputArray, 0, inputArray.length);
        for (int x: inputArray){
            System.out.print(x+" ");
        }
    }

    public static void quick(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int pivotIndex = partition(input, start, end);
        quick(input, start, pivotIndex);
        quick(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int i =  start;
        int j = end;
        int pivot = input[start];
        while(i < j){
            // Starting from the right index check if element is less than or equal to pivot element
            while(i < j && input[--j] >= pivot);
                if(i < j){
                    input[i] = input[j];
                }
            // Starting from the left index check if element is greater than or equal to pivot element
            while(i < j && input[++i] <= pivot);
                if(i < j){
                    input[j] = input[i];
                }
        }
        input[j] = pivot;
        return j;
    }
}

/*

Worst Case Time Complexity: O(n2)

Best Case Time Complexity: O(n*log n)

Average Time Complexity: O(n*log n)

Space Complexity: O(n*log n)

 */