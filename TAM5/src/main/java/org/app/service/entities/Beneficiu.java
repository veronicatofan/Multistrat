package org.app.service.entities;

import java.util.ArrayList;

public class Beneficiu {
Integer idBeneficiu;
String denBeneficiu;
Double procentBeneficiu;
@OneToMany
ArrayList<TestAngajat> testeAngajati=new ArrayList<TestAngajat>();


}
