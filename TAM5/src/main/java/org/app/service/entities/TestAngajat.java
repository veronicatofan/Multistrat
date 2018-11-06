package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class TestAngajat {
@ManyToOne
Angajat angajat;
Double scor;
Date dataTest;
@OneToOne
Beneficiu beneficiu;
@ManyToOne
Evaluare evaluare;
}
