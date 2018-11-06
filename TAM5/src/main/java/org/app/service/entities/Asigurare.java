package org.app.service.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class Asigurare {
	
Integer idAsigurare;
String denumire;
String tipAsigurare;
String detalii;
@ManyToOne
Angajat angajat;


}
