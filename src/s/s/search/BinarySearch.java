package s.s.search;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr_aim = new int[m];
        for (int i = 0; i < arr_aim.length; i++) {
            arr_aim[i] = sc.nextInt();
            if(BinarySearch1(0,arr.length-1,arr_aim[i],arr)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static boolean BinarySearch1(int min,int max,int t,int arr[]){
        if(min<=max) { //先判断循环截止条件，二分查找的结束条件就是min>max 不断改变min和max
            int mid = (max + min)/2;
            if (arr[mid] == t) {
                return true;
            }
            if (arr[mid] > t) {
                BinarySearch1(min, mid - 1, t, arr);
            }
            if (arr[mid] < t) {
                BinarySearch1(mid + 1, max, t, arr);
            }
        }
        return false;
    }
    /*public static ArrayList<Integer> basicSearch(int arr[], int number){
        ArrayList<Integer> list = new ArrayList<int>();
        for (int i = 0; i < arr.length; i++) {
            if(number==arr[i]){
                list.add(i);_
            }
        }
        return list;
    }*/
}
