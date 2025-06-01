package tech.samiayoub.app1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.samiayoub.app1.demo.entities.Cinema;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    // You can define custom query methods here if needed
}
