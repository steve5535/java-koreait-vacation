package _24_Exception;

public class Exception02 {
    public static void m1() throws MyCheckedException{
        System.out.println("m1 호출되었습니다!");
        m2();
    }

    // throws: 나를 호출한 쪽에서 try-catch 해라
    public static void m2() {
        System.out.println("m2 호출되었습니다!");
        // 의도적으로 예외를 던져준다
        // throw new MyCheckedException("m2에서 체크예외 발생!");
        throw new MyRuntimeException("m2에서 런타임예외 발생!");
    }

    public static void main(String[] args) {
        /*
            Exception도 2가지 종류가 존재
            1. Checked Exception - 컴파일시점에 try-catch가 강제o
            2. Unchecked Exception - 컴파일시점에 try-catch가 강제x
         */
        try {
            // 호출 역순으로 예외객체가 이동함: 예외전파
            // m2 catch찾기 x -> m1 catch찾기 x -> main catch o
            m1();
        } catch (MyCheckedException e) {
            System.out.println("main에서 처리할게요");
            System.out.println(e.getMessage());
        } catch (MyRuntimeException e) {
            System.out.println("얘도 main에서 처리할게요");
            System.out.println(e.getMessage());
        }
    }
}
