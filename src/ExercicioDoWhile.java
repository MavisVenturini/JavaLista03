import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		int n, soma;
		Scanner sc=new Scanner(System.in);
		
		soma=0;
		do{
			System.out.print("Digite um numero: ");
			n=sc.nextInt();
			
			soma+=n;
		}while(n!=0);
		
		System.out.println("A soma dos numeros digitados eh: "+soma);
	}
}