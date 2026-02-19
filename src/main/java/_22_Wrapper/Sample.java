package _22_Wrapper;

// Integer클래스를 묘사
public class Sample {
    private int intVal;

    private Sample(int number) {
        this.intVal = number;
    }

    // 캐싱 - 미리 객체를 만들어놓는다
    private static Sample[] samples = {
            new Sample(0),
            new Sample(1),
            new Sample(2),
            new Sample(3),
            new Sample(4)
    };

    private static Sample instance;

    // 외부에서 유일하게 Sample을 생성할 수 있는 메서드
    public static Sample valueOf(int n) {
        // 값이 같다면, 미리 만들어놓은 객체를 리턴
        for (Sample sample : samples) {
            if(sample.intVal == n) {
                return sample;
            }
        }

        return new Sample(n);
    }
}
