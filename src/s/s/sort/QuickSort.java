package s.s.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        QSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //参数一，要排序的数组
    //参数二，起始和结束索引
    public static void QSort(int[] arr,int i,int j){
        int start = i;
        int end = j;
        if(start>end){ //递归截止条件，
            return;
        }
        int baseNumber = arr[i];
        while(start !=end){
            while(true){  //得先移动end，才能将比基准数小的数移动到左边位置，不能交换
                if(end<=start||arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            while (true) {
                if(end<=start||arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        QSort(arr,i,start-1); //递归左边
        QSort(arr,start + 1,j); //递归右边
    }
}
