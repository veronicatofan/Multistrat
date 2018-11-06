package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Departament {
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
