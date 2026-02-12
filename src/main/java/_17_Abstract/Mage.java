package _17_Abstract;

// Character 상속받아, attack 구현!
// 체력 80, 공격력 30
// target에게 매직애로우를 시전합니다 출력
public class Mage extends Character {
    public Mage(String username) {
        super(username, 80, 30);
    }

    @Override
    public void attack(Character target) {
        String targetName = target.getUsername();
        System.out.println(username + "] " + targetName + "에게 매직애로우를 시전했습니다");
        target.receiveDamage(this.attackDamage);
        System.out.println(targetName + "] " + attackDamage + "의 데미지를 받음");
    }
}
