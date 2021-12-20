package collections_exercícios;

import java.util.Scanner;

import collections.C_Exemplo2Aula;

public class Ex_C {

	Scanner ler = new Scanner(System.in);
	
	
	private String produto;
	private int quantidade;
	
	public Ex_C(String produto, int quantidade)
	{
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public String toString() //  
	{
		return " Roupa : " +this.produto + "| Preço : "+this.quantidade +" Reais";
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

	
	
	}


