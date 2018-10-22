import java.util.Random;

public class Cleric {
	public static final int MAX_HP = 50;
	public static final int MAX_MP =10;

	private String name;
	int hp = 50;
	int mp = 10;

	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Cleric(String name) {
		this(name, MAX_HP, MAX_MP);
	}

	public  Cleric(String name, int hp) {
		this(name, hp, MAX_MP);
	}

	public void selfAid() {
		if(this.mp >= 5) {
			System.out.println("セルフエイド！hpがMAX!");
			this.mp-=5;
			this.hp = this.MAX_HP;
		} else {
			System.out.println("mpが足りない！セルフエイドに失敗した。");
		}
	}

	public String toString() {
		return "私は聖職者の" + this.name + "です";
	}

	public int pray(int sec) {
		System.out.println(sec +"秒間祈った");
		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		return recoverActual;
	}
}
