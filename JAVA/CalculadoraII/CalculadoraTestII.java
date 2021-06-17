
public class CalculadoraTestII {

	
		public static void main(String[] args) {
			CalculadoraII calc= new CalculadoraII();
			calc.performOperation(10.5);
			calc.performOperation("+");
			calc.performOperation(5.2);
			calc.performOperation("*");
			calc.performOperation(10);
			calc.performOperation("=");
			calc.getResults();
			//Donde el resultado debería ser 62.5
			
		
	}

}
