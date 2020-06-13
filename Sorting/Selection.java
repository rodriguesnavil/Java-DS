class Selection{
    public static void main(String args[]){
        Selection obj = new Selection();
        int arr[] = {4,1,7,21,7,2};
        obj.selectionSort(arr);

    }

/* 
1.  We find the smallest element using linear search
2.  Smallest element in the list is swap with the leftmost element in an array 
    and considered to be fully sorted
    The smallest element will be in the leftmost position, so no operation 
    will be carried out.
3.  The above steps are repeated until the array is considered fully sorted.
*/
    void selectionSort(int arr[]){
        for(int i=0; i < arr.length; i++){
            int index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[index] > arr[j])
                    index = j;
            }
            int tempVar = arr[index];
            arr[index] = arr[i];
            arr[i] = tempVar;
        }
        for(int el: arr){
            System.out.print(el+" ");
        }
    }
}
/*
    Worst Case Time Complexity : O(n2)
    Best Case Time Complexity  : O(n2)
    Average Time Complexity    : O(n2)
    Space Complexity           : O(1)
*/