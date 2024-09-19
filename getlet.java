

public class getlet{
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6}};
        for(int[] row :mat){
            for(int i:row){
                System.out.println(i);
            }
        }
    }
}