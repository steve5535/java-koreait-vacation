package _25_Generic;

// 상한 경계 설정
// extends A
// 최상위부모인 Object가 아니라, A타입까지만 업캐스팅
public class Container<T extends Box> {
    private T box;

    public Container(T box) {
        this.box = box;
    }

    public void makePrint() {
        // 런타입때는 Object 취급이기 때문에
        // Box 타입 객체라는걸 보장할 수 없음

        // 런타입때 Box취급이 가능해짐(상한경계설정)
        box.printBox();
    }
}
