package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
@Entity
public class TestAngajat {

@Id
Integer idTestAngajat;
@ManyToOne
Angajat angajat;
Evaluare evaluare;
Double scor;
Date dataTest;
@ManyToOne
Beneficiu beneficiu;

public Integer getIdTestAngajat() {
	return idTestAngajat;
}

public void setIdTestAngajat(Integer idTestAngajat) {
	this.idTestAngajat = idTestAngajat;
}

public Angajat getAngajat() {
	return angajat;
}

public void setAngajat(Angajat angajat) {
	this.angajat = angajat;
}

public Evaluare getEvaluare() {
	return evaluare;
}

public void setEvaluare(Evaluare evaluare) {
	this.evaluare = evaluare;
}

public Double getScor() {
	return scor;
}

public void setScor(Double scor) {
	this.scor = scor;
}

public Date getDataTest() {
	return dataTest;
}

public void setDataTest(Date dataTest) {
	this.dataTest = dataTest;
}

public Beneficiu getBeneficiu() {
	return beneficiu;
}

public void setBeneficiu(Beneficiu beneficiu) {
	this.beneficiu = beneficiu;
}

public TestAngajat(Integer idTestAngajat, Angajat angajat, Evaluare evaluare, Double scor, Date dataTest,
		Beneficiu beneficiu) {
	super();
	this.idTestAngajat = idTestAngajat;
	this.angajat = angajat;
	this.evaluare = evaluare;
	this.scor = scor;
	this.dataTest = dataTest;
	this.beneficiu = beneficiu;
}

@Override
public String toString() {
	return "TestAngajat [idTestAngajat=" + idTestAngajat + ", angajat=" + angajat + ", evaluare=" + evaluare + ", scor="
			+ scor + ", dataTest=" + dataTest + ", beneficiu=" + beneficiu + "]";
}

public TestAngajat() {
	super();
	// TODO Auto-generated constructor stub
}


}

