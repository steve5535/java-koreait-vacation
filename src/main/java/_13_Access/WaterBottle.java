package _13_Access;

public class WaterBottle {
    private int currentWater = 100; // 현재물컵에 있는 물양

    public int getCurrentWater() {
        System.out.println("현재 물양: " + currentWater);
        return currentWater;
    }

    // 물을 채우는 메서드 - amount + currentWater
    // 1. amount가 음수 x
    // 2. 총량(1000ml) 넘으면 x
    // 3. 물을 채웠습니다 출력
    public void fill(int amount) {
        if (amount < 0) {
            System.out.println("음수x");
            return;
        }
        if (amount + currentWater > 1000) {
            System.out.println("1000ml가 넘으면 x");
            return;
        }
        currentWater += amount;
        System.out.println("물을 " + amount + "만큼 채웠습니다.");
    }

    // 물을 마시는 메서드
    // 1. amount가 음수 x
    // 2. 현재물의 양보다 더 많이 마실수 x
    // 3. 물을 마셨습니다 출력
    public void drink(int amount) {
        // private메서드는 클래스 내 다른 메서드에서 호출ok
        if (isPositive(amount)) {
            System.out.println("음수x");
            return;
        }
        if (amount > currentWater) {
            System.out.println("현재물의 양보다 더 많이 마실수 x");
            return;
        }
        currentWater -= amount;
        System.out.println("물을 " + amount + "만큼 마셨습니다.");
    }

    // private 메서드 -> 외부(main)에서 호출불가
    private boolean isPositive(int amount) {
        return amount > 0;
    }

}
