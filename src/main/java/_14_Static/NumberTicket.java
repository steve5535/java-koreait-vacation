package _14_Static;

public class NumberTicket {
    // 해당객체의 번호
    private int num;
    // 번호표를 뽑으면 nextNum 1 증가
    public static int nextNum = 1;

    // new 할때마다 번호표가 1씩 증가된 상태로 생성
    // static변수를 활용하여 초기화
    public NumberTicket(){
        this.num = nextNum++; // nextNum을 모든 객체가 공유하고 있어서
        System.out.println("발급번호: " + this.num);
    }

}
