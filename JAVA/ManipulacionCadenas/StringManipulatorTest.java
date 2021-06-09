public class StringManipulatorTest {
	public static void main (String[] args) {
		
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str); // HolaMundo 

	
		StringManipulator manipulator2 = new StringManipulator();
		char letter = 'n';
		Integer a = manipulator2.getIndexOrNull("Coding", letter);
		Integer b = manipulator2.getIndexOrNull("Hola Mundo", letter);
		Integer c = manipulator2.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1

	
		StringManipulator manipulator3 = new StringManipulator();
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		Integer a1 = manipulator3.getIndexOrNull(word, subString);
		Integer b1 = manipulator3.getIndexOrNull(word, notSubString);
		System.out.println(a1); // 2
		System.out.println(b1); // -1

		
		StringManipulator manipulator4 = new StringManipulator();
		String word2 = manipulator4.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word2); // olmundo


		
	}
}
