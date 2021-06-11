public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        System.out.println("Ejercicio 1: ");
        System.out.println(puzzle.mayorq10());

        System.out.println("Ejercicio 2: ");
        System.out.println(puzzle.nombres());

        System.out.println("Ejercicio 3: ");
        puzzle.abecedario();

        System.out.println("Ejercicio 4: ");
        System.out.println(puzzle.diezAleatorios());

        System.out.println("Ejercicio 5: ");
        puzzle.diezOrdenados();

        System.out.println("Ejercicio 6: ");
        puzzle.cadenasAl();

        System.out.println("Ejercicio 7: ");
        puzzle.diezCadenasAl();
    }
}
