package entidades;

public class Employee {
	
	public String nome;
	public double salariobruto;
	public double imposto;
	
	public double NetSalary() {
		return salariobruto-imposto;
	}
	
    public void updateSalary(double x) {
    	System.out.print(((x/100)*salariobruto)+salariobruto-imposto);
    }
	

}
