
public abstract class PokemonTest extends AbstractPokemon{

	public static void main (String[] args) {
		
		Pokedex poke = new Pokedex();
		Pokemon charmeleon = poke.createPokemon("Charmeleon", 50, "Fire");
		System.out.println(poke.pokemonInfo(charmeleon));
		Pokemon ninetales = poke.createPokemon("Ninetales", 80, "Fire");
		System.out.println(poke.pokemonInfo(ninetales));
		Pokemon nidorina = poke.createPokemon("Nidorina", 6, "Poison");
		System.out.println(poke.pokemonInfo(nidorina));
		nidorina.attackPokemon(charmeleon);
		System.out.println("-------------------------");
		System.out.println("Se han creado: "+ Pokemon.getPokemonCount() + " pokemones." + "\nSus nombres son: ");
		poke.listPokemon();
		
		
	}

}
