import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		// perguntar numeros
		// perguntar tipo de operação
		//imprimir resultado
		
		Scanner scannerUserInput = new Scanner(System.in);

		System.out.println("Introduza o primeiro número:");
		
		double firstNumber = scannerUserInput.nextDouble();
				
		System.out.println("Introduza o segundo número:");
		
		double secondNumber = scannerUserInput.nextDouble();
		scannerUserInput.nextLine();
		
		System.out.println("Que operação pretende fazer (+ - * / )?");
		
		String operator = scannerUserInput.nextLine();
		
		if(operator.equalsIgnoreCase("+")) {
			System.out.println(firstNumber + secondNumber);
		}
		if(operator.equalsIgnoreCase("-")) {
			System.out.println(firstNumber - secondNumber);
		}
		if(operator.equalsIgnoreCase("*")) {
			System.out.println(firstNumber * secondNumber);
		}
		if(operator.equalsIgnoreCase("/")) {
			System.out.println(firstNumber / secondNumber);
		}
		
		
		
		
	}

}
