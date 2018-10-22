
public class Wand {
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
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if(0.5 <= power && power <= 100.0) {
			this.power = power;
		} else {
			throw new IllegalArgumentException("フトウデス");
		}
	}

	private String name;
	private double power;
}
