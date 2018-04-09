package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Returns the details of this API
 * @author Sagar Thomas
 *
 */
@RestController
public class VersionController {

	/**
	 * Controller for returning app details
	 * @return AppDetails
	 */
	@RequestMapping(value = {"/version", "/"})
	public AppDetails version() {
		
		return new AppDetails();
	}
}
