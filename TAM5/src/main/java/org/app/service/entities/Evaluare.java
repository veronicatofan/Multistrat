package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Id;
@Entity
public class Evaluare {
@Id
Integer idEvaluare;
String denEvaluare;
String tipEvaluare;
@OneToMany
ArrayList<TestAngajat> testeAngajati=new ArrayList<TestAngajat>();
 
}
