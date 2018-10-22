package L13_5;

//商品の製品モデルを登録するための抽象クラス
public abstract class Model implements Match{
	protected String builder;
	protected String model;

	public Model(String builder, String model) {
	  this.builder = builder;
	  this.model = model;
	}

	public String toString() {
	  return builder + " Model/"+model;
	}

	public boolean match(Model other) {
		if(!this.builder.equals(other.builder)) {
			return false;
		}
		if(!this.model.equals(other.model)) {
			return false;
		}
		return true;
	}
}