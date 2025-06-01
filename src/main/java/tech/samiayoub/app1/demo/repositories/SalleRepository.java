package tech.samiayoub.app1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.samiayoub.app1.demo.entities.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long> {
    // You can define custom query methods here if needed
    
}
