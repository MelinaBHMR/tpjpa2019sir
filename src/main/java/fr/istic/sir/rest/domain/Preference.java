package fr.istic.sir.rest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Preference {
	
	private long id;
	private String libelle;
	
	private List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();

	public Preference() {}
	
	public Preference(String libelle) {
		super();
		this.libelle = libelle;
	}



	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	@ManyToMany(mappedBy = "preferences")
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
}
