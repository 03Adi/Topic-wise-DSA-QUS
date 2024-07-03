import java.util.*;
class primenum{

    static boolean isprime(int num){
        if(num<=1)
        return false;

        for (int i = 2; i*i <=num; i++) {
            return false;
        }
        return true;
    }


    public static void  main(String[] args){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(isprime(num)){
            System.out.println(num+"is a prime no");
        }
        else
        System.out.println(num+"is not a prime no");
    }
   
}
