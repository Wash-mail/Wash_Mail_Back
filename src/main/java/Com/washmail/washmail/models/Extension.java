package Com.washmail.washmail.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "extension")
public class Extension {
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nom")
	private String nom;
	
	@Column(name = "jour")
	private int jour;

	public Extension() {
		// TODO Auto-generated constructor stub
	}
	
	public Extension(Long id, String nom, int jour) {
		this.id = id;
		this.nom = nom;
		this.jour = jour;
	}

}
