package org.app.service.entities;

import javax.persistence.Entity;
@Entity
public class Post {
Integer idPost;
@ManyToOne
Functie functie;
@OneToOne;
Angajat angajat;
}
