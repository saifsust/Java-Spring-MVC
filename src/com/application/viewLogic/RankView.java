package com.application.viewLogic;

import java.util.List;

import com.application.model.Rank;

public class RankView {

	private static String out;

	public static String printRank(List<Rank> ranks) {

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

	public static String rankForm() {
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

}
