
public class ExercicioFor {

	public static void main(String[] args) {
		
		System.out.println("Os numeros de 1000 a 1999 que quando divididos por 11 obtemos resto 5 são:");
		
		for(int i=1000;i<2000;i++) {
			if(i%11==5) {
				System.out.println(i);
			}
		}
	}

}