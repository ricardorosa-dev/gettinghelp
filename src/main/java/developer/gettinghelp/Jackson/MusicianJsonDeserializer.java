package developer.gettinghelp.Jackson;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import developer.gettinghelp.entity.Musician;
import developer.gettinghelp.repository.BandRepository;

public class MusicianJsonDeserializer extends JsonDeserializer<Musician>{

	private final BandRepository bandRepository;

	@Autowired
	public MusicianJsonDeserializer(BandRepository bandRepository) {
	    this.bandRepository = bandRepository;
	}
	
	@Override
	public Musician deserialize(JsonParser p, DeserializationContext ctxt) 
	        throws IOException, JacksonException {
	    
	    ObjectCodec codec = p.getCodec();
	    JsonNode root = codec.readTree(p);
	    
	    Musician musician = new Musician();
	    musician.setName(root.get("name").asText());
	    
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    musician.setDoB(LocalDate.parse(root.get("DoB").asText(), formatter));
	    
	    if (root.get("bands") != null) {
	        // TODO Stuck here!
	    	System.out.println(root.get("bands").asText());
	    }
	    
	    return musician;
	}
}