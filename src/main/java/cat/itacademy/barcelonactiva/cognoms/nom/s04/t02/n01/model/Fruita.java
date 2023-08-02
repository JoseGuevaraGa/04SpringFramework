package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Table(name = "fruita")
@Entity
@Getter
@Setter
@ToString

public class Fruita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //@Column(name = "ID")
    //private int id;

    @Column(name = "NOM")
    private String nom;

    @Column(name = "QUANTITATQUILOS")
    private int quantitatQuilos;


    public Fruita(long id, String nom, int quantitatQuilos) {
        this.id = id;
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    @Override
    public String toString() {
        return "Fruita [id=" + id + ", nom=" + nom + ", Quantitat Quilos=" + quantitatQuilos + "]";
    }

}

