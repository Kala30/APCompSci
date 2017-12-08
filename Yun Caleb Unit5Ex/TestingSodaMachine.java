
/**
 * Method for testing SodaMachine class
 * 
 * @author Caleb Yun
 * @version Created on 12/6/2017
 */
public class TestingSodaMachine
{
    public static void main(String[] args)
    {
        // Simulate using a "real" soda machine
        SodaMachine myMachine = new SodaMachine(500, 5); // Sodas cost 500 cents and 5 sodas in machine
        //SodaMachine myMachine = new SodaMachine(500, 5); // Sodas cost 75 cents, 200 sodas inside
        
        myMachine.insertMoney(200);
        myMachine.buySoda();
        myMachine.insertMoney(1000);
        myMachine.buySoda();
        
        System.out.println("Total cents: " + myMachine.getTotalMoney());
        System.out.println("Sodas left: " + myMachine.getNumberOfSodas());
        System.out.println("Balance: " + myMachine.getBalance());
        
        myMachine.buySoda();
        
        System.out.println("Total cents: " + myMachine.getTotalMoney());
        System.out.println("Sodas left: " + myMachine.getNumberOfSodas());
        System.out.println("Balance: " + myMachine.getBalance());
        
        myMachine.refundBalance();
        System.out.println("Balance after refund: " + myMachine.getBalance());
    }
}
