package com.apiconsulta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiconsulta.models.City;
import com.apiconsulta.services.Services;


@RestController
@RequestMapping("/city")
public class Controllers {
	
	@Autowired
	Services service;
	
	 @RequestMapping(value = "/csvToImport", method = RequestMethod.POST)
	    public @ResponseBody ResponseEntity<?> importCsv(){
	        try{
	        	service.lerCsv();
	            return ResponseEntity.ok().build();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }

	    @RequestMapping(value = "/capital", method = RequestMethod.GET)
	    public ResponseEntity<?> findCapital(){
	        try{
	            List<City> capital = service.findCapital();
	            return ResponseEntity.ok(capital);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }


//	    @RequestMapping(value = "/numberOfCityByState", method = RequestMethod.GET)
//	    public ResponseEntity<?> numberOfCityByState(){
//	        try{
//	            List<State> states = service.numberOfCityByState();
//	            return ResponseEntity.ok(states);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//	    }

	    @RequestMapping(value = "/findByIdIbge/{idIbge}", method = RequestMethod.GET)
	    public ResponseEntity<?> findByIdIbge(@PathVariable(value = "idIbge") Integer idIbge){
	        try{
	           City city = service.findByidIbge(idIbge);
	           return ResponseEntity.ok(city);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }

	    @RequestMapping(value = "/citiesByState/{uf}", method = RequestMethod.GET)
	    public ResponseEntity<?> citiesByState(@PathVariable(value = "uf") String uf){
	        try{
	            List<City> cities = service.findCitiesByEstado(uf);
	            return ResponseEntity.ok(cities);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }

	    @RequestMapping(value = "/totalNumberOfCities", method = RequestMethod.GET)
	    public ResponseEntity<?> totalNumberOfCities(){
	        try{
	           Integer total = service.totalNumberOfCities();
	            return ResponseEntity.ok(total);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	    }


}
