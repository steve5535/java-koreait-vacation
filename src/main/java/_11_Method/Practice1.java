package _11_Method;

public class Practice1 {
    // 1. 숫자 하나를 매개변수로 전달받음
    // 2. 전달받은 숫자가 짝수이면 true, 홀수면 false리턴
    // 이름: isEven
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true; // 리턴만나면 함수 즉시 종료
        }
        return false;


    }

    // 2. int[] nums, int num을 매개변수로 전달받음
    // num이 nums에 존재하는 숫자인지?
    // 존재하면 true, 안하면 false리턴
    public static boolean containsNum(int[] nums, int num) {
        // num이 nums에 있는가?
        for (int number : nums) {
            if (number == num) {
                return true; // 찾으면 즉시 메서드 종료
            }
        }
        return false; // 못찾으면
    }


    public static void main(String[] args) {
        System.out.println(isEven(3));
        int[] array = {1, 2, 3, 4};
        System.out.println(containsNum(array, 1));
    }
}
