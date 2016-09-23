package chap8;

public class StatusTester {

	public static void main(String[] args) {
		Status Pikachu = new Status("ピカチュウ", 60, 60, 60, 60);
		Status Mewtwo = new Status("ミュウツー", 150, 150,150,150);

		Pikachu.attackbuff(1);
		Pikachu.defencebuff(1);
		Pikachu.speedbuff(1);
		Mewtwo.attackdebuff(1);
		Mewtwo.defencedebuff(1);
		Mewtwo.speeddebuff(1);

		System.out.println("・" + Pikachu.getName() + "のステータス");
		System.out.println();
		System.out.println("たいりょく：" + Pikachu.getHitpoint());
		System.out.println("こうげき：" + Pikachu.getAttack());
		System.out.println("ぼうぎょ：" + Pikachu.getDefence());
		System.out.println("すばやさ：" + Pikachu.getSpeed());

		System.out.println();

		System.out.println("・" + Mewtwo.getName() + "のステータス");
		System.out.println();
		System.out.println("たいりょく：" + Mewtwo.getHitpoint());
		System.out.println("こうげき：" + Mewtwo.getAttack());
		System.out.println("ぼうぎょ：" + Mewtwo.getDefence());
		System.out.println("すばやさ：" + Mewtwo.getSpeed());
	}
}