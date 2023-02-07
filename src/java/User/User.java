/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author alexc
 */
public class User {
    
    public String username;
    public String password;
    
    public User() {}

    public User(String username, String password) {

            this.username = username;
            this.password = password; 
        }
    
    
    public static User login (String username, String password) {
         if (username.equals("abe") && password.equals("password")) {
             User abe = new User ("abe","password");
             return abe;
         }
         if (username.equals("barb") && password.equals("password")) {
             User barb = new User ("barb","password");
             return barb;
         }
         else return null;
    
    }
}
    
