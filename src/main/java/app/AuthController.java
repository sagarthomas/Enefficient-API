package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.adt.UserADT;
import model.util.UserAuth;
/**
 * Spring Controller to create user account for the first time
 * @author Sagar Thomas
 *
 */
@RestController
public class AuthController {

	/**
	 * Mapped REST url path for creating a new user
	 * @param id The unique id given to a user passed as a URL argument
	 * @param email The email address for a user passed as a URL argument
	 * @return A UserADT instance containing the newly created user's information
	 */
	@RequestMapping("/auth")
	public UserADT auth(@RequestParam(value="id", defaultValue="") String id, @RequestParam(value="email", defaultValue="") String email) {
		return UserAuth.createAccount(id, email);
	}
}
