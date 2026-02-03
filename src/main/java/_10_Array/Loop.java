package _10_Array;

public class Loop {
    public static void main(String[] args) {
        // 2중 for문 + 2중 배열
        String[][] seats = {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4"},
        };

        for(int i = 0; i < seats.length; i++){
            String[] seat = seats[i];
            for(int j = 0; j < seat.length; j++){
                String seatName = seat[j];
                System.out.print(seat[j] + " ");
            }
            System.out.println();// 줄바꿈
        }

        int[][] numArrays = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        // numArrays에 있는 짝수들을 2중 for문으로
        // 모두 더한 값을 출력해 주세요

        int evenSum = 0;
        for(int i = 0; i < numArrays.length; i++){
            int[] numArray = numArrays[i];
            for(int j = 0; j < numArray.length; j++){
                int num = numArray[j];
                if(num % 2 == 0){
                    evenSum += num;
                }
            }
        }
        System.out.println(evenSum);

        // DB 모방
        String[] department = {"인사부", "행정부", "사업부"};
        String[][] employees = {
                {"김길동", "고길동", "박길종"}, // 인사부
                {"김영희", "고영희", "박영희"}, // 행정부
                {"김철수", "고철수", "박철수"} // 사업부
        };

        // "사업부"이면서, "김길동"인 사랑이 있는지 확인하는 코드

        // 1. 사업부가 있는 부서이름인가? -> 있으면 부서의 idx추출
        int deptIdx = -1; // 사업부가 있는지 확인하는 변수

        // 사업부가 있는지 확인 / idx 업데이트
        for(int i = 0; i < department.length; i++){
            String deptName = department[i];
            if(deptName.equals("사업부")){
                deptIdx = i; // idx를 찾아야함
                break;
            }
        }

        if(deptIdx == -1){
            System.out.println("사업부는 존재하지x");
            return; // main종료
        }

        // 사업부의 idx를 추출했다면
        // 사원명단에서 사업부 명단만 가져오자
        String[] businessDept = employees[deptIdx];
        // for문으로 김길동 찾기
        for(String name: businessDept){
            if(name.equals("김철수")){
                System.out.println("찾았습니다!");
                return; // main종료
            }
        }

        System.out.println("못 찾았습니다!");


    }
}
