public class Pitagoras{
	
  public static double calcularHipotenusa(int catetoA, int catetoB) {
    double hipotenusa = 0.0;
    hipotenusa = Math.sqrt( Math.pow(catetoA, 2) + Math.pow(catetoB, 2) );
    return hipotenusa;
  }
}
