package tech.samiayoub.app1.demo.entities;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String longitude;
    private String latitude;
    private String altitude;
    private String address;
    private String phone;
    private String description;
    private int numberOfSalles;

    @OneToMany
    private City city;

    @OneToMany(mappedBy = "cinema")
    private Collection<Salle> salles;

    public Cinema() {
    }
}
