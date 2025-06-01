package tech.samiayoub.app1.demo.entities;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int nbPlaces;

    @ManyToOne
    private Cinema cinema;

    @OneToMany(mappedBy = "salle")
    private Collection<Place> places;

    @OneToMany(mappedBy = "salle")
    private Collection<ProjectionMovie> projectionMovies;

}
