package app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.ApplicationDetails;
import model.adt.UserADT;
import model.util.MongoAdapter;

/**
 * Spring MVC controller that returns the the details of a specific user given their Id
 * @author Sagar Thomas
 *
 */
@RestController
public class UserController {
	
	/**
	 * Spring MVC Mapped method
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/users/{id}")
	public UserADT user(@PathVariable String id) {
		try {
			MongoAdapter adapter = new MongoAdapter(ApplicationDetails.USERS_DB);
			UserADT user = adapter.getUser(id);
			adapter.close();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
