public class qucksrt{
    public static void quicksort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx-1);
        quicksort(arr, pidx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to keep track of smaller element index
        for(int j=si; j<ei; j++){
            if(arr[j]<pivot){
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap pivot with element at i+1
        int temp = arr[i+1];
        arr[i+1] = arr[ei];
        arr[ei] = temp;
        return i+1; // return the index of the pivot
    }
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        quicksort(arr, 0, arr.length-1);
        pintarr(arr);
    }
}