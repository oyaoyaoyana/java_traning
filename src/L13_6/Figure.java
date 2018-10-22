package L13_6;

public interface Figure {
	/** 図形描写機能*/
	abstract public void draw();
	/** 長さ測定機能*/
	abstract public double perimeter();

	abstract public String returnName();

	abstract public String returnInstitution();
}
