public class StringManipulator {
	public String trimAndConcat(String string1, String string2){
		String trimmed1 = string1.trim();
		String trimmed2 = string2.trim();
		String concated = trimmed1.concat(trimmed2);
		return concated;
	}
	public Integer getIndexOrNull(String string1, char char1){
		int i = string1.indexOf(char1);
		if(i == -1){
			return null;
		}
		return i;
	}
	public Integer getIndexOrNull(String string1, String string2) {
		int a = string1.indexOf(string2);
		if (a == -1){
			return -1;
		} 
		return a;
    }
	
	public String concatSubstring(String string1, int principio, int fin, String string2){
		String primero = "";
		for (int i = principio; i < fin; i++){
			primero += string1.charAt(i);
		}
		return primero.concat(string2);
	}
}
	