/*In this program the functions that will allow us to calculate the approximation factor according to the different creators are created.
Creadto: Juan Manuel Anacona 
Contact: 3204299106
Date: 8/08/2023
*/
package Model;

public class M_AproximationFactorials {
    public double CalcJS(double JA_X_47){
        /*In this function, the approximation factorial is calculated with the formula of James Striling
        Parameters: X
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */

        double JA_P1_47 = (1/(12*Math.pow(JA_X_47,1))) - (1/(360*Math.pow(JA_X_47,3))) + (1/(1260*Math.pow(JA_X_47,5))) - (1/(1680*Math.pow(JA_X_47,7)));

        double JA_P3_47 =Math.pow(Math.E, JA_P1_47);
        double JA_P4_47= Math.sqrt(2*Math.PI*JA_X_47)*Math.pow(JA_X_47/Math.E, JA_X_47);
        return JA_P4_47*JA_P3_47;
    }
    
    public double CalcGN(double JA_X_47){
        /*In this function, the approximation factorial is calculated with the formula of Gergo Nemes
        Parameters: X
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 = Math.pow(
            JA_X_47 + (1.0/12)*(1.0/JA_X_47) + (1.0/1440)*(1.0/Math.pow(JA_X_47, 3)) + (239.0/362880)*(1.0/Math.pow(JA_X_47, 5)),
            JA_X_47);
        double JA_P2_47= Math.pow(Math.E, -JA_X_47);
        double JA_P3_47 = Math.sqrt(2) * Math.sqrt(Math.PI * JA_X_47);
        return JA_P1_47 * JA_P2_47 * JA_P3_47;
    }
    
    public double CalcSR(double JA_X_47){
        /*In this function, the approximation factorial is calculated with the formula of Srinivasa Ramanujan
        Parameters: X
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 = 1 + (1.0/2)*(1.0/JA_X_47) + (1.0/8)*(1.0/Math.pow(JA_X_47, 2)) +
                          (1.0/240)*(1.0/Math.pow(JA_X_47, 3)) - (11.0/1920)*(1.0/Math.pow(JA_X_47, 4)) +
                          (79.0/26880)*(1.0/Math.pow(JA_X_47, 5));
        double JA_P2_47 = Math.sqrt(2) * Math.sqrt(Math.PI * JA_X_47) * Math.pow(JA_X_47, JA_X_47) * Math.pow(Math.E, -JA_X_47);
        return JA_P2_47*Math.pow(JA_P1_47, 1/6);
    }
    
    public double CalcW(double JA_X_47){
        /*In this function, the approximation factorial is calculated with the formula of Wehmeier
        Parameters: X
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 = Math.sqrt(2) * Math.sqrt(Math.PI * JA_X_47) * Math.pow(JA_X_47, JA_X_47) * Math.pow(Math.E, -JA_X_47);
        /*double JA_P2_47 = ((1.0/6)*(1/Math.pow(JA_X_47, 1))) + ((1/72)*(1/Math.pow(JA_X_47, 2))) - ((61/3480)*(1/Math.pow(JA_X_47, 2))) -
                ((139/15550)*(1/Math.pow(JA_X_47, 4))) + ((9871/6531840)*(1/Math.pow(JA_X_47, 5)));*/
        double JA_P2_47 = 1 + (1.0/6)*(1.0/JA_X_47) + (1.0/72)*(1.0/Math.pow(JA_X_47, 2)) -
                          (31.0/6480)*(1.0/Math.pow(JA_X_47, 3)) - (139.0/155520)*(1.0/Math.pow(JA_X_47, 4)) +
                          (9871.0/6531840)*(1.0/Math.pow(JA_X_47, 5));
        return JA_P1_47 * Math.sqrt(JA_P2_47);
    }
}
