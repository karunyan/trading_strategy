/**
 * @author http://rosettacode.org/wiki/Averages/Simple_moving_average#Java
 *
 */

import java.util.LinkedList;
import java.util.Queue;

public class SMA {
	/**
	 * @param Simple Moving Average Indicator
	 *            
	 */

	private final int period;
	private final Queue<Double> window = new LinkedList<Double>();
	private double sum;

	public SMA(int period) {
		assert (period > 0) : "Period must be positive integer";
		this.period = period;
	}

	public void newNum(double num) {
		sum += num;
		window.add(num);
		if (window.size() > period) {
			sum -= window.remove();
		}
	}

	public double getAvg() {
		if (window.isEmpty() || window.size() < period) {
			return -1; // Do not plot indicator value
		} else {
			return sum / period;
		}
	}

}
