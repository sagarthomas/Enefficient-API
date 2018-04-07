/**
 * This class contains a method which takes in a UserADT and calculates its energy usage score based on his/her house type
 * @author Matthew Dombrady
 */

package model.util;

import app.ApplianceReturn;
import model.adt.*;

public class CalculateScore {
	
	/**
	 * This method receives a UserADT as a parameter and calculates that user's energy score
	 * @param user A UserADT object corresponding to a user
	 */
	public static void calcScore(UserADT user) {
		
		// This array contains the average annual electricity usage (in gigajoules) for all seven house types in Ontario
		double[] houseScores = {34.7, 31.9, 25.3, 26.3, 27.1, 19.2, 26.3,};

		// These will be used to calculate the user's average electricity usage using all of his/her appliances
		double average = 0;
		int numberOfApps = 0;
		
		
		// This loop calculates the user's average energy usage
		for (ApplianceReturn a : user.getAppliances()) {
			average += Double.parseDouble(a.getConsumption());
		}
		
		// The average
		average = average/numberOfApps;
		
		
		
		// This switch statement assigns the user's energy score based on his/her house type
		// A separate score() method is used to calculate the actual number from 0 to 10
		switch(user.getHouseType()) {
		
		case 0:
			user.setScore(score(houseScores[0] - average));
			break;
			
		case 1:
			user.setScore(score(houseScores[1] - average));
			break;
			
		case 2:
			user.setScore(score(houseScores[2] - average));
			break;
			
		case 3:
			user.setScore(score(houseScores[3] - average));
			break;
			
		case 4:
			user.setScore(score(houseScores[4] - average));
			break;
			
		case 5:
			user.setScore(score(houseScores[5] - average));
			break;
		
		case 6:
			user.setScore(score(houseScores[6] - average));
			break;
		}
	}
	
	/**
	 * This method calculates a user's score from 0 to 10 based on the difference found in the above method
	 * @param diff The difference calculated in calcScore()
	 * @return The score from 0 to 10
	 */
	private static int score(double diff) {
				
		if (diff > 0)
			return 10;
		else if (-5 <= diff && diff <= 0)
			return 9;
		else if (-10 <= diff && diff <= -5)
			return 8;
		else if (-15 <= diff && diff <= -11)
			return 7;
		else if (-20 <= diff && diff <= -16)
			return 6;
		else if (-25 <= diff && diff <= -21)
			return 5;
		else if (-30 <= diff && diff <= -26)
			return 4;
		else if (-35 <= diff && diff <= -31)
			return 3;
		else if (-40 <= diff && diff <= -36)
			return 2;
		else if (-45 <= diff && diff <= -41)
			return 1;
		else if (diff <= -50)
			return 0;
		
		
		
		return 0;
					
	}

}
