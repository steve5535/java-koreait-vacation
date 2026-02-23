package _25_Generic;

public class Main {
    public static void main(String[] args) {
        ObjectBox box1 = new ObjectBox("500"); // String
        ObjectBox box2 = new ObjectBox(100); // Integer

        // 업캐스팅해서 저장했기 때문에
        // 꺼낼때 다운캐스팅을 해줘야 한다.
        // 컴파일에러가 아닌 런타임에러(사전에 감지x)가 발생
        if(box2.getItem() instanceof String) {
            // instanceof로 안전하게 다운캐스팅
            String myData = (String) box2.getItem();
        }

        // 제너릭타입(컴파일타입) - 컴파일러만 인식하는 타입
        // -> 런타입에는 업캐스팅 되어있음

        // 제네릭 타입은 사용하는 쪽에서 타입을 지정
        // 꺽쇄부분(<>)은 컴파일러만 읽음
        Box<String> gBox1 = new Box<String>("데이터!");
        Box<Integer> gBox2 = new Box<Integer>(500);

        // 컴파일러가 알아서 꺽쇄에 지정한 타입으로 다운캐스팅
        String gData1 = gBox1.getItem();
        Integer gData2 = gBox2.getItem();

        // -> 캐스팅을 컴파일러에세 일임하는 문법
    }
}
