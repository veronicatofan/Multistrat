package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import static javax.persistence.CascadeType.ALL;
@Entity
public class Beneficiu {
@Id
Integer idBeneficiu;
String denBeneficiu;
Double procentBeneficiu;
@OneToMany(cascade = ALL, mappedBy = "beneficiu")
ArrayList<TestAngajat> testeAngajati=new ArrayList<TestAngajat>();
public Integer getIdBeneficiu() {
	return idBeneficiu;
}
public void setIdBeneficiu(Integer idBeneficiu) {
	this.idBeneficiu = idBeneficiu;
}
public String getDenBeneficiu() {
	return denBeneficiu;
}
public void setDenBeneficiu(String denBeneficiu) {
	this.denBeneficiu = denBeneficiu;
}
public Double getProcentBeneficiu() {
	return procentBeneficiu;
}
public void setProcentBeneficiu(Double procentBeneficiu) {
	this.procentBeneficiu = procentBeneficiu;
}
public ArrayList<TestAngajat> getTesteAngajati() {
	return testeAngajati;
}
public void setTesteAngajati(ArrayList<TestAngajat> testeAngajati) {
	this.testeAngajati = testeAngajati;
}
@Override
public String toString() {
	return "Beneficiu [idBeneficiu=" + idBeneficiu + ", denBeneficiu=" + denBeneficiu + ", procentBeneficiu="
			+ procentBeneficiu + ", testeAngajati=" + testeAngajati + "]";
}
public Beneficiu(Integer idBeneficiu, String denBeneficiu, Double procentBeneficiu) {
	super();
	this.idBeneficiu = idBeneficiu;
	this.denBeneficiu = denBeneficiu;
	this.procentBeneficiu = procentBeneficiu;
}
public Beneficiu() {
	super();
	// TODO Auto-generated constructor stub
}


 
}
