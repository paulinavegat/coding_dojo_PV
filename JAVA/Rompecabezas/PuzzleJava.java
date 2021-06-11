import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> mayorq10() {
        int [] values = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 10) {
                result.add(values[i]);
            }
        }
        return result;
    }
    public ArrayList<String> nombres() {
        ArrayList<String> personas = new ArrayList<String>();
        personas.add("Nancy");
        personas.add("Jinichi");
        personas.add("Fujibayashi");
        personas.add("Momochi");
        personas.add("Ishikawa");
        Collections.shuffle(personas);
        ArrayList<String> longerThan5 = new ArrayList<String>();
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
            if(personas.get(i).length() > 5) {
                longerThan5.add(personas.get(i));
            }
        }
        System.out.println("Nombres que tienes más de 5 caracteres: ");
        return longerThan5;
    }
    public void abecedario() {
        char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> letters = new ArrayList<Character>();
        for (int i = 0; i < abc.length; i++) {
            letters.add(abc[i]);
        }
        Collections.shuffle(letters);
        System.out.print("última letra del arreglo: ");
        System.out.println(letters.get(letters.size()-1));
        System.out.print("Primera letra del arreglo: ");
        System.out.println(letters.get(0));
        if(letters.get(0) == 'a' || letters.get(0) == 'e' || letters.get(0) == 'i'
        || letters.get(0) == 'o' || letters.get(0) == 'u' || letters.get(0) == 'y') {
            System.out.println("La primera letra en la lista es una vocal");
        }
    }
    public ArrayList<Integer> diezAleatorios() {
        ArrayList<Integer> randoms = new ArrayList<Integer>();
        Random r = new Random();
        int num = 0;
        for(int i = 0; i <= 10; i++) {
            num = r.nextInt(100);
            if(num < 55) {
                i-=1;
            }
            else {
                randoms.add(num);
            }
        }
        return randoms;
    }
    public ArrayList<Integer> diezOrdenados() {
        ArrayList<Integer> toSort = diezAleatorios();
        Collections.sort(toSort);
        float min = toSort.get(0);
        float max = toSort.get(0);
        for (int i = 0; i < toSort.size(); i++) {
            System.out.println(toSort.get(i));
            if (toSort.get(i) < min) {
                min = toSort.get(i);
            }
            else if (toSort.get(i) > max) {
                max = toSort.get(i);
            }
        }
        String statement1 = String.format("%s: %.2f", "Maximo", max);
        String statement2 = String.format("%s: %.2f", "Minimo", min);
        System.out.println(statement1);
        System.out.println(statement2);
        
        return toSort;
    }
    public String cadenasAl() {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String result = "";
        Random r = new Random();
        for(int num = 1; num <= 5; num++) {
            result+=alpha[r.nextInt(alpha.length)];
        }
        System.out.println(result);
        return result;
    }
    public ArrayList<String> diezCadenasAl() {
        ArrayList<String> diezAleatorio = new ArrayList<String>();
        String string = "";
        for (int num = 1; num <= 10; num++) {
            string = cadenasAl();
            diezAleatorio.add(string);
        }
        System.out.println(diezAleatorio);
        return diezAleatorio;
    }
}