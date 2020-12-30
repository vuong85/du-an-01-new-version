/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author nguye
 */
public class ThanhToan {
    private boolean MATT; 
    private String TENTT;

     @Override
    public String toString() {
        return this.TENTT;
    }

    public boolean isMATT() {
        return MATT;
    }

    public void setMATT(boolean MATT) {
        this.MATT = MATT;
    }


    public String getTENTT() {
        return TENTT;
    }

    public void setTENTT(String TENTT) {
        this.TENTT = TENTT;
    }

 

    
    
}
