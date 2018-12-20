package Com.washmail.washmail.models;

import javax.persistence.*;

@Entity
@Table(name = "cache")
public class Cache {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "cookies")
    private String cookies;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    public Cache() {
        // TODO Auto-generated constructor stub
    }

    public Cache(int id, String cache) {
        this.id = id;
        this.cookies = cookies;
    }

}
