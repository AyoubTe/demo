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
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private int releaseYear;
    private String director;
    private String description;
    private String posterUrl;
    private double rating;
    private int duration; // in minutes
    private String language;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "movie")
    private Collection<ProjectionMovie> projectionMovie;
    
}
