package _24_Exception;

// 커스텀 언체크예외(런타임예외) - RuntimeException 상속
// 일반적으로 커스텀예외는 런타임예외를 말함
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException(String msg) {
        super(msg);
    }

}
