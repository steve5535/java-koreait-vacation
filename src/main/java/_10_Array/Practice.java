package _10_Array;

public class Practice {
    public static void main(String[] args) {
        String[] employees = {"김철수", "이영희", "박민수", "최지우"};

        // 근무기록
        // {근무시간, 시급}
        int[][] workRecords = {
                {40, 11000}, // 김철수 기록
                {35, 12000}, // 이영희 기록
                {20, 13000},
                {45, 14000}
        };

        // 1. 전체 인건비 계산
        int totalPay = 0;
        for(int i = 0; i < workRecords.length; i++){
            int [] workRecord = workRecords[i];
            int hour = workRecord[0];
            int money = workRecord[1];
            int wage = hour * money;
            totalPay += wage;

        }
        System.out.println(totalPay);
        // 2. 근무시간이 30시간 미만인 사람의 이름 출력
        // workRecords를 순회, hour가 30미만인 데이터의 idx추출
        // 찾은 idx로 employees[idx] 이름을 가져올 수 있음
        // 이런 방법도 있음
        for(int i = 0; i < workRecords.length; i++){
            int workTime = workRecords[i][0];
            if(workTime < 30){
                System.out.println(employees[i]);
            }
        }
    }
}
