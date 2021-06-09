import java.util.ArrayList;
import java.util.Arrays;

public class BasicoJava{
	public void Imprimir(){
		for(int i = 1; i < 256; i++){
			System.out.println(i);
		}
	}
	public void Impar(){
		for(int i = 1; i < 256; i++){
			if(i % 2 == 1){
				System.out.println(i);
			}
		}
	}
	public void ImprimirSuma(){
		int sum1 = 0;
		for(int i = 0; i < 256; i++){
			sum1 += i;
			String state = String.format("Nuevo numero: %d Suma: %d", i, sum1);
			System.out.println(state);
		}
	}
	public void Iterar(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	public void Max(int [] arr){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	public void Prom(int [] arr){
		int sum2 = 0;
		int Prom=0;
		for(int i = 0; i < arr.length; i++){
			sum2 += arr[i];
		}
		Prom=(sum2/arr.length);
		String state = String.format("Promedio de: %d",  Prom);
		System.out.println(state);
	}
	public void ImparArray(){
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i = 1; i < 256; i++){
			if(i % 2 == 1){
				y.add(i);
			} 
		} 
		System.out.println(y);
	}
	public void MayorqY(int [] arr, int val){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > val){
				count += 1;
			}
		}
		System.out.println(count);
	}

	public void AlCuadrado(int [] arr){
		for(int i = 0; i < arr.length; i++){
			int AlCuadrado = (arr[i] * arr[i]);
			arr[i] = AlCuadrado;
		}
		System.out.println(Arrays.toString(arr));
	}
	public void Negativo(int [] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 0){
				arr[i] = 0; 
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public void MaxMinProm(int [] arr){
		int max = arr[0];
		int min = arr[0];
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
			sum += arr[i];
		}
		int Prom = sum / arr.length;
		int [] sol = {max, min, Prom};
		System.out.println(Arrays.toString(sol));
	}
	public void Shift(int [] arr){
		for(int i = 0; i < arr.length; i++){
			if(i == arr.length - 1){
				arr[i] = 0;
				break;
			}
			int temp = arr[i+1];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	}
	

