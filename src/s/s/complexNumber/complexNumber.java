package s.s.complexNumber;

import java.util.Objects;

public class complexNumber {
    private double reNumber;
    private double imNumber;

    public complexNumber() {
    }

    public complexNumber(double reNumber, double imNumber) {
        this.reNumber = reNumber;
        this.imNumber = imNumber;
    }

    /**
     * 获取
     * @return reNumber
     */
    public double getReNumber() {
        return reNumber;
    }

    /**
     * 设置
     * @param reNumber
     */
    public void setReNumber(double reNumber) {
        this.reNumber = reNumber;
    }

    /**
     * 获取
     * @return imNumber
     */
    public double getImNumber() {
        return imNumber;
    }

    /**
     * 设置
     * @param imNumber
     */
    public void setImNumber(double imNumber) {
        this.imNumber = imNumber;
    }
    //加法运算,传入两个complexNumber对象并返回一个新的complexNumber对象
    public static complexNumber getAdd(complexNumber add1,complexNumber add2){
        double new_re = add1.reNumber + add2.getReNumber();
        double new_im = add1.imNumber + add2.getImNumber();
        return new complexNumber(new_re,new_im);
    }
    //减法运算,传入两个complexNumber对象，第一个作减数，第二个作被减数并返回一个新的complexNumber对象
    public static complexNumber getSub(complexNumber sub,complexNumber subed){
        double new_re = sub.reNumber - subed.getReNumber();
        double new_im = sub.imNumber - subed.getImNumber();
        return new complexNumber(new_re,new_im);
    }
    //乘法运算,传入两个complexNumber对象并返回一个新的complexNumber对象
    public static complexNumber getMul(complexNumber mul1,complexNumber mul2){
        double new_re = mul1.reNumber * mul2.getReNumber() - mul1.imNumber * mul2.getImNumber();
        double new_im = mul1.imNumber * mul2.getReNumber() - mul1.reNumber * mul2.getImNumber();
        return new complexNumber(new_re,new_im);
    }
    //比较对象是否相同
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        complexNumber that = (complexNumber) o;
        return Double.compare(that.reNumber, reNumber) == 0 && Double.compare(that.imNumber, imNumber) == 0;
    }

    public String toString() {
        return this.reNumber+"+"+this.imNumber+"i";
    }
}
