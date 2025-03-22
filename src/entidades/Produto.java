package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int qntestoque;
	
	public double valorTotalEstoque () {
		return preco * qntestoque;
	}
	
	public void addEstoque(int qntestoque) {
		this.qntestoque += qntestoque;
	}
	
	public void removeEstoque (int qntestoque) {
		this.qntestoque -= qntestoque;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQntestoque() {
		return qntestoque;
	}
	public void setQntestoque(int qntestoque) {
		this.qntestoque = qntestoque;
	}
	
	public Produto(String nome, float preco, int qntestoque) {
		this.nome = nome;
		this.preco = preco;
		this.qntestoque = qntestoque;
	}
	
	public String toString() {
		return "\nnome: " + nome + " \npreco: " + preco + " \nquantidade do estoque: " + qntestoque + "";
	}
	
	
}
