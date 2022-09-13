package entidades;

public class Student {
	
	public String name;
	public double t1, t2, t3;
	
	public void result() {
		double soma = t1+t2+t3;
		System.out.println("FINAL GRADE: " + String.format("%.2f", soma));
		if (soma >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", 60 - soma) + " POINTS");
		}
	}

}
