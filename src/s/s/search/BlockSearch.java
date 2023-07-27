package s.s.search;

import java.io.ObjectInputStream;

public class BlockSearch {
    //先分块，一般分数组长的取根号长个块，为了数据平衡可以少一个，然后将数组分块在类中获取开始和结束索引
    public static void main(String[] args) {
        int arr[]={16,5,9,12, 21,18,
                32,23,37,26,45,34,
                50,48, 61,52,73,66};
        int m = (int)Math.sqrt(arr.length);
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);
        Block[] blockArr = {b1,b2,b3};
        int number = 30;

    }
    public static int getIndex(Block[] blockArr,int[] arr,int number){
        int index = findIndexBlock(blockArr,number);
        if(index == -1){
            return -1;
        }
        int startIndex = blockArr[index].getStartIndex();
        int endIndex = blockArr[index].getEndIndex();
        for (int i = startIndex; i < endIndex; i++) {
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }
    public static int findIndexBlock(Block[] blockArr,int number){
        for (int i = 0; i < blockArr.length; i++) {
            if(number<blockArr[i].getMax()){
                return number;
            }
        }
        return -1;
    }
}
class Block{
    int max; //
    int startIndex;
    int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
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
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
