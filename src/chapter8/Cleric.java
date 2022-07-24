package chapter8;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが最大まで回復した");
	}
	
	public int pray(int praySec) {
		System.out.println(this.name + "は" + praySec + "秒祈った");
		Random rand = new Random();
		int recover = new Random().nextInt(3) + praySec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MP"+ recoverActual +"回復した");
		return recoverActual;
	}
}
