package abstractEx;

abstract class Shape {
	abstract public void onDraw();

	abstract public void onDelete();

}

//-----------------------------------------------------------
class Rectangle extends Shape {

	@Override

	public void onDraw() {
		System.out.println("사각형을 그린다 ");
	}

	public void onDelete() {
		System.out.println("사각형을 지운다 ");
	}

}

class Circle extends Shape {

	@Override

	public void onDraw() {
		System.out.println("원을 그린다 ");
	}

	public void onDelete() {
		System.out.println("원을 지운다  ");
	}

}

public class AbstractEx02 {

	public static void main(String[] args) {

		// 정적 바인딩
		Circle cc = new Circle();
		Rectangle rt = new Rectangle();
		cc.onDraw();
		cc.onDelete();
		rt.onDelete();
		rt.onDraw();
		
		// 동적 바인딩 
		Shape sp =null;
		sp= new Circle();
		sp.onDelete();
		sp.onDraw();
		sp= new Rectangle();
		sp.onDelete();
		sp.onDraw();
		

		

	}

}
