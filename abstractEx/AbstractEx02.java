package abstractEx;

abstract class Shape {
	abstract public void onDraw();

	abstract public void onDelete();

}

//-----------------------------------------------------------
class Rectangle extends Shape {

	@Override

	public void onDraw() {
		System.out.println("�簢���� �׸��� ");
	}

	public void onDelete() {
		System.out.println("�簢���� ����� ");
	}

}

class Circle extends Shape {

	@Override

	public void onDraw() {
		System.out.println("���� �׸��� ");
	}

	public void onDelete() {
		System.out.println("���� �����  ");
	}

}

public class AbstractEx02 {

	public static void main(String[] args) {

		// ���� ���ε�
		Circle cc = new Circle();
		Rectangle rt = new Rectangle();
		cc.onDraw();
		cc.onDelete();
		rt.onDelete();
		rt.onDraw();
		
		// ���� ���ε� 
		Shape sp =null;
		sp= new Circle();
		sp.onDelete();
		sp.onDraw();
		sp= new Rectangle();
		sp.onDelete();
		sp.onDraw();
		

		

	}

}
