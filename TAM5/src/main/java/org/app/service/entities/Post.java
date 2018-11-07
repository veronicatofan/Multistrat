package org.app.service.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Post {
@Id
Integer idPost;
@ManyToOne
Functie functie;
Integer marcaAngajat;
public Integer getIdPost() {
	return idPost;
}
public void setIdPost(Integer idPost) {
	this.idPost = idPost;
}
public Functie getFunctie() {
	return functie;
}
public void setFunctie(Functie functie) {
	this.functie = functie;
}
public Integer getMarcaAngajat() {
	return marcaAngajat;
}
public void setMarcaAngajat(Integer marcaAngajat) {
	this.marcaAngajat = marcaAngajat;
}
@Override
public String toString() {
	return "Post [idPost=" + idPost + ", functie=" + functie + ", marcaAngajat=" + marcaAngajat + "]";
}
public Post(Integer idPost, Functie functie, Integer marcaAngajat) {
	super();
	this.idPost = idPost;
	this.functie = functie;
	this.marcaAngajat = marcaAngajat;
}
public Post() {
	super();
	// TODO Auto-generated constructor stub
}

}

