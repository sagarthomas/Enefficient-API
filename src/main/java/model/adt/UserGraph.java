package model.adt;

import java.util.ArrayList;

import model.util.Bag;

public class UserGraph {
	
	private final int V;
	private int E = 0;
	private Bag<UserADT>[] adj;
	
	public UserGraph(ArrayList<UserADT> users, int V) {
		this.V = V;
		adj = (Bag<UserADT>[]) new Bag[V];
		
		for (int v = 0; v < V; v++)
			adj[v] = new Bag<UserADT>();
		
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < users.size(); j++) {
				if (users.get(j).getHouseType() == i) {
					adj[i].add(users.get(j));
				}
			}
		}
		
	}
	
	public int V() {
		return this.V;
	}
	
	public Bag<UserADT> adj(int v) {
		return this.adj[v];
	}

}
