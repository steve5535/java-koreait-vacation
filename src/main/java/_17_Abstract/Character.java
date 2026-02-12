package _17_Abstract;

// 게임캐릭터, 기본틀(부모클래스)
// 추상 클래스: 추상메서드를 하나 이상 포함하는 클래스
public abstract class Character {
    protected String username;
    protected int HP;
    protected int attackDamage;

    public Character(String username, int HP, int attackDamage) {
        this.username = username;
        this.HP = HP;
        this.attackDamage = attackDamage;
    }

    public void showStatus() {
        System.out.println(username + "] 체력: " + HP);
    }

    // 데미지를 받는 메서드
    public void receiveDamage(int dmg) {
        System.out.println(username + "] " + dmg + "피해받음");
        this.HP -= dmg;
        if (this.HP <= 0) {
            this.HP = 0;
            System.out.println(username + "가 쓰러졌습니다");
        }
    }

    // 여러가지 직업의 캐릭터는 공격하는 방식은 서로달라짐
    // 어차피 오버라이딩 할거니까 {}(구현부) 생략
    // 오버라이딩 전용 메서드 - abstract(추상)
    public abstract void attack(Character target);

    public String getUsername() {
        return username;
    }
}
