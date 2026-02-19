package _23_Singleton;

// 싱글톤패턴(스프링부트, 스프링...이외에서도 매번 출현)
// 서버 전체에서 단 하나의 객체를 공유하게 하고 싶다
// -> 상태(필드값)가 고정값인 객체
public class Logger {
    /*
        어떻게 구현할까?
        1. 생성자 - private로 외부생성을 제한
        2. public 메서드로 하나만 돌려쓸수 있도록 구현
        3. 외부에 공유할 단 하나의 객체 변수를 필드로 가진다
     */

    // private로 외부접근을 막는다
    // 전역에서 하나를 공유할 필드
    private static Logger instance;

    // 기본생성자를 private로 막음
    private Logger() {}

    // 외부접근용 메서드
    public static Logger getInstance() {
        // 단 하나의 객체를 리턴하면 된다
        if(instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    // static 아님 -> 객체 생성 이후 사용가능
    public void log(String msg) {
        System.out.println("LOGGER: " + msg);
    }

    public void errorLog(String msg) {
        System.out.println("ERR: " + msg);
    }

}
