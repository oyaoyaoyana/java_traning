
public class Lesson_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Line line = new Line(0,0,3,4);
		line.draw();
		System.out.println(line.perimeter());
		System.out.println("");

		Circle circle = new Circle(100, 100, 20);
		circle.draw();
		System.out.println(circle.perimeter());

		Triangle triangle = new Triangle(0, 0, 100, 100, 0, 200);
		triangle.draw();
		System.out.println(triangle.perimeter());

		Rectangle rectangle = new Rectangle(0, 0, 100, 50);
		rectangle.draw();
		System.out.println(rectangle.perimeter());

		Square square = new Square(0, 0, 200);
		square.draw();
		System.out.println(square.perimeter());
	}

}
