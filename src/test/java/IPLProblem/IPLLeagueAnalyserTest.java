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
	public void MaximumNumberofSixesAndFours() throws IPLException {
		iplAnalyser.loadIPLBatsmenData(IPL_RUNS_FILEPATH);
		List<IPLRunsCSV> batsmenList = iplAnalyser.sortByBoundaries();
		assertEquals(batsmenList.get(0).playerName, "Andre Russell");
	}
}
