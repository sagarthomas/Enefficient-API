package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	
	@RequestMapping("/version")
	public AppDetails version() {
		
		return new AppDetails();
	}
}
