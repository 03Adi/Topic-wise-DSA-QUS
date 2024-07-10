package Array;

public class maximumvalues {
    public static void main(String[] args) {
        int[] arr={21,33,44,54,22,36};
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
