package org.app.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Angajat {
@Id
@GeneratedValue(strategy = AUTO)
Integer marcaAngajat;
Integer nrContract;
Integer CNP;
Integer numarCI;
String serieCI;
String stare;
String numePrenume;
String adresa;
Integer telefon;
Double salariu;
Integer idPost;
String idDepartament;

@OneToMany
private List<Asigurare> asigurari = new ArrayList<Asigurare>();

public Integer getMarcaAngajat() {
	return marcaAngajat;
}

public void setMarcaAngajat(Integer marcaAngajat) {
	this.marcaAngajat = marcaAngajat;
}

public Integer getNrContract() {
	return nrContract;
}

public void setNrContract(Integer nrContract) {
	this.nrContract = nrContract;
}

public Integer getCNP() {
	return CNP;
}

public void setCNP(Integer cNP) {
	CNP = cNP;
}

public Integer getNumarCI() {
	return numarCI;
}

public void setNumarCI(Integer numarCI) {
	this.numarCI = numarCI;
}

public String getSerieCI() {
	return serieCI;
}

public void setSerieCI(String serieCI) {
	this.serieCI = serieCI;
}

public String getStare() {
	return stare;
}

public void setStare(String stare) {
	this.stare = stare;
}

public String getNumePrenume() {
	return numePrenume;
}

public void setNumePrenume(String numePrenume) {
	this.numePrenume = numePrenume;
}

public String getAdresa() {
	return adresa;
}

public void setAdresa(String adresa) {
	this.adresa = adresa;
}

public Integer getTelefon() {
	return telefon;
}

public void setTelefon(Integer telefon) {
	this.telefon = telefon;
}

public Double getSalariu() {
	return salariu;
}

public void setSalariu(Double salariu) {
	this.salariu = salariu;
}

public Integer getIdPost() {
	return idPost;
}

public void setIdPost(Integer idPost) {
	this.idPost = idPost;
}

public String getIdDepartament() {
	return idDepartament;
}

public void setIdDepartament(String idDepartament) {
	this.idDepartament = idDepartament;
}

public List<Asigurare> getAsigurari() {
	return asigurari;
}

public void setAsigurari(List<Asigurare> asigurari) {
	this.asigurari = asigurari;
}

}
