import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		int idade, menor21, maior50;
		Scanner sc=new Scanner(System.in);
		
		idade=0;
		menor21=0;
		maior50=0;
		while(idade!=-99){
			System.out.print("Digite uma idade: ");
			idade=sc.nextInt();
			
			if(idade>0 && idade<21){
				menor21++;
			}else if(idade>50){
				maior50++;
			}
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: "+menor21);
		System.out.println("Total de pessoas com mais de 50 anos: "+maior50);
	}

}
