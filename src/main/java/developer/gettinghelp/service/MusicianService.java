package developer.gettinghelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import developer.gettinghelp.entity.Musician;
import developer.gettinghelp.repository.MusicianRepository;

@Service
public class MusicianService {
	
	private MusicianRepository repository;
	
	@Autowired
	public MusicianService(MusicianRepository repository) {
		this.repository = repository;
	}
	
	public List<Musician> findAll() {
		return repository.findAll();
	}
	
	public Musician findById(Long id) {
		return repository.findById(id)
				.orElseThrow(RuntimeException::new);
	}
	
	public Musician save(Musician newMusician) {
		return repository.save(newMusician);
	}
	
	public Musician update(Long id, Musician updateMusician) {
		Musician foundMusician = repository.findById(id)
				.orElseThrow(RuntimeException::new);
		foundMusician.setName(updateMusician.getName());
		foundMusician.setDoB(updateMusician.getDoB());
		
		return repository.save(foundMusician);
	}
	
	public void delete(Long id) {
		Musician foundMusician = repository.findById(id)
				.orElseThrow(RuntimeException::new);
		
		repository.delete(foundMusician);
	}

}
