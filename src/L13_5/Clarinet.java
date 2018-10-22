package L13_5;

public class Clarinet extends Item {
	  static String inst = "B♭クラリネット";
	  protected String message;

	  public Clarinet(String sirialNo, int price, Model model, String message){
	    super(sirialNo, price, model);
	    this.message = message;
	  }
	  public String description() {
	    return message;
	  }

	  public String toString() {
	    return inst + "\n"+"シリアルNo:" + super.sirialNo+" 価格:" + super.price+"\n" + super.model;
	  }
}