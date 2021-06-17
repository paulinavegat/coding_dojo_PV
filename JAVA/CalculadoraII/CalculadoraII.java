import java.util.ArrayList;

public class CalculadoraII{
	//atributos
	private static double resultado;
	private static ArrayList<Double> numeros = new ArrayList<Double>();
	private static ArrayList<String> operaciones = new ArrayList<String>();

	//constructor
	public CalculadoraII() {
		
	}
	
	public ArrayList<Double>numeros(){
		return numeros;
	}
	
	public void performOperation(double num) {
		numeros.add(num);
	}
	public ArrayList<String>operaciones(){
		return operaciones;
	}
	
	public void performOperation(String operador) {
		operaciones.add(operador);
	}
	
	
	
	public void getResults() {
		for(int i = 0; i < operaciones.size(); i ++) {
			if (operaciones.get(i) == "*" || operaciones.get(i) == "/") {
				if (operaciones.get(i) == "*") {
					resultado = numeros.get(i) * numeros.get(i + 1);
				}
				else if (operaciones.get(i) == "/") {
					resultado = numeros.get(i) / numeros.get(i + 1);
				}
				numeros.set(i + 1, resultado);
				numeros.remove(i); //remover los numeros que se multiplicaban o dividian, dejando su resultado
				operaciones.remove(i); // remover la operacion de mult o dividir del conjunto de operaciones, ya que nos quedamos solo con su resultado
			}
		}
		for(int i = 0; i < operaciones.size(); i ++) {
			i = 0;
			if (operaciones.get(i) == "+" || operaciones.get(i) == "-") {
				if (operaciones.get(i) == "+") {
					resultado = numeros.get(i) + numeros.get(i + 1);
				}
				else if (operaciones.get(i) == "-") {
					resultado = numeros.get(i) - numeros.get(i + 1);
				}
				numeros.set(i + 1, resultado);
				numeros.remove(i);
				operaciones.remove(i);
			}
		}
		
		if (operaciones.get(0) == "=") {
			System.out.println("El resultado es: " + numeros);
		}
	}
}