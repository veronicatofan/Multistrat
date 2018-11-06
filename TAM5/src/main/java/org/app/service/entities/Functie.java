
package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;
@Entity
public class Functie {
@Id
String idFunctie;
String denumireFunctie;
@OneToMany
ArrayList<Post> posturi=new ArrayList<Post>();
@ManyToOne
Departament departament;
}
