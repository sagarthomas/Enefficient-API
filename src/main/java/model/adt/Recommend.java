package model.adt;

import model.util.Bag;

public class Recommend {
	
	private String currentUserId;
	private UserADT currentUser;
	private UserGraph G;
	private int userIndex;
	
	public Recommend(UserGraph G, String currentUserId) {
		this.G = G;
		this.currentUserId = currentUserId;
		this.currentUser = findUser();
	}
	
	private UserADT findUser() {
		for (int i = 0; i < G.V(); i++) {
			for (UserADT j : G.adj(i)) {
				if (j.getID() == this.currentUserId) {
					this.userIndex = i;
					return j;
				}
			}
		}
		
		return null;
	}
	
	private ApplianceADT recommendAppliance() {
		
		Bag<UserADT> options = G.adj(this.userIndex);
		
		for (UserADT i : options)
			if (this.currentUser.getScore() < )
			
	}

}
