package s.s.search;

import java.util.ArrayList;
import java.util.Scanner;
//对于无规律的数据使用分块查找要点在于找到不同区间的块，用最小最大值判断所在块的位置
public class BlockSearchNew {
    public static void main(String[] args) {
        int[] arr = {27,22,30,40,36,
                    13,19,16,20,
                    7,10,
                    43,50,48};
        Blocks_new b1 = new Blocks_new(22,40,0,4);
        Blocks_new b2 = new Blocks_new(13,20,5,8);
        Blocks_new b3 = new Blocks_new(7,10,9,10);
        Blocks_new b4 = new Blocks_new(43,50,11,13);
        ArrayList<Blocks_new> list = new ArrayList<Blocks_new>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        int number = 19;
        int returnIndex = getIndex(arr,list,number);
        if(returnIndex == -1){
            System.out.println("没找到");
        } else{
            System.out.println("找到了，在第"+returnIndex+"个位置");
        }
    }
    public static int getIndex(int arr[],ArrayList<Blocks_new> list,int number){
        int index = findIndex(list,number);
        if(index == -1){
            return -1;
        }
        int startIndex = list.get(index).getStartIndex();
        int endIndex = list.get(index).getEndIndex();
        for (int i = startIndex; i < endIndex; i++) {
            if(number == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int findIndex(ArrayList<Blocks_new> list,int number){
        for (int i = 0; i < list.size(); i++) {
            if(number>=list.get(i).getMin() &&number<=list.get(i).getMax()){
                return i;
            }
        }
        return -1;
    }
}
class Blocks_new{
    int min;
    int max;
    int startIndex;
    int endIndex;

    public Blocks_new() {
    }

    public Blocks_new(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "blocks_new{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
