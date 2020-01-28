/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entry.project;

/**
 *
 * @author Chris
 */
public class fixFile {
    
    /**
     *
     * @param fname
     * @return
     */
    public static String methodFN(String fname)
    {
        String fixN = fname.replaceAll("[^a-zA-Z]", "");//removes spaces, numbers and simbols
        if(!validation.validName(fixN))
        {
            fixN = "Invalid First Name : " + fixN;
        }
        return fixN;
    }
    
    /**
     *
     * @param lname
     * @return
     */
    public static String methodLN(String lname)
    {
        String fixLn = lname.replaceAll("[^a-zA-Z]", "");//removes spaces, numbers and simbols
        if(!validation.validName(fixLn))
        {
            fixLn = "Invalid Last Name : " + fixLn;
        }
        return fixLn;
    }
    
    /**
     *
     * @param em
     * @return
     */
    public static String methodE(String em)
    {
        if (!validation.validEmail(em))//call validation method
        {
            em = "Invalid Email Address : " + em;
        }
        return em;
    }
    
    /**
     *
     * @param t
     * @return
     */
    public static String methodT(String t)
    {
        String fixT = t.replaceAll("[^a-zA-Z]", "");//removes spaces, numbers and simbols
        if (!validation.validName(fixT))//call validation method
        {
            fixT = "Invalid Town : " + fixT;
        }
        return fixT;
    }
    
    /**
     *
     * @param tnum
     * @return
     */
    public static String methodTN(String tnum)
    {
    String fixnum = tnum.replaceAll("[\\D]", "");//removes every character but integer
    //String check = fixnum
        if (!validation.validNumber(fixnum)){//call validation method
            fixnum = "Invalid Telephone Number : " + fixnum;
        }
        else if (fixnum.length()!=10);
        {
            fixnum ="Telephone Number must have exact 10 digits : " + fixnum;
        }
        return fixnum;
    }
}
