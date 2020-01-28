/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entry.project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Chris
 */
public class validation {
    
    /**
     *
     * @param m
     * @return
     */
    public static boolean validEmail(String m)//validate if the email address has the corect pattern
    {
        String emailCheck = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat = Pattern.compile(emailCheck,Pattern.CASE_INSENSITIVE);
        Matcher match = emailPat.matcher(m);
        return match.find();
    }
    
    /**
     *
     * @param n
     * @return
     */
    public static boolean validNumber(String n)//validate the telephone number after the fix
    {
        return "69".equals(n.substring(0, 2));
         
    }
    
    /**
     *
     * @param na
     * @return
     */
    public static boolean validName(String na)//validate FirstName, LastName, Town (It won't be needed)
    {
        return Pattern.matches("[a-zA-Z]+", na);
    }
}
