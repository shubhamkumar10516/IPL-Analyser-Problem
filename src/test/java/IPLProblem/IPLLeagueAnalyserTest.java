package IPLProblem;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;

public class IPLLeagueAnalyserTest {
	
	public static final String IPL_RUNS_FILEPATH = "/home/shubham/Desktop/IPLProblem/src/test/resources/WP_DP_Data_01_IPL2019FactsheetMostRuns.csv";
	public static final String IPL_WICKETS_FILEPATH = "/home/shubham/Desktop/IPLProblem/src/test/resources/WP_DP_Data_02_IPL2019FactsheetMostWkts.csv";
	IPLAnalyser iplAnalyser;
    @Before
	public void intitializeTest() {
		iplAnalyser = new IPLAnalyser();
		ExpectedException exceptionRule = ExpectedException.none();
		exceptionRule.expect(IPLException.class);
	}
    
    @Test
	public void highestBattingAverageBatsmentest() throws IPLException {
		iplAnalyser.loadIPLBatsmenData(IPL_RUNS_FILEPATH);
		List<IPLRunsCSV> batsmenList = iplAnalyser.sortByBattingAverage();
		assertEquals(batsmenList.get(0).playerName, "MS Dhoni");
	}

    @Test
	public void highestStrikeRateBatsmentest() throws IPLException {
		iplAnalyser.loadIPLBatsmenData(IPL_RUNS_FILEPATH);
		List<IPLRunsCSV> batsmenList = iplAnalyser.highestStrikeRate();
		assertEquals(batsmenList.get(0).playerName, "Ishant Sharma");
	}
    
    @Test
	public void maximumNumberofSixesAndFours() throws IPLException {
		iplAnalyser.loadIPLBatsmenData(IPL_RUNS_FILEPATH);
		List<IPLRunsCSV> batsmenList = iplAnalyser.sortByBoundaries();
		assertEquals(batsmenList.get(0).playerName, "Andre Russell");
	}
    
    @Test
	public void bestStrikingAndNumberofSixesAndFours() throws IPLException {
		iplAnalyser.loadIPLBatsmenData(IPL_RUNS_FILEPATH);
		List<IPLRunsCSV> batsmenList = iplAnalyser.sortByBoundaries();
		iplAnalyser.loadIPLBatsmenData(IPL_RUNS_FILEPATH);
		List<IPLRunsCSV> batsmenList1 = iplAnalyser.highestStrikeRate();
		assertEquals(batsmenList1.get(0).playerName, "MS Dhoni");
	}
    
    @Test
	public void maxRunsThenBestAverage() throws IPLException {
		iplAnalyser.loadIPLBatsmenData(IPL_RUNS_FILEPATH);
		List<IPLRunsCSV> batsmenList = iplAnalyser.sortByMaximumRunsAndAverage();
		assertEquals(batsmenList.get(0).playerName, "David Warner ");
	}
 
    @Test
	public void sortByBestBowlingAverage() throws IPLException {
		iplAnalyser.loadIPLBowlerData(IPL_WICKETS_FILEPATH);
		List<IPLWicketsCSV> bowlerList = iplAnalyser.sortByBowlingAverage();
		assertEquals(bowlerList.get(0).playerName, "Krishnappa Gowtham");
	}
    
    @Test
	public void sortByBestStrikeRate() throws IPLException {
		iplAnalyser.loadIPLBowlerData(IPL_WICKETS_FILEPATH);
		List<IPLWicketsCSV> bowlerList = iplAnalyser.sortByBowlingStrikeRate();
		assertEquals(bowlerList.get(0).playerName, "Krishnappa Gowtham");
	}
    
    @Test
	public void sortByBestEconomy() throws IPLException {
		iplAnalyser.loadIPLBowlerData(IPL_WICKETS_FILEPATH);
		List<IPLWicketsCSV> bowlerList = iplAnalyser.sortByBowlingEconomy();
		assertEquals(bowlerList.get(0).playerName, "Shivam Dube");
	}
	
    @Test
	public void sortByBestStrikeRateAnd4w5w() throws IPLException {
		iplAnalyser.loadIPLBowlerData(IPL_WICKETS_FILEPATH);
		IPLWicketsCSV bowler = iplAnalyser.sortByBowlingStrikeRateAnd5w();
		assertEquals(bowler.playerName, "Alzarri Joseph");
	}
    
    @Test
	public void sortByBestBowlingAvgRateAndStrikeRate() throws IPLException {
		iplAnalyser.loadIPLBowlerData(IPL_WICKETS_FILEPATH);
		IPLWicketsCSV bowler = iplAnalyser.sortByBestBowlingAvgRateAndStrikeRate();
		assertEquals(bowler.playerName, "Anukul Roy");
	}
    
    @Test
	public void sortByMostWicketsAvg() throws IPLException {
		iplAnalyser.loadIPLBowlerData(IPL_WICKETS_FILEPATH);
		IPLWicketsCSV bowler = iplAnalyser.sortByBestBowlingAvgRateAndStrikeRate();
		assertEquals(bowler.playerName, "Anukul Roy");
	}
}
