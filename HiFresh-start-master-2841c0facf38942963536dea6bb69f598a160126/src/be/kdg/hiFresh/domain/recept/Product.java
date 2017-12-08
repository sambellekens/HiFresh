package be.kdg.hiFresh.domain.recept;


import be.kdg.foundation.qualified.Hoeveelheid;

import java.time.MonthDay;
import java.util.logging.Logger;
/**
 * @author Jan de Rijke.
 */
public class Product {

	// TODO: implementeer klasse SAM
//4 properties toegevoegd adh van model oplossing
	private String naam;
	private MonthDay startHoogseizoen;
	private MonthDay eindeHoogseizoen;
	private Hoeveelheid eenheid;


	public Product(String naam,MonthDay startHoogseizoen,MonthDay eindeHoogseizoen, Hoeveelheid
		stdHoeveelheid) {
		// TODO SAM
//constructor aangevuld
		this.naam = naam;
		this.startHoogseizoen= startHoogseizoen;
		this.eindeHoogseizoen=eindeHoogseizoen;
		this.eenheid = stdHoeveelheid;

	}


	public Product(String naam, Hoeveelheid stdHoeveelheid) {
		// TODO SAM
		//constructor aangevuld
		this.naam = naam;
		this.eenheid = stdHoeveelheid;
	}



	public Hoeveelheid getStandaardHoeveelheid (){
		// TODO SAM
		//return niet meer null gemaakt
		return eenheid;
	}


}
