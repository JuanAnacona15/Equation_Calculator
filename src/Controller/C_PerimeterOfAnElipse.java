package Controller;
 /*In this program we create the encapsulation section to store
the values ​​of the perimeter of an ellipse.
Creadto: Juan Manuel Anacona 
Contact: 3204299106
Date: 9/08/2023
*/
public class C_PerimeterOfAnElipse {
    // We declare the private variables
    private double JA_a_47, JA_b_47, JA_P_27;

    //Declare encapsulations
    public double getJA_a_47() {
        return JA_a_47;
    }

    public void setJA_a_47(double JA_a_47) {
        this.JA_a_47 = JA_a_47;
    }

    public double getJA_b_47() {
        return JA_b_47;
    }

    public void setJA_b_47(double JA_b_47) {
        this.JA_b_47 = JA_b_47;
    }

    public double getJA_P_47() {
        return JA_P_27;
    }

    public void setJA_P_47(double JA_P_27) {
        this.JA_P_27 = JA_P_27;
    }

    //Create the constructor
    public C_PerimeterOfAnElipse(double JA_a_47, double JA_b_47, double JA_P_47) {
        this.JA_a_47 = JA_a_47;
        this.JA_b_47 = JA_b_47;
        this.JA_P_27 = JA_P_47;
    }
   
}
