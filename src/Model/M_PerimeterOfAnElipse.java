package Model;
public class M_PerimeterOfAnElipse {
    public double Calc_PE(double JA_a_47, double JA_b_47){
        /*In this function we calculate the perimeter of an ellipse based on the mathematical formula
        Parameters: Heigt, Whidt.
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        
        //Declaration of double type variables
        double N=5, JA_P1_47,JA_P2_47,JA_P3_47,JA_P5_47, JA_h_47;
        double JA_P4_47 = 0;
        
        // Declaration of an array of type double
        double[] S0 = new double[6];
        double[] S1 = new double[6];
        double[] S2 = new double[6];
        double[] S3 = new double[6];
        double[] S4 = new double[6];
        double[] S5 = new double[6];
        double[] S6 = new double[6];

        // We assign the values ​​of the array S1
        S1[1] = 1;
        S1[2] = 3;
        S1[3] = 4;
        S1[4] = 7;
        S1[5] = 8;
        
        // We assign the values ​​of the array S2
        S2[1] = 1;
        S2[2] = 1;
        S2[3] = 1;
        S2[4] = 5;
        S2[5] = 7;
        
        //We make the initial calculations
        JA_P1_47 = JA_a_47 + JA_b_47;
        JA_P2_47 = JA_a_47 - JA_b_47;
        JA_P3_47 = Math.PI * JA_P1_47;
        JA_h_47 = Math.pow(JA_P2_47,2) / Math.pow(JA_P1_47,2);
        
        //We do the summation
        for (int i = 1; i <= 5; i++) {
            S0[i]=i;
            S3[i]= Math.pow(4, S1[i]);
            S4[i]= Math.pow(JA_h_47, S0[i]);
            S5[i]=(S2[i]*S2[i])*S4[i];
            S6[i]=S5[i]/S3[i];
            JA_P4_47 = JA_P4_47 + S6[i];
        }        
        JA_P5_47 = 1+JA_P4_47;
        //We return the value of the perimeter
        return JA_P3_47 * JA_P5_47;
    }
}
