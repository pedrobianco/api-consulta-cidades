package com.apiconsulta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiconsulta.models.City;
import com.apiconsulta.repositories.Repositories;

@Service
public class BDServicesImpl extends BDServices{
	
	 	@Autowired
	 	Repositories Repositories;

	    @Override
	    public City addCity(City city) {
	            createCity(city);
	            Repositories.save(city);
	            return city;
	        }
	    	
	    @Override
	    public void deleteCity(Integer idCity) {
	    	Repositories.deleteById(idCity);
	    }

	    private void createCity(City city) {
	        city.setIdIbge(city.getIdIbge());
	        city.setEstado(city.getEstado());
	        city.setNameCity(city.getNameCity());
	        city.setCapital(false);
	        city.setLongitude(city.getLongitude());
	        city.setLatitude(city.getLatitude());
	        city.setNoAccents(city.getNoAccents());
	        city.setAlternativeNames(city.getAlternativeNames());
	        city.setMicroRegion(city.getAlternativeNames());
	        city.setMesoregion(city.getMesoregion());

	    }

}
