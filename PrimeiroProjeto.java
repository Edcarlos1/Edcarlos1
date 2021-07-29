package Testes;

public class PrimeiroProjeto {
	public static void main(String[] args) {
		System.out.println("Hello Word");
		
		if(args.length == 6) {
			
			//input
			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean java = Boolean.valueOf(args[4]);
			int qtdeMes = Integer.valueOf(args[5]);
			
			//processamento
			int anoNascimento = 2021 - idade;
			float salarioTotal = salario * qtdeMes;
			
			//Output
			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: "+ sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Ano de Nascimento: " + anoNascimento);
			System.out.println("Salario mensal " + salario);
			System.out.println("Recebimento: " + salarioTotal);
			System.out.println("Devjava: " + java);		
		} else {
			System.out.println("Deu Ruim");
			
		}
		
		
	}
	
}
			
	
	
	
		
		
		
	
	


		
