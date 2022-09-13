package entidades;

public class Product {
	
	public String nome;
	public double preco;
	public int quant;
	
	public void estoque() {
		System.out.println("---DADOS---");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quant);
	    double valor_total = preco*quant;
	    System.out.println("Total: R$ " + String.format("%.2f", valor_total));
	}
	
	public void add(int x) {
		this.quant = quant + x;
		System.out.println("--DADOS ATUALIZADOS--");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quant);
	    double valor_total = preco*quant;
	    System.out.println("Total: R$ " + String.format("%.2f", valor_total));
	}
	
	public void rm(int x) {
		this.quant = quant - x;
		System.out.println("--DADOS ATUALIZADOS--");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quant);
	    double valor_total = preco*quant;
	    System.out.println("Total: R$ " + String.format("%.2f", valor_total));
	}
	
}
