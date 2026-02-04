package _11_Method;

public class Practice2 {
    public static int calcTotal(int kor, int eng, int math) {
        return kor + eng + math;
    }

    public static double calcAvg(int totalScore) {
        return totalScore / 3.0;
    }

    public static String getGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void printStudentInfo(String name, int kor, int eng, int math) {

        // 메서드 3개를 완성해서 에러를 없애주세요
        // getGrade: 90이상 A, 80이상 90미만 B, 70이상 80미만 C, 이외에는 D
        int totalScore = calcTotal(kor, eng, math);
        double average = calcAvg(totalScore);
        String grade = getGrade(average);

        System.out.println("이름: " + name);
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + average);
        System.out.println("학점: " + grade);
    }


    public static void main(String[] args) {
        // 학생 성적관리
        printStudentInfo("김철수", 80, 70, 90);
        // main()
        // -> printStudentInfo()
        // -> calcTotal(), calcAverage(), getGrade()
    }
}
