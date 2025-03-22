package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto product = new Produto(null, 0, 0);
		System.out.println("Informe os dados do produto ");
		System.out.print("Nome: ");
		product.nome = sc.nextLine();
		System.out.print("Preco: ");
		product.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.qntestoque = sc.nextInt();
		System.out.println();
		System.out.println("Dados do produto : " + product);
		System.out.println("Valor total: " + product.valorTotalEstoque());
		System.out.println();
		System.out.print("Informe o numero de produtos adicionados no estoque: ");
		int quantidade = sc.nextInt();
		product.addEstoque(quantidade);
		System.out.println();
		System.out.println("Dados do produto : " + product);
		System.out.println("Valor total: " + product.valorTotalEstoque());
		System.out.println();
		System.out.print("Informe o numero de produtos para retirar do estoque: ");
		quantidade = sc.nextInt();
		product.removeEstoque(quantidade);
		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println("Valor total: " + product.valorTotalEstoque());
		sc.close();

	}

}


