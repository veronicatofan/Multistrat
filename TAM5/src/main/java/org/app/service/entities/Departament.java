package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id; 

@Entity
public class Departament {
 @Id
String idDepartament;
 String denDepartamnet;
 Integer nrAngajati;
 Integer marcaSef;
 @OneToMany
 ArrayList<Angajat> angajati=new ArrayList<Angajat>();
 @OneToMany
 ArrayList<Functie> functii=new ArrayList<Functie>();
@ManyToOne
Angajat angajat;
}
