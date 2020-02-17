package object;

public class ObjectEx04 {

	public static void main(String[] args) {

		    Employee em = new Employee();
		    em.setName("이순신");
		    em.setDept("개발부");
		    em.setPay(1500000);
		    em.setScore(85.75);
		    em.setEmployee("이찬용", "개발부", 150, 85.5);
		    System.out.println(em.toString());
		    System.out.println("이름"+em.getName());
		    System.out.println("부서"+em.getDept());
		    System.out.println("급여"+em.getPay());
		    System.out.println("급여"+em.getScore());
	
		    
		    
	}

}
