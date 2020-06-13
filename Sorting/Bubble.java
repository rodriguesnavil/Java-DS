class Bubble{
    public static void main(String args[]){
        int arr[] = {3,8,6,2,9,1};
        Bubble obj = new Bubble();
        obj.bubbleSort(arr);
    }
/*
1.  We start from the right end of the sequence and will compare the numbers on the
    left and right sides
2   After comparing, If the number on the righ is found to be smaller, the numbers
    will be swapped
3.  Likewise, The operations are carried out and we traverse to the left end of the 
    sequence, In one round and smallest number in the sequence is moved to the
    left and considered to be fully sorted.
4.  Again we start from the right end, and the same operations are carried until all
    of the numbers are fully sorted.
*/ 
    void bubbleSort(int arr[]){
    for(int j = 0; j < arr.length; j ++){
        for(int i = arr.length - 1; i >= j+1; i--){
            if(arr[i] < arr [i - 1]){
                int tempVar = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = tempVar;
            }
        }
    }
    for(int el: arr){
    System.out.print(el+ " ");
    }
  }
}

/*
    Worst Case Time Complexity : O(n2)
    Best Case Time Complexity  : O(n)
    Average Time Complexity    : O(n2)
    Space Complexity           : O(1)
*/