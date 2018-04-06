/**
 * This class defines the graph of users to be used in Recommend.java
 * @author Matthew Dombrady
 */

package model.adt;

import java.util.ArrayList;

import model.util.Bag;


public class UserGraph {
	
	private final int V;
	private int E = 0;
	private Bag<UserADT>[] adj;
	
	/**
	 * This constructor creates a UserGraph
	 * @param users An array list of users
	 * @param V the numeber of elements in the adjacency array; corresponds to the number of house types there are
	 */
	public UserGraph(ArrayList<UserADT> users, int V) {
		this.V = V;
		adj = (Bag<UserADT>[]) new Bag[V];
		
		for (int v = 0; v < V; v++)
			adj[v] = new Bag<UserADT>();
		
		// This loop goes through every user, checks their house type, and adds them to the corresponding place
		// in the adjacency array
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < users.size(); j++) {
				if (users.get(j).getHouseType() == i) {
					adj[i].add(users.get(j));
				}
			}
		}
		
	}
	
	/**
	 * Accessor for number of vertices
	 * @return Number of vertices
	 */
	public int V() {
		return this.V;
	}

	/**
	 * Accessor for an array list in the adjacency array 
	 * @param v The index of the array list to return
	 * @return The array list corresponding to v
	 */
	public Bag<UserADT> adj(int v) {
		return this.adj[v];
	}

}
