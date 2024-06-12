public class insertionSort {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int j = i - 1;
            int currentNum = arr[i];

            while (j > -1 && arr[j] > currentNum){
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = currentNum;

            // my mis-understanding method
            // int j = i - 1;
            
            // while (j > -1 && arr[j] > arr[i]){
            //     arr[j + 1] = arr[j];
            //     j -= 1;
            // }
            // arr[j + 1] = arr[i];
            
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,0,3};
        System.out.println("Before Insertion Sort: ");
        for (int value : arr){
            System.out.print(" " + value);
        }
        sort(arr);
        System.out.print("\nAfter Insertion Sort: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
