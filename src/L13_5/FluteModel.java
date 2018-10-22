package L13_5;

public class FluteModel extends Model {
	private String key_type;
	private String material;

	public FluteModel(String builder, String model, String key_type, String material) {
		super(builder, model);
		this.key_type = key_type;
		this.material = material;
	}

	public String toString() {
		return builder + " Model/" + model + " キータイプ/"+key_type + " 素材/" + material;
	}

	public boolean match(Model other) {
		if(!super.match(other)) {
			return false;
		}
		if(!(other instanceof FluteModel)) {
			return false;
		}
		FluteModel fs = (FluteModel) other;

		if(!this.key_type.equals(fs.key_type)) {
			return false;
		}
		if(!this.material.equals(fs.material)) {
			return false;
		}
		return true;
	}
}
