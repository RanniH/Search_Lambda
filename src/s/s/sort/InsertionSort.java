package s.s.sort;

public class InsertionSort {
    public static void main(String[] args) {
        //把数据分成有序和无序，然后依次从无序数据挑一个与有序数据最右边（最大值）比较小就排左边，直到左边数据比他小
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int startIndex = -1;//无序数据的开始索引
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                startIndex = i+1;
                break;
            }
        }
        for (int i = startIndex; i < arr.length; i++) {  //把无序数据依次拿出来比较
            for (int j = 0; j < i; j++) {  //与i个有序数据依次比较,比左边小就交换
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        /* //第二种写法
        * int j = i;
        * while(j>0&&arr[j]<arr[j-1]){
        *   int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        * }
        * */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
