/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 * Test class for the bank system
 * @author Chilka Castro
 */
public class Test {
    public static void main(String[] args) {
        // Create users to be added to the bank
        Bank.addUser("Yi", "1234");
        Bank.addUser("Wang", "2345");
        Bank.addUser("Mike", "3456");
        
        // Create objects of ATM(AUTOMATED TELLER MACHINE)
        AutomatedTellerMachine a1 = new AutomatedTellerMachine();
        AutomatedTellerMachine a2 = new AutomatedTellerMachine();
        AutomatedTellerMachine a3 = new AutomatedTellerMachine();

        //System.out.println(Bank.getUsers());
        a1.pipeline();
       // System.out.println(Bank.getUsers().get(0).getHistory());
    }
}
