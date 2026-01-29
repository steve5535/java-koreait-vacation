package _08_For;

public class NestedFor {
    public static void main(String[] args) {
        // 2중 for문

        // 한달
        // 바깥반복이 한번돌때 안쪽 반복이 전체반복
        for(int week = 1; week <= 4; week++){
            System.out.println(week + "주 시작!");
            for(int day = 1; day <= 7; day++){
                System.out.println("\t" + day + "일 살았습니다");
            }
            System.out.println(week + "주 끝!");
        }

        // 구구단

        for(int dan = 2; dan <= 9; dan++){
            System.out.println(dan + "단 시작!");
            for(int i = 1; i <= 9; i++){
                System.out.println("\t" + dan + "x" + i + " = " + dan * i);
            }
            System.out.println(dan + "단 끝!");
        }
    }
}
