/**
 * @author Karunyan Krishnasamy
 *
 */

public class SMA {
	/**
	 * @param Simple Moving Average Indicator
	 */

	private int period;
//	TODO: variable to set color for indicator
	
//	Note that you will need to handle the start and end 
//	parts of the data since clearly you can't average 
//	the last 5 terms when you are on your 2nd data point. 
//	Also, there are more efficient ways of calculating this 
//	moving average(sum = sum - oldest + newest), but this is
//	to get the concept of what's happening across
//	
//	SAMPLE CODE
//	int data[] = getFilled();
//	int outdata[] = initializeme()
//	for (int y = 0; y < data.length; y++)
//	    int sum = 0;
//	    for (int x = y; x < y-5; x++)
//	        sum+=data[x];
//	    outdata[y] = sum / 5;
//	
//	
	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}
	
			
	
}
