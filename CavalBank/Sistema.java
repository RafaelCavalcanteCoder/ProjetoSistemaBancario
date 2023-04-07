package CavalBank;

import java.util.Scanner;

public class Sistema {

	
	public static void seguranca() {
		//Sistema de LOGIN
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo(a) ao sistema Bancario.");
		System.out.println("digite seu CPF e senha para acessar sua conta: "); System.out.println();
	System.out.println("CPF: ");
		String cpf = scan.nextLine();
		System.out.println("Agora digite sua senha: ");
		String senha= scan.nextLine();
		
		//Contas
		if(cpf.equals("44179381860") && senha.equals("123123")) {
		RegrasDeNegocios cliente1 = new RegrasDeNegocios("Rafael Carvalho", "conta corrente", 2000);
		cliente1.regrasDeNegocio();
		
		}else if(cpf.equals("1299906041") && senha.equals("123456")) {
			RegrasDeNegocios cliente1 = new RegrasDeNegocios("Fabiana Santos", "Poupança", 2500);
			cliente1.regrasDeNegocio();
			
		}else if(cpf.equals("1299906041") && senha.equals("123456")) {
			RegrasDeNegocios cliente1 = new RegrasDeNegocios("Alberto", "Conta-Corrente", 2500);
			cliente1.regrasDeNegocio();
		}else 
			System.out.println("Login ou senha incorretos, sistema bloqueado!");
	}
}