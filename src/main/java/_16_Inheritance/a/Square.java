package _16_Inheritance.a;

// 사각형 - Shape을 상속받고, getArea를 오버라이딩
// 생성자 정의
// getArea를 구현해주세요 - 가로 x 세로
public class Square extends Shape {
    private int width;
    private int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
