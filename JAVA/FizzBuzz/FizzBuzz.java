
public class FizzBuzz {
	  public String fizzBuzz(int numero) {
	
		  String retorno="";
		  //FizzBuzz si el número es divisible por 3 y 5
		  if(numero%3==0 && numero%5==0)
		  {
			  retorno ="FizzBuzz";
		  }
		  //Fizz si el número es divisible por 3
		  else if(numero%3==0)
		  {
		     
		      retorno ="Fizz";
		  }
		  //Buzz si el número es divisible por 5
		  else if(numero%5==0)
		  {
		      
		      retorno ="Buzz";
		  }
		  else{
		      retorno += numero;
		  }
		  //para el resto de los casos mostrará el número que se ingresó
	        return retorno;
	    }


}
