/**
 * @author Matthew Dombrady
 * @brief This class is a Spring MVC controller for generating fake users for testing purposes
 */

package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import model.util.FakeUsers;

@RestController
public class FakeUsersController {
	
	
	@RequestMapping("\fake")
	public void fake() {
		FakeUsers fakeUsers = new FakeUsers();
	}
}
