package Model;
/*In this program we create the functions to calculate the arc of the parabola
Creadto: Juan Manuel Anacona 
Contact: 3204299106
Date: 8/08/2023
*/
public class M_ParabolaArc {
    public double CalcPArc(double JA_W_47, double JA_H_47){
        /*In this function we create the function that will allow us to calculate the arc of
        the parabola based on the mathematical equation.
        Parameters: W, H
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47, JA_P2_47, JA_P3_47, JA_X_47;
        
        JA_X_47 = JA_H_47/JA_W_47;
        JA_P1_47 = JA_X_47 + Math.sqrt(Math.pow(JA_X_47, 2) + (1.0 / 16.0));
        JA_P2_47 = Math.log(JA_P1_47) + Math.log(4);
        JA_P3_47 = Math.sqrt(Math.pow(JA_X_47, 2) + (1.0 / 16.0)) + (1.0 / (16.0 * JA_X_47)) * JA_P2_47;
        
        return 2*JA_W_47 * JA_P3_47;
    }
    
    public double CalcX(double JA_W_47, double JA_H_47){
        /*In this function we create the function that will allow us to calculate the arc of
        the parabola based on the mathematical equation.
        Parameters: W, H
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_H_47/JA_W_47;
    }
}
