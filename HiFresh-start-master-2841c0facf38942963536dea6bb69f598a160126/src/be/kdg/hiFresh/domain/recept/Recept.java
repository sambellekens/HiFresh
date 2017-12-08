package be.kdg.hiFresh.domain.recept;


import java.sql.Timestamp;
import java.time.Duration;
import java.util.*;
import java.util.logging.Logger;
/**
 * @author Jan de Rijke.
 */
public class Recept {
	// TODO: implementeer klasse SAM
//adhv modeloplossing properties toegevoegd
	private String naam;
	private Duration bereidingstijd;
	private int moeilijkheidsgraad;
	private List<String> gerechtInstructies;
	//adhv de constructor propertie toevoegen
	private List<Ingredient> ingredienten;
	//property voor het label
	private Label label;




	public Recept(
		String naam,
		Duration bereidingsTijd,
		int moeilijkheid,
		List<String> instructies,
		List<Ingredient> ingredienten
	) {
		//constructor geadd
	this.naam = naam;
	this.bereidingstijd = bereidingsTijd;
	this.moeilijkheidsgraad = moeilijkheid;
	this.gerechtInstructies = instructies;
	this.ingredienten = ingredienten;

	}

	public void addLabel(Label label) {
		//TODO SAM
this.label = label;
	}


	public String getNaam() {
		//TODO SAM
		return naam;
	}
}
