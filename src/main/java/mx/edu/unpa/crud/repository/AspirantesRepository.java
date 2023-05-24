package mx.edu.unpa.crud.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.unpa.crud.entity.Aspirantes;

@Repository
public interface AspirantesRepository extends JpaRepository<Aspirantes, Long> {

	

}
