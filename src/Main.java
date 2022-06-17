import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import Classes.BussinesAcount;
//import Classes.Conta;
//import Classes.SavingsAccount;
import Classes.Empregados;
import Classes.Terceirizados;

public class Main {
	
	public static void main(String[] args) {
		
		List<Terceirizados> lista = new ArrayList<>();
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de funcionario:");
		int qtd = sc.nextInt();
		
		Terceirizados novo;
				
		for(int x=0; x<qtd; x++) {
			novo = new Terceirizados();
			novo.setAdicional(0);
			System.out.print("Numero de Matricula:");			
			novo.setMatricula(sc.nextInt());
			sc.nextLine();
			System.out.print("Nome do funcionario:");			
			novo.setName(sc.nextLine());			
			System.out.print("Horas trabalhadas:");
			novo.setHours(sc.nextInt());
			System.out.print("Valor da hora:");
			novo.setValorhora(sc.nextDouble());
			System.out.print("E um funcionario teireizado? (s/n)") ;
			char resp = sc.next().charAt(0) ;
			if(resp == 's') {
				System.out.println("Digite o valor adicional:") ;
				novo.setAdicional(sc.nextDouble());				
				System.out.printf("Matricula: %d , Nome funcionario: %s , Trabalhou: %d horas , Valor hora: %.2f , Adicional %.2f%n" , novo.getMatricula(), novo.getName(), novo.getHours(), novo.getValorhora(), novo.getAdicional());				
				
			}else {
				System.out.printf("Matricula: %d , Nome funcionario: %s , Trabalhou: %d horas , Valor hora: %.2f%n", novo.getMatricula(), novo.getName(), novo.getHours(), novo.getValorhora());
			}
			lista.add(novo);
			System.out.println();
			
		} 
		System.out.println("Fim do Sistema\n");
		
		for(Terceirizados cc: lista) {		
			System.out.printf("Matricula %d , Funcionario: %s, Salario: %.2f%n", cc.getMatricula(), cc.getName(), cc.getValorhora()*cc.getHours() + cc.getAdicional());
		}				
		
		/*
		Conta cc1 = new BussinesAcount(1001, "Sergio Valadao", "Não Sei", 1000.00, 500.00);
		
		Conta cc2 = new Conta(1002, "Sergio Valadao", "Não Sei", 1000.00);
		
		Conta cc3 = new SavingsAccount(1003, "Sergio Valadao", "Não Sei", 1000.00, 10.00);
		
		SavingsAccount sav = new SavingsAccount(1004, "Sergio Valadao", "Não Sei", 1000.00, 0.01);
				
		System.out.print(cc1.toString());
		System.out.print(cc2.toString());
		System.out.print(cc3.toString());
		
		cc1.retirada(200.0);
		System.out.println(cc1.getBalance());
		cc2.retirada(100.0);
		System.out.println(cc2.getBalance());
		
		cc3.retirada(100.0);
		System.out.println(cc3.getBalance());
		sav.calculaJuros(sav.getInterestRating());
		System.out.print(sav.toString());
		
		//System.out.printf("Nome: %s, Preço: %.2f, Quantidade: %d, Total: %.2f", nome, preco, qtd, total);
		*/
		
		
		sc.close();

	}

}
