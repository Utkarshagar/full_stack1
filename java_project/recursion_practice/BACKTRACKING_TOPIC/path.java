package java_project.recursion_practice.BACKTRACKING_TOPIC;

public class path {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        print(arr,"",0,0);
    }

    private static void print(int[][] arr, String ans, int row, int col) {
        if(row==2 && col ==2){
            System.out.println(ans);
            return;
        }
        if(row<=1)
        print(arr, ans+"V", row+1, col);
        if(col<=1){
            print(arr, ans+"H", row, col+1);
        }
    }

    
}
