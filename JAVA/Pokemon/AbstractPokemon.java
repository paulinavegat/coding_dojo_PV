public abstract class AbstractPokemon implements PokemonInterface{
	
	public abstract Pokemon createPokemon(String name, int health, String type); 
	
	public String pokemonInfo (Pokemon pokemon) {
		return ("Name: " + pokemon.getName() + "\nHealth: " + pokemon.getHealth() + "\nType: " + pokemon.getType());
	}
	
	public abstract void listPokemon();

}