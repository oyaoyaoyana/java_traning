
public class Wizard {
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("フトウデス");
		} else {
			this.name = name;
		}

	}
	public Wand getWand() {
		return wand;
	}
	public void setWand(Wand wand) {
		if (wand == null ) {
			throw new IllegalArgumentException("フトウデス");
		} else {
			this.wand = wand;
		}

	}
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	void heal(Hero h) {
		int basepoint = 10;
		int recovPoint = (int) (basepoint * this.wand.getPower() );
		h.setHp(h.getHp() + recovPoint);

	}
}
