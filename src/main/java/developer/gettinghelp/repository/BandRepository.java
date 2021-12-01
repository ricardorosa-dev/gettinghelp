package developer.gettinghelp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import developer.gettinghelp.entity.Band;

@Repository
public interface BandRepository extends JpaRepository<Band, Long>{
	
	Optional<Band> findByName(String name);

}
