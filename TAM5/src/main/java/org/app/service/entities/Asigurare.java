package org.app.service.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
@Entity
public class Asigurare {
	
@Id
Integer idAsigurare;
String denumire;
String tipAsigurare;
String detalii;
@ManyToOne
Angajat angajat;
public Integer getIdAsigurare() {
	return idAsigurare;
}
public void setIdAsigurare(Integer idAsigurare) {
	this.idAsigurare = idAsigurare;
}
public String getDenumire() {
	return denumire;
}
public void setDenumire(String denumire) {
	this.denumire = denumire;
}
public String getTipAsigurare() {
	return tipAsigurare;
}
public void setTipAsigurare(String tipAsigurare) {
	this.tipAsigurare = tipAsigurare;
}
public String getDetalii() {
	return detalii;
}
public void setDetalii(String detalii) {
	this.detalii = detalii;
}
public Angajat getAngajat() {
	return angajat;
}
public void setAngajat(Angajat angajat) {
	this.angajat = angajat;
}
@Override
public String toString() {
	return "Asigurare [idAsigurare=" + idAsigurare + ", denumire=" + denumire + ", tipAsigurare=" + tipAsigurare
			+ ", detalii=" + detalii + ", angajat=" + angajat + "]";
}
public Asigurare(Integer idAsigurare, String denumire, String tipAsigurare, String detalii, Angajat angajat) {
	super();
	this.idAsigurare = idAsigurare;
	this.denumire = denumire;
	this.tipAsigurare = tipAsigurare;
	this.detalii = detalii;
	this.angajat = angajat;
}
public Asigurare() {
	super();
	// TODO Auto-generated constructor stub
}


}
