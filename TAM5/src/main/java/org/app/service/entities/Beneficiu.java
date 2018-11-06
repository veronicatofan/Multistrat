package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Id;
@Entity
public class Beneficiu {
@Id
Integer idBeneficiu;
String denBeneficiu;
Double procentBeneficiu;
@OneToMany
ArrayList<TestAngajat> testeAngajati=new ArrayList<TestAngajat>();

 
}
