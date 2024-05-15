import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	/**
	
	 */
	public static void main(String[] args){
		try{
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
			
		if(parametroUm < parametroDois ){
		for(int resul = parametroUm; parametroUm < parametroDois; parametroUm ++ ){
            System.out.println("imprimindo o numero " + (parametroUm - resul + 1));
        }
			}else{ System.out.println("Parametro um maior que parametro dois");}
	}	
		
	catch (InputMismatchException e){
			System.out.println("Digite uma numeração válida ");
		}
}
}