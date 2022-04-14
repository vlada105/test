package it.engineering.web.testapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mesto database table.
 * 
 */
@Entity
@NamedQuery(name="Mesto.findAll", query="SELECT m FROM Mesto m")
public class Mesto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String pttBroj;

	private String naziv;

	//bi-directional many-to-one association to Proizvodjac
	@OneToMany(mappedBy="mesto")
	private List<Proizvodjac> proizvodjacs;

	public Mesto() {
	}

	public String getPttBroj() {
		return this.pttBroj;
	}

	public void setPttBroj(String pttBroj) {
		this.pttBroj = pttBroj;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Proizvodjac> getProizvodjacs() {
		return this.proizvodjacs;
	}

	public void setProizvodjacs(List<Proizvodjac> proizvodjacs) {
		this.proizvodjacs = proizvodjacs;
	}

	public Proizvodjac addProizvodjac(Proizvodjac proizvodjac) {
		getProizvodjacs().add(proizvodjac);
		proizvodjac.setMesto(this);

		return proizvodjac;
	}

	public Proizvodjac removeProizvodjac(Proizvodjac proizvodjac) {
		getProizvodjacs().remove(proizvodjac);
		proizvodjac.setMesto(null);

		return proizvodjac;
	}

}