package Com.washmail.washmail.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telechargement")
public class Telechargement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "file")
	private String file;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return file;
	}

	public void setUrl(String file) {
		this.file = file;
	}

	public Telechargement() {
		// TODO Auto-generated constructor stub
	}
	
	public Telechargement(int id, String file) {
		this.id = id;
		this.file = file;
	}

}
