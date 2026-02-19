package _22_Wrapper;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String[] scores = {"85", "92", "78", "96", "89"};
        // 1. scores 배열을 Integer배열로 변한해주세요
        Integer[] integersScores = new Integer[scores.length];
        for(int i = 0; i < scores.length; i++) {
            // scores에서 i번째 문자열 가져와서 integer로 변환
            Integer integerVal = Integer.valueOf(scores[i]);
            // integerScores의 i번째에 대입
            integersScores[i] = integerVal;

        }

        // 확인
        System.out.println(Arrays.toString(integersScores));

        // 2. 최고점, 최저점을 Integer.max(), min()을 통해 구해주세요
        Integer maxScore = integersScores[0];
        Integer minScore = integersScores[0];

        for(int i = 1; i < integersScores.length; i++) {
            maxScore = Integer.max(maxScore, integersScores[i]);
            minScore = Integer.min(minScore, integersScores[i]);
        }

    }
}
