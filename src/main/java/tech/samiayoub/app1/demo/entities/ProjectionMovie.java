package tech.samiayoub.app1.demo.entities;

import java.sql.Date;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ProjectionMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateProjection;
    private double prix;

    @ManyToOne
    private Salle salle;

    @OneToOne
    private Seance seance;
    
    @ManyToOne
    private Movie movie;

    @OneToMany(mappedBy = "projectionMovie")
    private Collection<Ticket> tickets;
}
