
package model.util;

import app.ApplianceReturn;
import model.adt.*;

/**
 * This class contains a method which takes in a UserADT and calculates its energy usage score based on his/her house type
 * @author Matthew Dombrady
 */
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
			average += (0.0036) * Double.parseDouble(a.getConsumption());
			numberOfApps++;
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
		else if (-10 <= diff && diff <= 0)
			return 9;
		else if (-50 <= diff && diff <= -11)
			return 8;
		else if (-75 <= diff && diff <= -51)
			return 7;
		else if (-100 <= diff && diff <= -76)
			return 6;
		else if (-150 <= diff && diff <= -101)
			return 5;
		else if (-250 <= diff && diff <= -151)
			return 4;
		else if (-400 <= diff && diff <= -251)
			return 3;
		else if (-500 <= diff && diff <= -401)
			return 2;
		else if (-750 <= diff && diff <= -501)
			return 1;
		else if (diff <= -751)
			return 0;
		
		
		
		return 1;
					
	}

}
