package Ref;

public class NullMain3 {
    public static void main(String[] args) {

        BigData bigData = new BigData();
        System.out.println("bigdata.count=" + bigData.count);
        System.out.println("bigdata.data=" + bigData.data);

        //NullPointerException
        System.out.println("bigdata.value=" + bigData.data.value);
    }
}
