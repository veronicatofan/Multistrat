package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
@Entity
public class Evaluare {
Integer idEvaluare;
String denEvaluare;
String tipEvaluare;
@OneToMany
ArrayList<TestAngajat> testeAngajati=new ArrayList<TestAngajat>();
 
}
