package _11_Method;

public class StackHeep {
    public static void changeNum(int num) {
        System.out.println("changeNum 호출됨!");
        num += 3;
    }

    public static void changeArray(int nums[]) {
        System.out.println("changeArray 호출됨!");
        nums[0] = 999;
    }

    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println(num); // ? 10
        // 함수 호출별로 각기 다른 stack 메모리 공간을 가지고있기 때문

        int[] nums = {1, 2, 3};
        System.out.println(nums[0]); // 1
        changeArray(nums);
        System.out.println(nums[0]); // ? 999
    }
}
