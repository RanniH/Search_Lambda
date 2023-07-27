import java.util.Scanner;
public class Y_HuiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        int cnt =1;
        for (int i = 0; i < arr.length; i++) {   //创建存储杨辉三角的二维数组，并给每行首位和末尾赋值初始条件1
            arr[i] = new int[cnt];
            arr[i][0] = 1;
            arr[i][cnt-1] = 1;
            cnt++;
        }
        write_triangle(arr); //录入杨辉三角

        for (int i = 0; i < arr.length; i++) {  //打印二维数组每行数据
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void write_triangle(int[][] arr){
        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length -1; j++) {
                arr[i][j] = arr[i-1][j] +arr[i-1][j-1];
            }
        }
    }
}
