package L13_6;

import java.util.Scanner;
import java.util.stream.Stream;

public class Lesson_13 {

	public static void main(String[] args) {
		boolean next = true;
		while(next) {
			System.out.println("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : ");
			Scanner scanner = new Scanner(System.in);
			int type = scanner.nextInt();
			Figure figure = createEmptyFigure(type);
			if(figure == null) {
				next = false;
				System.out.println("終了");
				break;
			}
			System.out.println(figure.returnName()+ "を作成します");
			System.out.println(figure.returnInstitution());
			int[] ints = indication_input();
			Figure newfigure = createFigure(type, ints);
			doOutput(type, newfigure);
			System.out.println("続行");
		}
	}

	private static int[] indication_input() {
		Scanner cs = new Scanner(System.in);
		String inp = cs.nextLine();
		int[] ints = Stream.of(inp.replaceAll(" ", "").split(",")).mapToInt(Integer::parseInt).toArray();
		return ints;
	}

	private static Figure createFigure(int type, int[] attr) {
		Figure object = null;
		switch (type) {
		case 0:
			object = new Circle(attr[0], attr[1], attr[2]);
			break;
		case 2:
			object = new Line(attr[0], attr[1], attr[2], attr[3]);
			break;
		case 3:
			object = new Triangle(attr[0], attr[1], attr[2], attr[3], attr[4], attr[5]);
			break;
		case 4:
			object = new Rectangle(attr[0], attr[1], attr[2], attr[3]);
			break;
		case 44:
			object = new Square(attr[0], attr[1], attr[2]);
			break;
		default:
			break;
		}
		return object;
	}
	private static void doOutput(int type, Figure figure) {
		figure.draw();
		System.out.println("周囲の長さは" + figure.perimeter());
		if(type >= 3) {
			Polygon polygon = (Polygon) figure;
			System.out.println("内角の和は" + polygon.getInternalAngle());
		}
	}

	private static Figure createEmptyFigure(int type) {
		Figure object = null;
		switch (type) {
		case 0:
			object = new Circle();
			break;
		case 2:
			object = new Line();
			break;
		case 3:
			object = new Triangle();
			break;
		case 4:
			object = new Rectangle();
			break;
		case 44:
			object = new Square();
			break;
		default:
			break;
		}
		return object;
	}
}

//switch (type) {
//case 0:
//	break;
//case 2:
//	break;
//case 3:
//	break;
//case 4:
//	break;
//case 44:
//	break;
//default:
//	break;
//}
