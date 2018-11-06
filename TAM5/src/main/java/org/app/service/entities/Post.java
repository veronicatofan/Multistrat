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
}

