package com.apiconsulta.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiconsulta.models.City;
import com.apiconsulta.repositories.Repositories;


@Service
public class Services {

	@Autowired
	Repositories Repositories;

	public void lerCsv() throws IOException {
		Reader archiveCsv = null;
		archiveCsv = new FileReader(getClass().getClassLoader().getResource("cidades.csv").getFile());
		BufferedReader reader = new BufferedReader(archiveCsv);
		String line = null;
		reader.readLine();
		while ((line = reader.readLine()) != null) {
			String[] columns = line.split(",");
			City city = new City();
			city.setIdIbge(Integer.parseInt(columns[0]));
			city.setEstado(columns[1]);
			city.setNameCity(columns[2]);
			city.setCapital(Boolean.parseBoolean(columns[3]));
			city.setLongitude(new BigDecimal(columns[4]));
			city.setLatitude(new BigDecimal(columns[5]));
			city.setNoAccents(columns[6]);
			city.setAlternativeNames(columns[7]);
			city.setMicroRegion(columns[8]);
			city.setMesoregion(columns[9]);
			Repositories.save(city);
		}
	}
	
	public List<City> findCapital() {
        return Repositories.findCapital();
    }

//    public List<State> numberOfCityByState() {
//        return Repositories.numberOfCitiesByState();
//    }

    public City findByidIbge(Integer idIbge){
        return Repositories.findByIdIbge(idIbge);
    }

    public List<City> findCitiesByEstado(String uf) {
        return Repositories.findCitiesByEstado(uf);
    }


    public Integer totalNumberOfCities(){
       return Repositories.totalNumberOfCities();
    }

}
