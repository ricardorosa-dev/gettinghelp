package developer.gettinghelp.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import developer.gettinghelp.dto.MusicianDTO;
import developer.gettinghelp.entity.Musician;
import developer.gettinghelp.service.MusicianService;

@RestController
@RequestMapping("/musician")
public class MusicianController {
	
	private MusicianService service;
	
	@Autowired
	public MusicianController(MusicianService service) {
		this.service = service;
	}
	
	@GetMapping
	public List<MusicianDTO> findAll() {
		return service.findAll().stream()
				.map(this::toMusicianDTO)
				.collect(Collectors.toList());
	}
	
	@GetMapping("/{id}")
	public MusicianDTO findById(@PathVariable("id") Long id) {
		return this.toMusicianDTO(service.findById(id));
	}
	
	@PostMapping
	public MusicianDTO save(@RequestBody Musician newMusician) {
		return this.toMusicianDTO(service.save(newMusician));
	}
	
	@PutMapping("/{id}")
	public Musician update(
			@PathVariable("id") Long id, 
			@RequestBody Musician updateMusician) {
		return service.update(id, updateMusician);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
	
	private MusicianDTO toMusicianDTO(Musician musician) {
		MusicianDTO dto = new MusicianDTO();
		dto.setName(musician.getName());
		dto.setDoB(musician.getDoB());
		
		return dto;
	}

}
