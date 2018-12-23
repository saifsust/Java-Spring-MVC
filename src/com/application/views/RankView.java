package com.application.views;

import java.util.List;
import java.util.Map;

import com.application.interfaces.View;
import com.application.model.Rank;

public class RankView implements View<Rank>{

	private static String out;

	public  String view(List<Rank> ranks) {

		out = "<table class ='table' >";
		out += printTwoColumnTableHeader("Rank");
		out += "<tbody>";
		for (Rank rank : ranks) {
			out += "<tr>";
			out += "<td>" + rank.getRank_id() + "</td>";
			out += "<td>" + rank.getRank() + "</td>";
			out += "</tr>";

		}
		out += "</tbody>";
		out += "</table>";
		return out;

	}

	public  String form() {
		out = "<form method = 'POST' modelAttribute='rank' action ='uploadRank' >";
		out += "<div class = 'form-group' >";
		out += "<input class = 'form-control' type = 'text' name = 'rank' placeholder = 'rank'/>";
		out += "</div>";
		out += "<input type = 'submit' name='submit' class = 'btn primary-btn' />";
		out += "</form>";
		return out;
	}

	protected static String printTwoColumnTableHeader(String header) {
		out = "	<thead>" + "<th>Serial No.</th>" + "<th>" + header + "</th>" + "</thead>";
		return out;
	}

	@Override
	public String view(Map<String, Object> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String view_table(List<Rank> models) {
		// TODO Auto-generated method stub
		return null;
	}

}
