package L13_5;

public class MusicShop {
  public static void main(String[] args) {
	  Model m_standard = new FluteModel("ムラマツ", "スタンダード", "リングキー", "総銀製");
	  Model m_handmade = new FluteModel("ムラマツ", "ハンドメイド", "カバードキー", "総銀製");
	  Model y_pro = new FluteModel("YAMAHA", "プロフェッショナルモデル", "カバードキー", "労部管銀製＋本体洋銀製");
	  Model sel_G10 = new ClarinetModel("SELMA", "G10", "17キー6リング");

	  Item f1 = new Flute("s00043", 40000, m_standard, "少し頭部管にキズがあります");
	  Item f2 = new Flute("s0978", 56000, m_standard, "タンポの交換が必要です");
	  Item f3 = new Flute("s04345", 70000, m_handmade, "ミントコンディションです");
	  Item f4 = new Flute("s34568", 45000, m_standard, "ケース内部が汚れています");
	  Item c1 = new Clarinet("hm99", 87000, sel_G10, "キーに少し遊びがあります");

	  Item[] in = {f1, f2, f3, f4, c1};

	  System.out.println("在庫商品一覧");
	  for(int i = 0;i < in.length; i++) {
	    System.out.println(in[i]);
	    System.out.println(in[i].description());
	  }

	    System.out.println("商品検索");
	    System.out.println(m_standard);

	    int count = 0;

	    for(int i = 0; i < in.length; i++) {
	    	if(in[i].model.match(m_standard)) {
	    		System.out.println(in[i].sirialNo + " " + in[i].price);
	    		count++;
	    	}
	    }
	    System.out.println(count+"件見つかりました");
  }
}