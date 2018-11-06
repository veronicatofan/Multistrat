package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
@Entity
public class Functie {
String idFunctie;
String denumireFunctie;
@OneToMany
ArrayList<Post> posturi=new ArrayList<Post>();
ManyToOne;
Departament departament;
}
