package object;

public class ObjectEx04 {

	public static void main(String[] args) {

		    Employee em = new Employee();
		    em.setName("�̼���");
		    em.setDept("���ߺ�");
		    em.setPay(1500000);
		    em.setScore(85.75);
		    em.setEmployee("������", "���ߺ�", 150, 85.5);
		    System.out.println(em.toString());
		    System.out.println("�̸�"+em.getName());
		    System.out.println("�μ�"+em.getDept());
		    System.out.println("�޿�"+em.getPay());
		    System.out.println("�޿�"+em.getScore());
	
		    
		    
	}

}
