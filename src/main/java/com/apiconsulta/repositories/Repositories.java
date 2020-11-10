package com.apiconsulta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.apiconsulta.models.City;

@Repository
public interface Repositories extends JpaRepository<City, Integer> {

	@Query("SELECT c FROM City c WHERE c.capital = TRUE " + "ORDER BY c.nameCity ")
	List<City> findCapital();


	@Query("Select c From City c WHERE c.idIbge = ?1")
	public City findByIdIbge(Integer idIbge);

	@Query("Select c From City c WHERE c.estado = ?1")
	public List<City> findCitiesByEstado(String uf);

	@Query("Select COUNT (Distinct c) From City c ")
	public Integer totalNumberOfCities();

}
