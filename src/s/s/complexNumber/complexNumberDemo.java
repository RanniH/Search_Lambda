package s.s.complexNumber;

public class complexNumberDemo {
    public static void main(String[] args) {
        //创建复数类的两个对象进行演示
        complexNumber cn1 = new complexNumber(1,2);
        complexNumber cn3 = new complexNumber(1,2);
        complexNumber cn2 = new complexNumber();
        cn2.setReNumber(2);
        cn2.setImNumber(3);
        //加法演示
        complexNumber addResult = complexNumber.getAdd(cn1, cn2);

        System.out.println("cn1+cn2:"+addResult.toString());
        //减法演示
        complexNumber subResult = complexNumber.getSub(cn1, cn2);

        System.out.println("cn1-cn2:"+subResult.toString());
        //乘法演示
        complexNumber mulResult = complexNumber.getMul(cn1, cn2);

        System.out.println("cn1*cn2="+mulResult.toString());
        //equals方法演示
        boolean result1 = cn1.equals(cn2);
        boolean result2 = cn1.equals(cn3);

        System.out.println("cn1=cn2:"+result1+"   cn1=cn3:"+result2);
    }
}
