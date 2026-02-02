package _10_Array;

public class MultiArray {
    public static void main(String[] args) {
        // 다중배열
        // 이중배열
        String[] seatA = {"A1", "A2", "A3"}; // 0x1000
        String[] seatB = {"B1", "B2", "B3"}; // 0x2000
        String[] seatC = {"C1", "C2", "C3"}; // 0x3000

        // seats 배열이 뭘 저장하고 있는 걸까?
        // seats 0x5000
        // String[] -> String저장하는 배열
        // String[][] -> String[]저장하는 배열
        String[][] seats = {seatA, seatB, seatC};
        String[] bSeat = seats[1]; // 0x2000
        String B2 = bSeat[1]; // 0x2000에서 한칸 더

        // 0x5000에서 1번칸, 1번칸 주소로가서 1번칸을 한번 더
        String b2 = seats[1][1];

        // seats로 시작하여 A3, C1을 읽어와 출력!
        String A3 = seats[0][2];
        String C1 = seats[2][0];
        System.out.println("A3: " + A3 + ", C1: " + C1);

    }
}
