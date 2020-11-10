package com.apiconsulta.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.apiconsulta.models.entity.Entities;

import lombok.Data;

@Entity
@Table(name = "city")
@Data
public class City extends Entities{
	
	private static final long serialVersionUID = 1L;

		@Column(name = "ibge_id")
	    private Integer idIbge;

	    @Column(name = "uf")
	    private String estado;

	    @Column(name = "name")
	    private String nameCity;

	    private boolean capital;

	    @Column(name = "lon")
	    private BigDecimal longitude;

	    @Column(name = "lat")
	    private BigDecimal latitude;

	    @Column(name = "no_accents")
	    private String noAccents;

	    @Column(name = "alternative_names")
	    private String alternativeNames;

	    @Column(name = "microregion")
	    private String microRegion;

	    @Column(name = "mesoregion")
	    private String mesoregion;

	    @Column(name = "excluded")
	    private boolean excluded;

		public Integer getIdIbge() {
			return idIbge;
		}

		public void setIdIbge(Integer idIbge) {
			this.idIbge = idIbge;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getNameCity() {
			return nameCity;
		}

		public void setNameCity(String nameCity) {
			this.nameCity = nameCity;
		}

		public boolean isCapital() {
			return capital;
		}

		public void setCapital(boolean capital) {
			this.capital = capital;
		}

		public BigDecimal getLongitude() {
			return longitude;
		}

		public void setLongitude(BigDecimal longitude) {
			this.longitude = longitude;
		}

		public BigDecimal getLatitude() {
			return latitude;
		}

		public void setLatitude(BigDecimal latitude) {
			this.latitude = latitude;
		}

		public String getNoAccents() {
			return noAccents;
		}

		public void setNoAccents(String noAccents) {
			this.noAccents = noAccents;
		}

		public String getAlternativeNames() {
			return alternativeNames;
		}

		public void setAlternativeNames(String alternativeNames) {
			this.alternativeNames = alternativeNames;
		}

		public String getMicroRegion() {
			return microRegion;
		}

		public void setMicroRegion(String microRegion) {
			this.microRegion = microRegion;
		}

		public String getMesoregion() {
			return mesoregion;
		}

		public void setMesoregion(String mesoregion) {
			this.mesoregion = mesoregion;
		}

		public boolean isExcluded() {
			return excluded;
		}

		public void setExcluded(boolean excluded) {
			this.excluded = excluded;
		}

}
