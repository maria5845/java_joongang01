package constructor;

public class ConstructorEx05 {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("�Ƿη�");
		st.setKor(95);
		st.setEng(85);
		st.setMat(73);
		System.out.println(st.toString());
		Student ss = new Student("���޷�",95,85,73);
	    System.out.println("�̸� : " +ss.getName());
	    System.out.println("���� : " +ss.getKor());
	    System.out.println("���� : " +ss.getEng());
	    System.out.println("���� : " +ss.getMat());
	    System.out.println("���� : " +ss.getTotal());
	    System.out.printf("��� :%.2f " ,ss.getAvg());
	    System.out.println("���� : " +ss.getGrade());
	}

}
