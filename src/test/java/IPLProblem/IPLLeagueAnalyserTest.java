package IPLProblem;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

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


    
}
