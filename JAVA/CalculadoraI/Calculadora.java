

	public class Calculadora {
		public double results;
		public double operandOne;
		public double operandTwo;
		public String operation;
		
		public Calculadora() {
			//constructor
		}
		
		// setter y getters
		public void setOperandOne(double opOne) {
			operandOne = opOne;

		}
		
		public double getOperandOne() {
			return operandOne;
		}

		public void setOperandTwo(double opTwo) {
			operandTwo = opTwo;

		}
		
		public double getOperandTwo() {
			return operandTwo;
		}
		
		public void setOperation(String funcion) {
			operation = funcion;
		}

		public String getOperation() {
			return operation;
		}

		public void setResults(double num) {
			results = num;

		}
		
		public double operaciones(double primerNum, String function, double segNum ) {
			
			setOperandOne(primerNum);
			setOperation(function);
			setOperandTwo(segNum);
			
			if (getOperation() == "+") {
				setResults(getOperandOne() + getOperandTwo());
			}
			if (getOperation() == "-") {
				setResults(getOperandOne() - getOperandTwo());
			}
			
			return getResults();
		}
		// Getter para resultados
		public double getResults() {
			
			System.out.println(getOperandOne() + " " + getOperation() + " " + getOperandTwo() + " = "  + results);
			return results;
		}
		
		
	}
	

