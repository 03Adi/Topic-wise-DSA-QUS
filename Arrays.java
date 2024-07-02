///******Sub Array problem ******///

class Arrays{
    public static void main(String[] args){

        int[] arr={1,3,4,-7,6,8,7,3,4};
        int n=arr.length;
        int target=7;
        int start=0;
        int currentsum=0;

        for (int i = 0; i < n; i++) {
            currentsum=currentsum+arr[i];
            while (currentsum>target && start<=i) {
                currentsum=currentsum-arr[start];
                start++;
            } 
            if(currentsum==target){
                System.out.println(target+" is at index "+start+ " and "+i);
                return;

            }
        }
        System.out.println("No sub array available  ");

        

    }
}