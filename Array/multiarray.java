package Array;

public class multiarray {
    
    public static void main(String[] args){
        int[][] num={{1,2,3},{4,5,6}};

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]);
            }
        }
    }
}
