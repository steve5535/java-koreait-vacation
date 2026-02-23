package _25_Generic;

public class ObjectBox {
    // Object는 최상위 부모타입
    // 모든 참조자료형들이 item에 담실 수 있음(업캐스팅)
    private Object item;

    public ObjectBox(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
