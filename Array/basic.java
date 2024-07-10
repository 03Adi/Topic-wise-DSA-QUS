package Array;

public class basic {
    

    // all about array declaretion ----

    // Array syntax--

    //int[] arr=new int[10];
    //float[] arr=new float[10.5];

    //using array literals---
    // int[] arr={1,2,4,5,6,7};

    // now traversing an array using various loops

    public static void main(String[] args){

        int[] num=new int[3];
        num[0]=1;
        num[1]=2;
        num[2]=3;

        // now we declear loops to print the array values---

        for(int i=0;i<3;i++){
            System.out.println(num);
        }

        for(int nums: num){
            System.out.println(nums);
        }

        int i=0;
        while(i<3){
            System.out.println(num);
            i++;
        }

    }
}
