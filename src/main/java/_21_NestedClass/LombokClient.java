package _21_NestedClass;

import lombok.*;

// 롬복 라이브러리
// @Getter @Setter @ToString @EqualsAndHashCode
@Builder
@AllArgsConstructor // 모든 필드 생성자
@NoArgsConstructor // 기본 생성자
// @RequiredArgsConstructor // final 필드 생성자
@Data // 게터, 세터, Object오버라이딩, final필드생성자
public class LombokClient {
    private String name;
    private String ip;
    private String deviceName;
}
