package chap8;

public class Status {
	private String name;
	private int hitpoint;
	private int attack;
	private int defence;
	private int speed;

	Status(String na, int hi, int a, int b, int s) {

		name = na;
		hitpoint = hi;
		attack = a;
		defence = b;
		speed = s;
	}

	String getName() {
		return name;
	}

	int getHitpoint() {
		return hitpoint;
	}

	int getAttack() {
		return attack;
	}

	int getDefence() {
		return defence;
	}

	int getSpeed() {
		return speed;
	}

	void attackbuff(int aa) {
		attack = (attack * 3) / 2;
	}

	void attackdebuff(int aa) {
		attack = (attack / 3) * 2;
	}

	void defencebuff(int bb) {
		defence = (defence * 3) / 2;
	}

	void defencedebuff(int bb) {
		defence = (defence / 3) * 2;
	}

	void speedbuff(int ss) {
		speed = (speed * 3) / 2;
	}

	void speeddebuff(int ss) {
		speed = (speed / 3) * 2;
	}

}
