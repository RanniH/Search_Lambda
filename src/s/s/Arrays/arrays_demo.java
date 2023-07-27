package s.s.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class arrays_demo {
    public static void main(String[] args) {
        Integer[] arr = {1,3,7,5,4,2,6,9,8};
        /*Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");    //1,2,3,4,5,6,7,8,9
        }*/
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {  //相当于插入排序加二分查找，o1是无序数据，o2是有序数据
                return o2-o1;//9,8,7,6,5,4,3,2,1
                //return o1-o2 //1,2,3,4,5,6,7,8,9
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
