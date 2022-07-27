package chapter10;

public class PoisonMatango extends Matango {
	
	int poisonCount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void poisonAttack(Hero h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int poisonDamage = h.hp / 5;
			System.out.println(poisonDamage + "のダメージ");
			h.hp -= poisonDamage;
			this.poisonCount--;
		}
	}
	
}
