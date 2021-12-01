package developer.gettinghelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import developer.gettinghelp.entity.Band;
import developer.gettinghelp.repository.BandRepository;

@Service
public class BandService {
	
	private BandRepository repository;
	
	@Autowired
	public BandService(BandRepository repository) {
		this.repository = repository;
	}
	
	public List<Band> findAll() {
		return repository.findAll();
	}
	
	public Band findById(Long id) {
		return repository.findById(id)
				.orElseThrow(RuntimeException::new);
	}
	
	public Band save(Band newBand) {
		return repository.save(newBand);
	}
	
	public Band update(Long id, Band updateBand) {
		Band foundBand = repository.findById(id)
				.orElseThrow(RuntimeException::new);
		foundBand.setName(updateBand.getName());
		foundBand.setGenre(updateBand.getGenre());
		foundBand.setYear(updateBand.getYear());
		
		return repository.save(foundBand);
	}
	
	public void delete(Long id) {
		Band foundBand = repository.findById(id)
				.orElseThrow(RuntimeException::new);
		
		repository.delete(foundBand);
	}

}
