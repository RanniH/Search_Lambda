package s.s.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambda_demo {
    public static void main(String[] args) {
        Integer[] arr = {1,3,7,5,4,2,6,9,8};
        //new Comparator<>  = (o1,o2)->   lambada表达式()->{}  括号里面是形参 简化函数式(有且只有一个接口，接口上方可以加@FunctionalInterface)匿名内部类
        Arrays.sort(arr, (o1, o2) -> {  //相当于插入排序加二分查找，o1是无序数据，o2是有序数据
            return o2 - o1;//9,8,7,6,5,4,3,2,1
            //return o1-o2 //1,2,3,4,5,6,7,8,9
        });
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}
