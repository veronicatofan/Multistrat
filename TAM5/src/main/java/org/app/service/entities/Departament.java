package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import static javax.persistence.CascadeType.ALL; 

@Entity
public class Departament {
 @Id
String idDepartament;
 String denDepartament;
 Integer nrAngajati;
 Integer marcaSef;
 @OneToMany(cascade = ALL, mappedBy = "departament")
 ArrayList<Angajat> angajati=new ArrayList<Angajat>();
 @OneToMany(cascade = ALL, mappedBy = "departament")
 ArrayList<Functie> functii=new ArrayList<Functie>();
@ManyToOne
Angajat angajat;
public String getIdDepartament() {
	return idDepartament;
}
public void setIdDepartament(String idDepartament) {
	this.idDepartament = idDepartament;
}
public String getDenDepartament() {
	return denDepartament;
}
public void setDenDepartament(String denDepartament) {
	this.denDepartament = denDepartament;
}
public Integer getNrAngajati() {
	return nrAngajati;
}
public void setNrAngajati(Integer nrAngajati) {
	this.nrAngajati = nrAngajati;
}
public Integer getMarcaSef() {
	return marcaSef;
}
public void setMarcaSef(Integer marcaSef) {
	this.marcaSef = marcaSef;
}
public ArrayList<Angajat> getAngajati() {
	return angajati;
}
public void setAngajati(ArrayList<Angajat> angajati) {
	this.angajati = angajati;
}
public ArrayList<Functie> getFunctii() {
	return functii;
}
public void setFunctii(ArrayList<Functie> functii) {
	this.functii = functii;
}
public Angajat getAngajat() {
	return angajat;
}
public void setAngajat(Angajat angajat) {
	this.angajat = angajat;
}
@Override
public String toString() {
	return "Departament [idDepartament=" + idDepartament + ", denDepartament=" + denDepartament + ", nrAngajati="
			+ nrAngajati + ", marcaSef=" + marcaSef + ", angajati=" + angajati + ", functii=" + functii + ", angajat="
			+ angajat + "]";
}

public Departament(String idDepartament, String denDepartament, Integer nrAngajati, Integer marcaSef, Angajat angajat) {
	super();
	this.idDepartament = idDepartament;
	this.denDepartament = denDepartament;
	this.nrAngajati = nrAngajati;
	this.marcaSef = marcaSef;
	this.angajat = angajat;
}
public Departament() {
	super();
	// TODO Auto-generated constructor stub
}

}
