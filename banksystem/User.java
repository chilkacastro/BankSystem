/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

import java.util.ArrayList;
 
/**
 * Class for a bank user
 * @author Chilka Castro
 */
public class User {                                     // opening an account for a user
    private String userId;                              // java generate it
    private String userName;                            // person outside gives this
    private String password;                            // person gives this too
    private Account savingAccount;                      // Account class - object savingAccount
    private Account checkingAccount;                    // Account class - object checkingAccount
    private ArrayList<Record> history;
    private static int nextId = 1;

    /**
     * Default constructor
     */
    public User() {                                                                                 // useless default constructor if theres no name anyway
        this.userId = String.format("%06d", nextId++);
        this.userName = null;
        this.password = null;
        this.savingAccount = null;
        this.checkingAccount = null;
        this.history = null;       
    }
    
    /**
     * Constructor with two parameters
     * @param userName the name of the user
     * @param password the password of the user
     */
    public User(String userName, String password) {
        this.userId = String.format("%06d", nextId++);
        this.userName = userName;
        this.password = password;
        this.savingAccount = null;                                                                  // null at first unless u want to have later on client starting an account -> later on savings but now no
        this.checkingAccount = new Account();
        this.history = new ArrayList<>();                                                           // NEW HISTORY NOTHING INSIDE AT FIRST --> right now you only have a container
    }
    
    /**
     * Copy constructor
     * @param user the user to be copied
     */
    public User(User user) {
        this.userId = user.userId;
        this.userName = user.userName;
        this.password = user.password;
        this.savingAccount = new Account(savingAccount);                                            // objects 
        this.checkingAccount = new Account(checkingAccount);                                        // objects
        this.history = new ArrayList<>(history);                                                    // objects
    }

    /**
     * To check if two users are the same or not.
     * @param user the user to be compared with.
     * @return True if both users are the same and False if not.
     */
    public boolean equals(User user) {
        return this.userId.equals(user.userId) &&
            this.userName.equals(user.userName) &&
            this.password.equals(user.userId) &&
            this.savingAccount.equals(user.savingAccount) &&
            this.checkingAccount.equals(user.checkingAccount) &&
            this.history.equals(user.history);
    }
    
    /**
     * A string that represents the user.
     * @return the string that represents the user.
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-20s: %s\n", "User ID", userId);
        str += String.format("%-20s: %s\n", "User Name", userName);
        str += String.format("%-20s: %s\n", "Saving Account", savingAccount);
        str += String.format("%-20s: %s\n", "Checking Account", checkingAccount);
        str += String.format("%-20s: %s\n", "History", history);
        
        return str;
        
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(Account savingAccount) {
        this.savingAccount = savingAccount;
    }

    public Account getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(Account checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public ArrayList<Record> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Record> history) {
        this.history = history;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        User.nextId = nextId;
    }

}
