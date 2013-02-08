public class SMA_Test{
	
	   public static void main(String[] args) {
	        double[] testData = {1,2,3,4,5,5,4,3,2,1};
	        int[] windowSizes = {9};
	        for (int windSize : windowSizes) {
	        	SMA ma = new SMA(windSize);
	            for (double x : testData) {
	                ma.newNum(x);
	                System.out.println("Next number = " + x + ", SMA = " + ma.getAvg());
	            }
	            System.out.println();
	        }
	    }
    }
