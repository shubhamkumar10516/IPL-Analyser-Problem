package IPLProblem;

import com.opencsv.bean.CsvBindByName;

public class IPLWicketsCSV {
	@CsvBindByName(column = "PLAYER")
	public String playerName;
	
	@CsvBindByName(column = "Runs")
	public int totalRuns;
	
	@CsvBindByName(column = "Avg")
	public double bowlingAverage;
	
	@CsvBindByName(column = "SR")
	public double strikeRate;
	
}
