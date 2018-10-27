package com.application.model;

//Rank table
public class Rank {

	public int rank_id;
	public String rank;

	public Rank() {
		super();
	}

	public Rank(String rank) {
		super();
		this.rank = rank;
	}

	public Rank(int rank_id, String rank) {
		super();
		this.rank_id = rank_id;
		this.rank = rank;
	}

	public int getRank_id() {
		return rank_id;
	}

	public void setRank_id(int rank_id) {
		this.rank_id = rank_id;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		if (this.rank_id == 0)
			return "('" + this.getRank() + "')";
		else
			return "(" + this.getRank_id() + ",'" + this.getRank() + "')";
	}

}
