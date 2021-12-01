package developer.gettinghelp.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BandDTO {
	
	private String name;
	private String genre;
	private int year;
	private Map<String, String> musicians;

}
