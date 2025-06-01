package tech.samiayoub.app1.demo.entities;

import java.util.Collection;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    private int population;

    @OneToMany(mappedBy = "city")
    private Collection<Cinema> cinemas;

    public City() {
    }

}
