package _17_Abstract;

public class Warrior extends Character {
    public Warrior(String username) {
        super(username, 120, 25);
    }

    // 추상메서드는 구현이 강제됨 - 오버라이딩 강제
    @Override
    public void attack(Character target) {
        String targetName = target.getUsername();
        System.out.println(username + "] " + targetName + "에게 강타를 시전합니다");
        target.receiveDamage(this.attackDamage);
        System.out.println(targetName + "] " + attackDamage + "의 데미지를 받음");
    }
}
