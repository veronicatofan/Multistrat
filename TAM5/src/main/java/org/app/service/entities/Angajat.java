package org.app.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Angajat {

@Id
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
@ManyToOne
Departament departament;
@OneToMany
List<Asigurare> asigurari = new ArrayList<Asigurare>();
@OneToMany
List<Departament> departamente = new ArrayList<Departament>();
@OneToMany
List<TestAngajat> testeAngajati = new ArrayList<TestAngajat>();
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
public Departament getDepartament() {
	return departament;
}
public void setDepartament(Departament departament) {
	this.departament = departament;
}


}
