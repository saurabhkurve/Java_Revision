package Data_Strucures;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,20,4,60,45,99};
        int res = secondLargest(arr);
        System.out.println(res);
    }
    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
