package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.adt.UserADT;
import model.util.UserAuth;

@RestController
public class AuthController {

	
	@RequestMapping("/auth")
	public UserADT auth(@RequestParam(value="id", defaultValue="") String id, @RequestParam(value="email", defaultValue="") String email) {
		return UserAuth.createAccount(id, email);
	}
}
