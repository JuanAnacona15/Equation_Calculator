package Controller;
public class C_ParabolaArc {
 /*In this program we create the encapsulation section to store
the values ​​of the arc of a parabola.
Creadto: Juan Manuel Anacona 
Contact: 3204299106
Date: 9/08/2023
*/

    // We declare the private variables
    private double JA_H_47, JA_W_47, JA_Arc_47, JA_X_47;

    //Declare encapsulations
    public double getJA_H_47() {
        return JA_H_47;
    }

    public void setJA_H_47(double JA_H_47) {
        this.JA_H_47 = JA_H_47;
    }

    public double getJA_W_47() {
        return JA_W_47;
    }

    public void setJA_W_47(double JA_W_47) {
        this.JA_W_47 = JA_W_47;
    }

    public double getJA_Arc_47() {
        return JA_Arc_47;
    }

    public void setJA_Arc_47(double JA_Arc_47) {
        this.JA_Arc_47 = JA_Arc_47;
    }

    public double getJA_X_47() {
        return JA_X_47;
    }

    public void setJA_X_47(double JA_X_47) {
        this.JA_X_47 = JA_X_47;
    }

    //Create the constructor
    public C_ParabolaArc(double JA_H_47, double JA_W_47, double JA_Arc_47, double JA_X_47) {
        this.JA_H_47 = JA_H_47;
        this.JA_W_47 = JA_W_47;
        this.JA_Arc_47 = JA_Arc_47;
        this.JA_X_47 = JA_X_47;
    }
    
}
