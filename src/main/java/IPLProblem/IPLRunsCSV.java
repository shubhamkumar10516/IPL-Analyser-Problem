package IPLProblem;

import com.opencsv.bean.CsvBindByName;

public class IPLRunsCSV {
	
	@CsvBindByName(column = "PLAYER")
	public String playerName;
	
	@CsvBindByName(column = "Runs")
	public int totalRuns;
	
	@CsvBindByName(column = "Avg")
	public double battingAverage;
	
	@CsvBindByName(column = "SR")
	public double strikeRate;
	
	@CsvBindByName(column = "6s")
	public int noOfSixes;
	
	@CsvBindByName(column = "4s")
	public int noOfFours;
	
	@CsvBindByName(column = "100")
	public int noOf100s;
	
	@Override
	public String toString() {
		return playerName;
	}
}
