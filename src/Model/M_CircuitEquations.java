

package Model;
public class M_CircuitEquations {
    public double CalcRC(double JA_T_47, double JA_C_47, double JA_E_47, double JA_V_47){
        /*In this equation we calculate the charge and discharge of a resistor
        based on the charge and discharge equation.
        Parameters: T, C, E, V
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47= JA_C_47 * Math.log(JA_E_47/(JA_E_47-JA_V_47));
        return JA_T_47/JA_P1_47;
    }
    public double CalcRD(double JA_T_47, double JA_C_47, double JA_E_47, double JA_V_47){
        /*In this equation we calculate the charge and discharge time
        based on the charge and discharge equation.
        Parameters: T,C,E,V 
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47= JA_C_47 * Math.log(JA_E_47/JA_V_47);
        return JA_T_47/JA_P1_47;
    }
    public double CalcTC(double JA_R_47, double JA_C_47, double JA_E_47, double JA_V_47){
        /*In this function the charging time is calculated based on the equation.
        Parameters: T,C,E,V 
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_R_47*JA_C_47*Math.log(JA_E_47/(JA_E_47-JA_V_47));
    }
    public double CalcTD(double JA_R_47, double JA_C_47, double JA_E_47, double JA_V_47){
        /*In this function the dowload time is calculated based on the equation.
        Parameters: T,C,E,V 
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_R_47*JA_C_47*Math.log(JA_E_47/(JA_V_47));
    }
    public double CalcEC(double JA_T_47, double JA_R_47, double JA_C_47, double JA_V_47){
        /*In this function the dowload time is calculated based on the equation.
        Parameters: T,C,E,V 
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 = 1 - Math.pow(Math.E, -JA_T_47/(JA_R_47*JA_C_47));
        return JA_V_47/JA_P1_47;
    }
    public double CalcED(double JA_T_47, double JA_R_47, double JA_C_47, double JA_V_47){
        /*In this function we calculate the discharge voltage according to the mathematical equation.
        Parameters: T,C,E,V 
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        double JA_P1_47 = Math.pow(Math.E, -JA_T_47/(JA_R_47*JA_C_47));
        return JA_V_47/JA_P1_47;
    }
    
    public double CalcV(double JA_E_47, double JA_V_47){
        /*In this function we calculate the voltage across the capacitor in charge and 
        discharge according to the mathematical equation.
        Parameters: T,C,E,V 
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_E_47 - JA_V_47;
    }
    
    public double CalcI(double JA_R_47, double JA_V_47){
        /*In this function we calculate the i in charge and 
        discharge according to the mathematical equation.
        Parameters: T,C,E,V 
        Creadto: Juan Manuel Anacona 
        Contact: 3204299106
        Date: 8/08/2023
        */
        return JA_V_47 / JA_R_47;
    }
}