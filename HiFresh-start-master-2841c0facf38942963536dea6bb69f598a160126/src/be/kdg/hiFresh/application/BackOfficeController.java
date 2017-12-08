package be.kdg.hiFresh.application;


import be.kdg.foundation.operatie.Operatie;
import be.kdg.foundation.operatie.Sort;
import be.kdg.hiFresh.domain.recept.*;

import java.util.*;

/**
 * @author Jan de Rijke.
 */
// Dit is de controllerklasse van het BackOffice subsysteem
public class BackOfficeController {

	private static int WEEK_PAGE_SIZE = 2; 	// Constante die vastlegt hoeveel weken weekaanbod wordt teruggegeven.


	public BackOfficeController() {} //TODO indien nodig

	public List<WeekAanbod> getLijstWeekaanbod() {
		// TODO
		return null; //placeholder om compileerbaar te maken
	}

	public Map<Recept, Double> zoekRecepten(
		int jaar, int week, List<Operatie>
		filter,
		List<Sort> sorter
	) {
		// TODO
		return null; //placeholder om compileerbaar te maken
	}

}
