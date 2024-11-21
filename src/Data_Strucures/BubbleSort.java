package Data_Strucures;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,9,1,5,6};


        printArray(arr);
        bubbleSort(arr);
        System.out.println();
        printArray(arr);

    }

    public static void bubbleSort(int[] arr){
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (false){
                return;
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
