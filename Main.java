import java.util.Scanner; //importa o input

public class Main{
	public static void main(String[] args) {
		int contador = 1;
		Scanner scanner = new Scanner(System.in);//Cria um input(python)
		System.out.println("Digite quantas nota voce ja teve:");     
	    
	    int qtN = scanner.nextInt();//Pede ao usuário as notas na qual ele já possui
	    
	    double[] Notas = new double[qtN];//Cria um arrays vazio com a qtd de elementos das Notas
	    
	    for(int i = 0; i < qtN; i++ ){
	  	    System.out.println("Digite as sua Nota"+ (i + 1 )+":");
		    Notas[i] = scanner.nextDouble();
		  }//pede as notas para o usuário
		
		
		double soma = 0;// Cria uma variavel nova para somar os elementos do arrays  
		
		for(int x= 0; x < Notas.length; x++){
		    soma += Notas[x];
		}//Soma os elementos do array
	    
	    double media = soma/qtN; // faz a média das Notas
	    
	    System.out.println("Sua media geral foi de:" + media);//Imprime o resultado
	    
		scanner.close();//Fecha o imput
	}
}
