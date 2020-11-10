package com.apiconsulta.services;

import com.apiconsulta.models.City;

public abstract class BDServices {
	
	 protected abstract City addCity(City city);
	 protected abstract void deleteCity(Integer idCity);

}
