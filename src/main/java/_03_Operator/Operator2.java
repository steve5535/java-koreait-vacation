package _03_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 논리연산사 - boolean 타입끼리 연산
        // 결과타입: boolean
        boolean hasLicense = true;
        int age = 25;
        // 운전가능?
        // and 연산자(&&): 둘다 true일때 true
        boolean canDrive = hasLicense && (age >= 20);

        // or 연산자(||): 둘 중 하나라도 true면 true
        boolean isWeekend = false;
        boolean isHoliday = true;
        boolean isRest = isHoliday || isWeekend;

        // not 연산자(!): boolean값을 반전
        boolean isOnline = true;
        boolean isOffline = !isOnline;

        // 상항연산자 -> 최종 값이 존재
        // boolean ? true일때값 : false일때값
        int x = 5;
        int y = 3;

        // 둘 중 큰 값
        int max = x > y ? x : y;
        // ? 이후 데이터의 타입이 중요하다
        boolean isSame = x == y ? true : false;
        String sameStr = x == y ? "같습니다" : "다릅니다";

        // 중첩
        age = 17;
        String ticketName = age >= 20 ? "성인요금"
                : age >= 14 ? "청소년요금"
                : "어린이요금";

        // 실습) 키가 120이상이면 "탑승가능", 아니라면 "탑승불가능"
        // 을 result에 대입해주세요
        int height = 110;
        String result = height >= 120 ? "탑승가능" : "탑승불가능";
        System.out.println(result);

        // 실습2) 게시글162
        // 한페이지에 20개씩 보인다면, 총페이지의 갯수를 pageCount에 대입
        // postCount를 바꾸어도 작동할 수 있게
        int postCount = 162;
        int pageCount;
        // 20개로 나누어 떨어지면 -> 20개로 나눈 값
        // 20개로 나누어 떨어지지x -> 20개로 나눈 값 + 1
        pageCount = postCount % 20 == 0 // 나누어 떨?
                ? postCount / 20 // 그럼 그냥 나눈값
                : postCount / 20 + 1;// 아니면 +1
        System.out.println(pageCount);
    }
}
