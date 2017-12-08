package be.kdg.hiFresh.domain.recept;

import javafx.css.Size;
import org.threeten.extra.YearWeek;

import java.util.*;

/**
 * @author Jan de Rijke.
 * Weekaanbod met geordende recepten
 * Het eerste recept staat op plaats 1
 */


public class WeekAanbod {
	// TODO: implementeer klasse SAM
	//adhv model oplossing properties toevoegen
	private  YearWeek week;
	private double verkoopPrijsPerPersoon;
	private Map<Integer,Recept> recepten;

	public static final int SIZE =10;

  public WeekAanbod(YearWeek week, double prijs) {
	  // TODO SAM
	//constructor aanvullen
	  this.week =  week;
	  this.verkoopPrijsPerPersoon = prijs;
  }



	/**
	 *
	 * @param recept recept dat toegevoegd moet worden
	 * @param plaats plaats in de lijst. Eventueel bestaande recepten worden naar onder geshift
	 * @return Indien een recept uit de lijst valt omdat het voorbij de maximum size geshift wordt,
	 * wordt dit gereturned, anders returns null
	 */
	public Recept voegToe(Recept recept,int plaats){
		// TODO SAM

		//loopen door de map
		for (int key : recepten.keySet() ){
			//kijken of de key die je wilt toevoegen al bestaat
			if (key == plaats){
				//als die bestaat het element op die plaats verwijderen en in variable steken
				Recept r =recepten.get(key);
				recepten.remove(key);
				//nieuwe recept toevoegen
				recepten.put(plaats,recept);
				//de volgende elementen opschuiven
				for (int i =key; i <SIZE+1; i++){
					//het verwijderde recept in apparte var steken
					Recept toetevoegen =r;
					//de het volgend recept uit de map halen en in r steken maar eerst kijken of er een volgend element is ander null exeception en dan verwijderen
					if (recepten.get(i+1) != null){
						r=recepten.get(i+1);
						recepten.remove(i+1);
					}
					//het vorige loop verwijderde recept er terug in steken met +1 op de key
					recepten.put(i+1,toetevoegen);
					if (i+2 == SIZE && recepten.get(i+2)!= null){
						return r;
					}
				} return null;
			}
		}
		recepten.put(plaats,recept);
		return null;
	}
//return van null naar recepten aangepast
	public  Map<Integer,Recept>  getRecepten() {
		return recepten;
	}
}
