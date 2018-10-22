
public class SafeBox extends Box {
	private boolean lock_status = false;
	public SafeBox() {
	}

	@Override
	protected void lock() {
		System.out.println("施錠しました。");
		lock_status = true;
	}

}
