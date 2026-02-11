package _16_Inheritance.a;

public class Main {
    public static void printArea(Shape s) {
        // getArea는 실제객체 기준으로 실행
        // Shape을 상속받고 오버라이딩만 되면
        // 여러 도형을 추가하더라도, printArea는 코드가 변경될 이유가 x
        double area = s.getArea();
        System.out.println("면적: " + area);
    }

    public static void main(String[] args) {

        // 업캐스팅
        Shape s1 = new Square(10, 10);
        Shape s2 = new Triangle(10, 10);

        printArea(s1);
        printArea(s2);

    }
}
