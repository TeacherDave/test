package calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huntd
 */
public class Calculator {
    private int fNumber;
    private int sNumber;

    /**
     * @return the fNumber
     */
    public int getfNumber() {
        return fNumber;
    }

    /**
     * @param fNumber the fNumber to set
     */
    public void setfNumber(int fNumber) {
        this.fNumber = fNumber;
    }

    /**
     * @return the sNumber
     */
    public int getsNumber() {
        return sNumber;
    }

    /**
     * @param sNumber the sNumber to set
     */
    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    } 
    /**
     * @author David Hunt
     * @return 
     */
    public int add() {
    
    
    return fNumber + sNumber;
    }
    
}
