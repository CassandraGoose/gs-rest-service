package converter;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {
	
	private static final String template = "Successful GET made, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/converter")
	public Converter converter(@RequestParam(value="name", defaultValue="Human") String name) {
		return new Converter(counter.incrementAndGet(),
				String.format(template,  name));
	}
	
	@PostMapping("/converter")
	public Converter convert(@RequestBody Converter convert) {
		//do the stuff here to convert
		return new Converter(counter.incrementAndGet(),
				String.format("POST made."));
				
	}
}