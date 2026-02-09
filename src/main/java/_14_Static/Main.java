package _14_Static;

public class Main {
    /*
        public: 외부에서 접근 ok
        static: 객체 생성없이 실행가능
        void: 리턴x, 오로지 프로그램 실행만 담당
     */
    public static void main(String[] args) {

        // 생성자 호출 3회
        StaticData staticData1 = new StaticData(1);
        StaticData staticData2 = new StaticData(2);
        StaticData staticData3 = new StaticData(3);

        // count는 객체마다 가지고 있는 인스턴스 필드
        // 최초호출 0 -> 1 증가
        System.out.println(staticData1.count); // ?
        System.out.println(staticData2.count); // ?
        System.out.println(staticData3.count); // ?

        // staticCount
        // static변수는 모든 인스턴스가 공유하는 단 하나의 주소
        // 별도의 메모리공간에 존재 - 참고) Method Area
        System.out.println(staticData1.staticCount); // 3
        System.out.println(staticData2.staticCount);
        System.out.println(staticData3.staticCount);

        // 클래스에 저장되는 정보이기때문에
        // 클래스로 참조해야 한다(권장)
        System.out.println(StaticData.staticCount);

        NumberTicket numberTicket = new NumberTicket();
        NumberTicket numberTicket1 = new NumberTicket();
        NumberTicket numberTicket2 = new NumberTicket();
    }
}
