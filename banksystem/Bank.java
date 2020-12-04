/*
 * bank now contain all of them
 */
package banksystem;

import java.util.ArrayList;

/**
 * Class of a bank
 * @author Chilka Castro
 */
public class Bank {
    private static ArrayList<AutomatedTellerMachine> atms = new ArrayList<>();
    private static ArrayList<User> users = new ArrayList<>();                    // since static -> all data members should be static too

    /**
     * To add a new user to the user list
     * @param userName the name of the user
     * @param password the pin/password of the user
     */      
    public static void addUser(String userName, String password) {
        users.add(new User(userName, password));                                // adding a user to the arraylist
    }

    public static ArrayList<User> getUsers() {                                  // public-> people can use this to get the user
        return users;
    }
}
