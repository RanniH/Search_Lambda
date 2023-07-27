package s.s.sort;

public class SelectionSort {
    //从0索引开始，跟后面元素一一比较，一个一个找到最小值
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        int n = 0; //从第0位索引开始，也可以把n直接换成j
        for (int j = 0; j < arr.length - 1; j++) {   //同冒泡排序比较类似
            for (int i = n + 1; i < arr.length; i++) {   //n+1表示不用和自己相比，直接从下一位索引开始
                if(arr[n]>arr[i]){
                    int temp =arr[n];
                    arr[n] = arr[i];
                    arr[i] = temp;
                }
            }
            n++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
