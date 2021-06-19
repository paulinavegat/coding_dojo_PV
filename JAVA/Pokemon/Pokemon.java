
public class Pokemon{
	
	//variables
	private String name;
	private int health;
	private String type;
	private static int pokemonCount = 0;
	
	//constructor
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		pokemonCount++;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
		System.out.println(pokemon.name + " fue actacado perdiendo 10 puntos\n" + "La salud de " + pokemon.name  + "ahora es de "+ pokemon.health);
	}
	
	//getter y setters
	public String getName() {
		return this.name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//getter contador de pokemones creados
	public static int getPokemonCount() {
		return pokemonCount;
	}


}	