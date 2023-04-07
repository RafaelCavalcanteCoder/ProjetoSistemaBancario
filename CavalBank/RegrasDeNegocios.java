package CavalBank;

import java.util.Scanner;

public class RegrasDeNegocios {
	
	String nome;
	String cpf;
	String pessoa ;
	String tipoConta ;  
	double saldo ;
	
	public RegrasDeNegocios(String nome, String tipoConta, double saldo) {
		this.saldo=saldo;
		this.nome=nome;
		this.tipoConta=tipoConta;
		 System.out.println(""" 
			 		Seja bem- vindo(a)
			 		Dados do Cliente: 
			 		
			 		""");
		System.out.println("Nome:                    " + nome);
		System.out.println("Tipo conta:              " + tipoConta);
		System.out.println("Saldo Inicial:           " + saldo);
		System.out.println("********************************************");
		System.out.println();System.out.println();
	}
	
	Scanner scan = new Scanner(System.in);
	public void regrasDeNegocio() {
		int i = 10;
		while(i!=5) {
		System.out.println();
		System.out.println("Operações");
		
		System.out.println();
		
		System.out.println("1- Consultar saldo");
		System.out.println("2- Receber valor");
		System.out.println("3- Transferir valor");
		System.out.println("4- Sair");
		
		
		double opcoes = scan.nextDouble();
		//opcao 1
		if(opcoes == 1) {
		System.out.println("Seu saldo atual é: " + saldo);
			}
		//opcao 2
		else if(opcoes == 2) {
		System.out.println("Digite o valor à receber: ");
			double valorRecebido = scan.nextDouble();
			saldo+=valorRecebido;
			System.out.println("Saldo atualizado R$ " + saldo);
			}	
		//opcao 3
		else if(opcoes == 3) {
			System.out.println("Digite o valor à transferir: ");
			double valorTransferido = scan.nextDouble();
				if(valorTransferido<=saldo) {
					System.out.println("o valor de R$ " + valorTransferido + " foi transferido com sucesso!");
					saldo-=valorTransferido;
				}else
					System.out.println("Seu saldo é insuficiente, transfência não realizada");
			}	
		//opcao 4
		else if(opcoes == 4) 
			break;
			else 
			System.out.println("Digite uma opção válida por favor!");
		}
		
		
		System.out.println("Obrigado pela Preferência até logo! ");
		
}
}
