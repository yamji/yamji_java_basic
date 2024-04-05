package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 패키지 접근 불가
        //DefualtClass1 calss1 = new DefualtClass1();
        //DefualtClass2 calss2 = new DefualtClass2();
    }
}
