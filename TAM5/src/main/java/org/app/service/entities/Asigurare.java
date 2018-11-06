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


}
