package info.crudpokemon.model;

public class PokemonAgua {
	private int idDexNacional;
	private String nombrePokemon;
	private String tipoPokemon;
	private double pesoPokemon;
	private double alturaPokemon;
	
	public PokemonAgua() {
		
	}
	public void setIdDexNacional(int idDexNacional)
	{
		this.idDexNacional=idDexNacional;
	}
	public int getIdDexNacional()
	{
		return idDexNacional;
	}
	public void setNombrePokemon(String nombrePokemon)
	{
		this.nombrePokemon=nombrePokemon;
	}
	public String getNombrePokemon()
	{
		return nombrePokemon;
	}
	public void setTipoPokemon(String tipoPokemon)
	{
		this.tipoPokemon=tipoPokemon;
	}
	public String getTipoPokemon()
	{
		return tipoPokemon;
	}
	public void setPesoPokemon(double pesoPokemon)
	{
		this.pesoPokemon=pesoPokemon;
	}
	public double getPesoPokemon()
	{
		return pesoPokemon;
	}
	public void setAlturaPokemon(double alturaPokemon)
	{
		this.alturaPokemon=alturaPokemon;
	}
	public double getAlturaPokemon()
	{
		return alturaPokemon;
	}
}
