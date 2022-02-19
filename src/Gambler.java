package workshop;

public class Gambler {

		    /*
	             * UC1 here taking variables and initializing it in the int data type
	            */
		    public static final int INITIAL_BET_STAKE = 100;
		    public static final int BET_AMT = 1;

		    /*
		    * UC2 Calling a method of gambler_SolutionUC2
		    */
		    public void gambler_SolutionUC2() {

		        double num = Math.floor(Math.random() * 10) % 2;	/*random function using to check either win or loose*/
			    
		        int remg_amt = INITIAL_BET_STAKE;
		        if (num == 0){
		            remg_amt += BET_AMT;
		            System.out.println("The Gambler wins the bet and he has $"
		                    + remg_amt + " with him after one bet.");
		        } else {
		            remg_amt -= BET_AMT;
				
		            System.out.println("The Gambler loses the bet and he has $"
		                    + remg_amt + " with him after one bet.");

		            public static void main (String[]args){
		                System.out.println("welcome to gambler simulator problem");
		            }
		        }
		    
		

	


