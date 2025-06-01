package tech.samiayoub.app1.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Ticket {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)             
    private Long id;
    private double prix;
    private String nomClient;
    private String codePaiement;
    private boolean isReserved;

    private Place place;

    @ManyToOne
    private ProjectionMovie projectionMovie;
}
