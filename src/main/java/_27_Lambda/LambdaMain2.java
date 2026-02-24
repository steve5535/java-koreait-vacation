package _27_Lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaMain2 {
    public static void main(String[] args) {
        // "표준" 함수형 인터페이스 -> stream API함수들이 매개변수로 받음
        // 1. Function<T, R>: R apply(T t);
        // 2. Consumer<T>: void accept(T t);
        // 3. Supplier<T>: T get();
        // 4. Predicate<T>: boolean test(T t);

        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("저는 컨슈머타입의 printer에요");

        Supplier<RuntimeException> myError = () -> new RuntimeException("내 에러");
        throw myError.get();
    }
}
