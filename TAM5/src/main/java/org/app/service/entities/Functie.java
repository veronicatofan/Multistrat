
package org.app.service.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import static javax.persistence.CascadeType.ALL;
@Entity
public class Functie {
@Id
String idFunctie;
String denumireFunctie;
@OneToMany(cascade = ALL, mappedBy = "functie")
ArrayList<Post> posturi=new ArrayList<Post>();
@ManyToOne
Departament departament;
public String getIdFunctie() {
	return idFunctie;
}
public void setIdFunctie(String idFunctie) {
	this.idFunctie = idFunctie;
}
public String getDenumireFunctie() {
	return denumireFunctie;
}
public void setDenumireFunctie(String denumireFunctie) {
	this.denumireFunctie = denumireFunctie;
}
public ArrayList<Post> getPosturi() {
	return posturi;
}
public void setPosturi(ArrayList<Post> posturi) {
	this.posturi = posturi;
}
public Departament getDepartament() {
	return departament;
}
public void setDepartament(Departament departament) {
	this.departament = departament;
}
@Override
public String toString() {
	return "Functie [idFunctie=" + idFunctie + ", denumireFunctie=" + denumireFunctie + ", posturi=" + posturi
			+ ", departament=" + departament + "]";
}
public Functie(String idFunctie, String denumireFunctie, Departament departament) {
	super();
	this.idFunctie = idFunctie;
	this.denumireFunctie = denumireFunctie;
	this.departament = departament;
}
public Functie() {
	super();
	// TODO Auto-generated constructor stub
}

}
