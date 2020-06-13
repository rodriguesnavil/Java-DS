class Merge{
    public static void main(String[] args) {
        int input[] = { 4, 8, 12, -22, 10};
        mergeSort(input, 0, input.length);
        for(int el: input){
            System.out.print(el+" ");
        }
    }

    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        /**
         * Merge sort will happen recursively, until the elements are fully handled
         */
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        /**
         * After the below recusion elements in the left and right part of the array are considered
         * to be sorted
         */
        mergeHalves(input, start, mid, end);
    }

    public static void mergeHalves(int[] input, int start, int mid, int end){
        /*
            Below is an optimization will check if right parition 1st array element is greater that 
            left partition last element. If yes it will not copy elements to temp array 
        */
        if(input[mid - 1] >= input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int [end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }
        /*
            The method below will handle the elements in the left array as elements in the right
            array are already handled we do not need to copy those elements as the pos are not going
            to change 
            {12, 16} {11, 14}
            {11,12,14,} 16
        */

        // mid - i tells the number of element which are not copied fron the left partition

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}

/*

Worst Case Time Complexity: O(n*log n)

Best Case Time Complexity: O(n*log n)

Average Time Complexity: O(n*log n)

Space Complexity: O(n)

 */