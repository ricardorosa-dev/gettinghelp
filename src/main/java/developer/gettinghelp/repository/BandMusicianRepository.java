package developer.gettinghelp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import developer.gettinghelp.entity.BandMusician;
import developer.gettinghelp.entity.BandMusiciansId;

@Repository
public interface BandMusicianRepository extends JpaRepository<BandMusician, BandMusiciansId>{

}
