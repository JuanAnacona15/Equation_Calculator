package Controller;
/*In this program we create the encapsulation section to store
the values ​​of the private variables of the approximation factorials.
Creadto: Juan Manuel Anacona 
Contact: 3204299106
Date: 9/08/2023
*/
public class C_AproximationFactorials {
    // We declare the private variables
    private double JA_X_47,JA_JS_47, JA_GN_47, JA_SR_47, JA_W_47;
    
    //Declare encapsulations
    public double getJA_X_47() {
        return JA_X_47;
    }

    public void setJA_X_47(double JA_X_47) {
        this.JA_X_47 = JA_X_47;
    }

    public double getJA_JS_47() {
        return JA_JS_47;
    }

    public void setJA_JS_47(double JA_JS_47) {
        this.JA_JS_47 = JA_JS_47;
    }

    public double getJA_GN_47() {
        return JA_GN_47;
    }

    public void setJA_GN_47(double JA_GN_47) {
        this.JA_GN_47 = JA_GN_47;
    }

    public double getJA_SR_47() {
        return JA_SR_47;
    }

    public void setJA_SR_47(double JA_SR_47) {
        this.JA_SR_47 = JA_SR_47;
    }

    public double getJA_W_47() {
        return JA_W_47;
    }

    public void setJA_W_47(double JA_W_47) {
        this.JA_W_47 = JA_W_47;
    }
    
    //Create the constructor
    public C_AproximationFactorials(double JA_X_47, double JA_JS_47, double JA_GN_47, double JA_SR_47, double JA_W_47) {
        this.JA_X_47 = JA_X_47;
        this.JA_JS_47 = JA_JS_47;
        this.JA_GN_47 = JA_GN_47;
        this.JA_SR_47 = JA_SR_47;
        this.JA_W_47 = JA_W_47;
    }
}
