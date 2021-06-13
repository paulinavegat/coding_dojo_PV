import java.util.ArrayList;

public class ListaExcepciones {
	    public static void main(String[] args) {
	        ArrayList<Object> myList = new ArrayList<Object>();
	        myList.add("13");
	        myList.add("Hola Mundo");
	        myList.add(48);
	        myList.add("Adios Mundo");
	        for (int i = 0; i < myList.size(); i++) {
	            try {
	            Integer castedVal = (Integer) myList.get(i);
	            System.out.println("Added " + String.valueOf(castedVal) + " to the list.");
	            } catch (ClassCastException e){
	                String errorIndice = String.valueOf(i);
	                String valor = String.valueOf(myList.get(i));
	                System.out.println("ERROR: No se puede convertir el elemento a Integer. Se produjo el error en el índice " +
	                errorIndice + " y el valor del objeto fue " + valor + ".");
	            }
	        }
	        System.out.println("Completado");
	    }
	}