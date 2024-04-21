package Starters126;

public class PermutationDistribution {
    public void solve(int[] arr, int n){
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i] == i+1){
                count++;
                swap(arr, i, i+1);
            }
        }
        if(arr[n-1] == n){
            count++;
        }

        System.out.println(count);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
