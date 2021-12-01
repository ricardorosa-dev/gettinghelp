package developer.gettinghelp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import developer.gettinghelp.entity.Musician;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, Long>{
	
	Musician findByName(String name);

}
