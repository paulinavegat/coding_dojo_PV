import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	
	private ArrayList <Pokemon> myPokemons=new ArrayList<Pokemon>();
	
	//constructor
	public Pokedex () {
		
	}
	
	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		System.out.println("Un nuevo Pokemon a la lista:");
		Pokemon poke = new Pokemon(name, health, type);
		myPokemons.add(poke);
		return poke;
	}


	@Override
	public void listPokemon() {
		for (int i = 0; i < myPokemons.size(); i++) {
			System.out.println(myPokemons.get(i).getName());
		}
	}

}