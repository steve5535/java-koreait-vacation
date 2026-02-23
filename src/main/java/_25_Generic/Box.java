package _25_Generic;

// 제네릭타입
// <T>, <K, V> , <K, V, E>
public class Box<T> {
    private T item; // 런타입에서 Object타입이 됨

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printBox() {
        System.out.println("저는 제네릭 수업용 객체입니다");
    }
}
