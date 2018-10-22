package L13_5;

public class ClarinetModel extends Model {
	  private String key_type;

	  public ClarinetModel(String builder, String model, String key_type) {
	    super(builder, model);
	    this.key_type = key_type;
	  }

	  public String toString() {
	    return builder + " Model/" + model + " キータイプ/" + key_type;
	  }
}