package controller;

public class SobrecargaMetodo {
	private static final int Valor2 = 0;
	int idade;
	String nome;
	
	public static void main(String[] args) {
	}


	public void cadastrarPessoa (int valor) {
	  idade = valor;
	  System.out.println("idade: "+idade);
	}

	public void cadastrarPessoa (String valor) {
		nome=valor;
		System.out.println("nome: "+ nome);
		
	}

	public void cadastrarPessoa (int Valor1,String string )
	{
	idade = Valor1;
	idade = Valor2;
	System.out.println("idade:"+idade+"-Nome"+nome);
	}

	public static void main1 (String[] args) {
		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(28);
		scm.cadastrarPessoa("Michael Ferreira");
		scm.cadastrarPessoa(35, "Fabrício Gomes)");
	}}

