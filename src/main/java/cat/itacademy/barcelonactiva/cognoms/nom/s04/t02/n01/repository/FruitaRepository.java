package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FruitaRepository extends JpaRepository<Fruita, Long> {

}