package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import static javax.persistence.CascadeType.ALL;
@Entity
public class Evaluare {
@Id
Integer idEvaluare;
String denEvaluare;
String tipEvaluare;
@OneToMany(cascade = ALL, mappedBy = "evaluare")
ArrayList<TestAngajat> testeAngajati=new ArrayList<TestAngajat>();
public Integer getIdEvaluare() {
	return idEvaluare;
}
public void setIdEvaluare(Integer idEvaluare) {
	this.idEvaluare = idEvaluare;
}
public String getDenEvaluare() {
	return denEvaluare;
}
public void setDenEvaluare(String denEvaluare) {
	this.denEvaluare = denEvaluare;
}
public String getTipEvaluare() {
	return tipEvaluare;
}
public void setTipEvaluare(String tipEvaluare) {
	this.tipEvaluare = tipEvaluare;
}
public ArrayList<TestAngajat> getTesteAngajati() {
	return testeAngajati;
}
public void setTesteAngajati(ArrayList<TestAngajat> testeAngajati) {
	this.testeAngajati = testeAngajati;
}
@Override
public String toString() {
	return "Evaluare [idEvaluare=" + idEvaluare + ", denEvaluare=" + denEvaluare + ", tipEvaluare=" + tipEvaluare
			+ ", testeAngajati=" + testeAngajati + "]";
}
public Evaluare(Integer idEvaluare, String denEvaluare, String tipEvaluare) {
	super();
	this.idEvaluare = idEvaluare;
	this.denEvaluare = denEvaluare;
	this.tipEvaluare = tipEvaluare;
}
public Evaluare() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
