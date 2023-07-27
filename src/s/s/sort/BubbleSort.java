package s.s.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        int n= arr.length - 1;
        for (int j = 0; j < arr.length - 1; j++) { //找到n-1个最大值，所以循环n-1轮
            for (int i = 0; i < n; i++) { //相邻的交换数据，左小右大，依次找到最大值放在最右边
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            n--; //已经找到了最大值就不用比较了，所以n--，提高效率
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
