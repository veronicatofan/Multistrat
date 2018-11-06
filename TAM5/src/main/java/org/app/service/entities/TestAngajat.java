package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
@Entity
public class TestAngajat {

@Id
Integer idTestAngajat;
Integer marcaAngajat;
Integer idEvaluare;
Double scor;
Date dataTest;
@ManyToOne
Beneficiu idBeneficiu ;
}

