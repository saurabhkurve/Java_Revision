package Data_Strucures;

import OOPS.Interface;

import java.util.ArrayList;
import java.util.HashSet;

public class FindingDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4,2};
        int[] result = findDuplicate(arr);
        for(int res : result){
            System.out.print(res + " ");
        }
    }

    public static int[] findDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicateList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
               duplicateList.add(arr[i]);
            }
            set.add(arr[i]);
        }
        int[] duplicates = new int[duplicateList.size()];

        for(int i=0;i<duplicateList.size();i++){
            duplicates[i] = duplicateList.get(i);
        }
        return duplicates;
    }
}
