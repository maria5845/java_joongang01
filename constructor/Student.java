package constructor;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int mat;

	public Student() {
		super();
	}

	public Student(String name, int kor, int mat, int eng) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String toString() {
		return name + "의점수는" + getTotal() + "점이고" + "평균은" + getAvg() + "학점은" + getGrade();
	}

	public int getTotal() {
		return kor + eng + mat;

	};

	public double getAvg() {
		return getTotal() / 3.0;

	}

	public char getGrade() {
		switch ((int) getAvg() / 10) {

		case 10:
		case 9:
			return 'A';

		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';

		}
	}
}
