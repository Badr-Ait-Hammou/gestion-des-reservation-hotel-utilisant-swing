/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package front;

/**
 *
 * @author Badr
 */

class Model_LineCH {
String nch;
double nbrch;
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getNch() {
        return nch;
    }

    public double getNbrch() {
        return nbrch;
    }

    public Model_LineCH(String nch, double nbrch) {
        this.nch = nch;
        this.nbrch = nbrch;
    }
    
}
