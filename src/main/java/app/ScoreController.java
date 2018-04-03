package app;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import model.adt.UserADT;
import model.util.CalculateScore;

@RestController
public class ScoreController {
	
	private ArrayList<UserADT> users;

	@RequestMapping("/score")
	public double score(@RequestParam(value="id", defaultValue="000") String id) {
		users = null;
		
		for (UserADT u : users) {
			if (u.getID().equals(id)) {
				return u.getScore();
			}
		}
		
		return 0.0;
	}
}
