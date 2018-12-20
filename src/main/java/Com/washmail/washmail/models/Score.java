package Com.washmail.washmail.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "score")
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "nombre")
	private int nombre;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	public Score(int id, int nombre) {
		this.id = id;
		this.nombre = nombre;
	}

}
