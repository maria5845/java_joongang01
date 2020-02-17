package object;
/*
 * 클래스명 : Sales
 * item : String
 * qty : int
 * cost : int
 * getter & setter
 * 
 * toSting() : String
 * getPrice() : int
 * 
 */

class Sales {
	private String item;
	private int qty;
	private int cost;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getPrice() {
		return qty * cost;

	}

	public String toString() {
		return "품목 :" + item + "\n수량 :" + qty + "\n가격:" + cost + "\n금액 :" + getPrice() + "원";
	}

}

public class ObjectEx05 {

	public static void main(String[] args) {
		Sales sa = new Sales();
		sa.setItem("apple");
		sa.setQty(5);
		sa.setCost(1200);
		System.out.println(sa.toString());
		
		System.out.println(sa.getItem()+"  "+sa.getCost()+"원 짜리 "
				+sa.getQty()+"개를 구입하려면 "+sa.getPrice()+"원이 필요합니다.");
		

	}

}
