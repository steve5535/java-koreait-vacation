package _19_Object;

import java.util.Objects;

// 필드만 선언했는데 추가해줘야하는 코드 -> '보일러플레이트 코드'
// 필드가 변경되었을때 알아서 작성되도록
// 라이브러리를 통해서 해결
public class ObjectCar {
    private String model;
    private String color;
    private int year;

    public ObjectCar(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ObjectCar objectCar = (ObjectCar) o;
        return year == objectCar.year && Objects.equals(model, objectCar.model) && Objects.equals(color, objectCar.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, year);
    }

    @Override
    public String toString() {
        return "ObjectCar{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
