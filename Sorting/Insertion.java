class Insertion {

/*
    1.  To begin, the leftmost number is considered to be fully sorted. 
    2   Next, from the remaining numbers the leftmost number is taken out and comapred to
        the already sorted number to its left
    3.  If the already sorted number is larger than the two numbers are swap
    4.  The operation is repeated until either a smaller number appears, or the number reached
        the left edge
    5.  The operation is repeated until all the numbers are sorted in the lisr.
*/
    public static void insertionSort(int arr[]){
        for(int i=1; i < arr.length; i++){
                int j = 0;
                while( j != i){
                    if(arr[j] > arr[i]){
                        swap(arr, i, j);
                }
                j++;
            }
        }
    }

    public static void swap(int arr[], int i, int j){
        if(i == j){
            return;
        }
        int tempVar = arr[i];
        arr[i] = arr[j];
        arr[j] = tempVar;
    }

    public static void printList(int arr[]){
        for(int el: arr){
            System.out.print(el+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2,9,5,12,65,21,1 };
        insertionSort(arr);
        printList(arr);
    }
}